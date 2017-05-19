import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class TTT extends Applet implements Runnable {
	
	private static final long serialVersionUID = 1L;
	public static final Dimension size = new Dimension(450, 450);
	private Graphics doubleG;
	private Image offScreen;
	private Rectangle[][] boxes = new Rectangle[3][3];
	private boolean[][] inBoxes = new boolean[3][3];
	private int[][] state = new int[3][3];
	private int mx = 0, my = 0;
	private Image cross, tick;
	private URL url;
	private boolean AIT;
	private ArrayList<Integer> moves;
	private AI AI;
	private Rectangle playAgain;
	private boolean gameOver;
	private boolean stopped;//@formatter:off		ROW ONE DONE
    private int[][][] endStates = {{{1,1,-1},{1,-1,0},{-1,0,0}},{{1,1,-1},{0,-1,1},{-1,0,0}},{{1,1,-1},{-1,-1,1},{1,1,-1}},{{1,1,-1},{-1,-1,-1},{1,1,0}},
            {{1,1,-1},{-1,-1,-1},{1,0,1}},{{1,1,-1},{0,-1,0},{-1,1,0}},{{1,1,-1},{0,-1,0},{-1,0,1}},{{1,-1,1},{1,-1,0},{0,-1,0}},{{1,-1,1},{0,-1,1},{0,-1,0}},
            {{1,-1,1},{0,-1,0},{1,-1,0}},{{1,-1,1},{-1,-1,1},{1,1,-1}},{{1,-1,1},{-1,-1,-1},{1,1,0}},{{1,-1,1},{-1,-1,-1},{0,1,1}},{{1,-1,1},{1,-1,1},{-1,-1,0}},
            {{1,0,-1},{1,-1,1},{-1,0,0}},{{1,0,-1},{1,-1,0},{-1,1,0}},{{1,0,-1},{1,-1,0},{-1,0,1}},{{1,1,-1},{1,-1,1},{-1,0,-1}},{{1,-1,1},{1,-1,1},{-1,1,-1}},
            {{1,-1,1},{0,-1,1},{1,-1,-1}},{{1,1,0},{-1,-1,-1},{1,0,0}},{{1,0,1},{-1,-1,-1},{1,0,0}},{{1,-1,1},{-1,-1,1},{1,-1,0}},{{1,-1,0},{-1,-1,1},{1,-1,1}},
            {{1,1,-1},{1,-1,0},{-1,1,-1}},{{1,1,-1},{0,-1,1},{-1,1,-1}},{{1,0,-1},{1,-1,1},{-1,1,-1}},{{1,1,-1},{0,-1,-1},{1,1,-1}},{{1,1,0},{-1,-1,-1},{1,1,-1}},
            {{1,1,-1},{1,-1,0},{-1,-1,1}},{{1,1,-1},{0,-1,1},{-1,-1,1}},{{1,1,-1},{1,-1,-1},{1,-1,1}},{{-1,1,1},{1,-1,0},{0,0,-1}},{{-1,1,1},{0,-1,1},{0,0,-1}},
            {{-1,1,1},{0,-1,0},{1,0,-1}},{{-1,1,1},{0,-1,0},{0,1,-1}},{{-1,1,0},{1,-1,1},{0,0,-1}},{{-1,1,0},{1,-1,0},{1,0,-1}},{{-1,1,0},{1,-1,0},{0,1,-1}},
            {{-1,1,-1},{1,-1,1},{-1,0,1}},{{-1,1,-1},{1,-1,1},{1,-1,1}},{{0,1,-1},{1,-1,1},{-1,0,0}},{{-1,1,-1},{1,-1,1},{1,0,-1}},{{0,1,-1},{0,-1,1},{-1,0,1}},
            {{-1,1,-1},{0,-1,1},{1,1,-1}},{{-1,1,-1},{1,-1,0},{1,1,-1}},{{0,1,-1},{1,-1,-1},{1,1,-1}},{{1,1,-1},{-1,-1,1},{1,-1,1}},{{1,1,0},{-1,-1,-1},{0,1,0}},
            {{0,1,1},{-1,-1,-1},{0,1,0}},{{1,1,-1},{1,-1,-1},{0,1,-1}},{{-1,1,1},{1,-1,-1},{0,1,-1}},{{0,1,0},{-1,-1,-1},{1,1,0}},{{0,1,0},{-1,-1,-1},{1,1,0}},
            {{-1,1,1},{1,-1,-1},{-1,1,1}},{{-1,1,1},{-1,-1,-1},{1,0,1}},{{-1,1,1},{-1,-1,-1},{0,1,1}},{{-1,1,-1},{1,-1,0},{-1,1,1}},{{1,-1,0},{0,-1,1},{0,-1,1}},
            {{-1,1,-1},{0,-1,1},{-1,1,1}},{{-1,1,1},{1,-1,-1},{1,-1,1}},{{-1,1,1},{-1,-1,0},{-1,1,1}},{{1,-1,1},{1,-1,-1},{-1,1,1}},{{1,-1,1},{1,-1,0},{-1,-1,1}},
            {{-1,1,1},{1,-1,1},{-1,0,-1}},{{-1,1,1},{1,-1,0},{-1,1,-1}},{{1,0,1},{1,-1,1},{-1,-1,-1}},{{0,1,1},{1,-1,1},{-1,-1,-1}},{{-1,0,1},{1,-1,1},{-1,1,-1}},
            {{1,-1,1},{1,-1,1},{0,-1,-1}},{{-1,0,1},{1,-1,1},{0,0,-1}},{{-1,0,1},{0,-1,1},{1,0,-1}},{{-1,0,1},{0,-1,1},{0,1,-1}},{{0,1,1},{-1,-1,-1},{1,0,0}},
            {{-1,1,1},{-1,-1,1},{1,0,-1}},{{-1,0,1},{-1,-1,1},{1,1,-1}},{{0,0,1},{-1,-1,-1},{1,0,1}},{{1,0,1},{-1,-1,-1},{0,1,0}},{{-1,1,1},{0,-1,1},{-1,1,-1}},
            {{1,0,1},{-1,-1,-1},{-1,1,1}},{{0,1,1},{-1,-1,-1},{-1,1,1}},{{1,0,1},{-1,-1,-1},{0,0,1}},{{0,1,1},{-1,-1,-1},{0,0,1}},{{1,-1,1},{1,-1,-1},{0,-1,1}},
            {{0,-1,1},{1,-1,-1},{1,-1,1}},{{0,0,1},{-1,-1,-1},{0,1,1}},{{1,-1,0},{1,-1,1},{0,-1,0}},{{0,-1,1},{1,-1,1},{0,-1,0}},{{0,-1,0},{1,-1,1},{1,-1,0}},
            {{1,-1,-1},{1,-1,1},{-1,1,1}},{{0,-1,0},{1,-1,1},{0,-1,1}},{{0,1,0},{-1,-1,-1},{0,1,1}},{{0,1,-1},{1,-1,0},{-1,1,0}},{{0,0,-1},{1,-1,1},{-1,1,0}},
            {{0,0,-1},{1,-1,0},{-1,1,1}},{{-1,-1,-1},{1,-1,1},{1,0,1}},{{-1,1,1},{1,1,0},{-1,-1,-1}},{{-1,1,1},{0,1,1},{-1,-1,-1}},{{-1,1,1},{-1,1,0},{-1,-1,1}},
            {{-1,1,1},{1,1,-1},{-1,-1,1}},{{-1,1,-1},{1,1,-1},{1,-1,1}},{{-1,1,-1},{-1,1,1},{1,-1,1}},{{-1,1,1},{-1,1,-1},{1,-1,1}},{{-1,1,0},{-1,1,1},{-1,-1,1}},
            {{-1,1,1},{-1,1,0},{-1,0,0}},{{-1,0,1},{-1,1,1},{-1,0,0}},{{-1,-1,1},{1,1,-1},{-1,1,1}},{{-1,0,1},{-1,1,0},{-1,1,0}},{{-1,0,1},{-1,1,0},{-1,0,1}},
            {{-1,1,-1},{1,1,-1},{1,0,-1}},{{-1,0,-1},{1,1,-1},{1,1,-1}},{{-1,-1,-1},{1,1,-1},{1,0,1}},{{-1,1,0},{-1,1,1},{-1,0,0}},{{-1,-1,-1},{-1,1,1},{1,1,0}},
            {{-1,-1,-1},{-1,1,1},{1,0,1}},{{-1,-1,-1},{1,1,0},{1,0,0}},{{-1,-1,-1},{0,1,1},{1,0,0}},{{-1,-1,-1},{0,1,0},{1,1,0}},{{-1,-1,-1},{0,1,0},{1,0,1}},
            {{-1,-1,1},{-1,1,1},{-1,1,0}},{{-1,-1,1},{-1,1,0},{-1,1,1}},{{-1,-1,-1},{1,1,0},{0,1,0}},{{-1,-1,-1},{0,1,1},{0,1,0}},{{-1,-1,-1},{0,1,0},{0,1,1}},
            {{-1,1,0},{-1,1,0},{-1,0,1}},{{-1,0,0},{-1,1,1},{-1,0,1}},{{-1,0,0},{-1,1,0},{-1,1,1}},{{-1,-1,-1},{1,1,-1},{1,1,0}},{{0,1,-1},{0,-1,1},{-1,1,0}},
            {{1,1,-1},{1,-1,1},{-1,-1,0}},{{0,1,-1},{1,-1,1},{-1,-1,1}},{{-1,1,0},{0,-1,1},{0,1,-1}},{{-1,0,0},{1,-1,1},{0,1,-1}},{{-1,0,0},{0,-1,1},{1,1,-1}},
            {{1,0,-1},{0,-1,1},{-1,0,1}},{{0,0,-1},{1,-1,1},{-1,0,1}},{{0,-1,-1},{1,-1,1},{1,-1,1}},{{1,0,0},{-1,-1,-1},{1,1,0}},{{1,0,0},{-1,-1,-1},{1,0,1}},
            {{-1,1,1},{1,-1,-1},{1,0,-1}},{{-1,0,1},{1,-1,-1},{1,1,-1}},{{-1,0,1},{1,-1,0},{1,0,-1}},{{-1,0,0},{1,-1,1},{1,0,-1}},{{-1,0,0},{1,-1,0},{1,1,-1}},
            {{-1,-1,1},{1,-1,0},{1,-1,1}},{{-1,-1,0},{1,-1,1},{1,-1,1}},{{1,0,1},{-1,-1,-1},{1,1,-1}},{{-1,1,0},{0,-1,0},{1,1,-1}},{{-1,0,1},{0,-1,0},{1,1,-1}},
            {{1,-1,0},{0,-1,0},{1,-1,1}},{{1,1,0},{-1,-1,-1},{1,-1,1}},{{0,1,1},{-1,-1,-1},{1,-1,1}},{{0,-1,1},{0,-1,0},{1,-1,1}},{{0,-1,0},{1,-1,0},{1,-1,1}},
            {{0,-1,0},{0,-1,1},{1,-1,1}},{{-1,1,1},{-1,-1,1},{-1,1,0}},{{-1,1,0},{-1,-1,1},{1,1,-1}},{{-1,1,0},{-1,-1,1},{-1,1,1}},{{1,0,-1},{0,-1,0},{-1,1,1}},
            {{0,1,-1},{0,-1,0},{-1,1,1}},{{1,-1,1},{0,-1,0},{0,-1,1}},{{1,-1,0},{1,-1,0},{0,-1,1}},{{1,-1,-1},{1,-1,0},{-1,1,1}},{{1,-1,-1},{0,-1,1},{-1,1,1}},
            {{1,-1,-1},{0,-1,1},{1,-1,1}},{{0,0,-1},{0,-1,1},{-1,1,1}},{{0,0,1},{-1,-1,-1},{1,1,0}}};
//@formatter:on
	public void start() {
		super.start();
		moves = new ArrayList<Integer>();
		AIT = false;
		stopped = false;
		gameOver = false;
		for (int i = 0; i < boxes.length; i++) {
			for (int j = 0; j < boxes[0].length; j++) {
				boxes[i][j] = new Rectangle(j * 150, i * 150, 150, 150);
				inBoxes[i][j] = false;
				state[i][j] = 0;
				
			}
		}
	}
	
	public void init() {
		setSize(size);
		url = getDocumentBase();
		tick = getImage(url, "rec/tick.png");
		cross = getImage(url, "rec/cross.png");
		AI = new AI();
		addMouseMotionListener(new MouseEvents());
		addMouseListener(new MouseEvents());
		new Thread(this).start();
	}
	
	public void run() {
		while (true) {
			repaint();
			for (int i = 0; i < endStates.length; i++) {
				if (Arrays.deepEquals(endStates[i], state)) {
					gameOver = true;
				}
			}
			if (AIT && !gameOver) {
				try {
					stopped = true;
					Thread.sleep(100);
					stopped = false;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int[][] moveArray = AI.move(state, moves);
				int move = 0;
				for (int i = 0; i < moveArray.length; i++) {
					for (int j = 0; j < moveArray[0].length; j++) {
						if (moveArray[i][j] == -1) {
							move = i * 3 + j + 1;
							state[i][j] = -1;
						}
					}
				}
				moves.add(move);
				AIT = false;
			}
			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(Graphics g) {
		if (offScreen == null) {
			offScreen = createImage(this.getWidth(), this.getHeight());
			doubleG = offScreen.getGraphics();
		}
		doubleG.setColor(getBackground());
		doubleG.fillRect(0, 0, this.getWidth(), this.getHeight());
		doubleG.setColor(getForeground());
		paint(doubleG);
		g.drawImage(offScreen, 0, 0, this);
	}
	
	public void paint(Graphics g1) {
		super.paint(g1);
		Graphics2D g = (Graphics2D) g1;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(new Color(50, 200, 50));
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.drawLine(150, 0, 150, 450);
		g.drawLine(300, 0, 300, 450);
		g.drawLine(0, 150, 450, 150);
		g.drawLine(0, 300, 450, 300);
		for (int i = 0; i < inBoxes.length; i++) {
			for (int j = 0; j < inBoxes[0].length; j++) {
				Rectangle x = boxes[i][j];
				int y = state[i][j];
				if (inBoxes[i][j]) {
					g.setColor(new Color(0, 0, 0, 10));
					g.fillRect(x.x, x.y, x.width, x.height);
				}
				if (y == 1) g.drawImage(tick, x.x + 1, x.y + 1, this);
				else if (y == -1) g.drawImage(cross, x.x + 1, x.y + 1, this);
			}
		}
		if (gameOver) {
			playAgain = drawString(g, "Play Again", getHeight() / 2, playAgain);
		}
	}
	
	public Rectangle drawString(Graphics2D g, String text, int y, Rectangle rect) {
		Font f = new Font("Arial", Font.PLAIN, 70);
		if (g.getFont() != f) g.setFont(f);
		Rectangle2D strlen = g.getFontMetrics().getStringBounds(text, g);
		g.setColor(Color.WHITE);
		if (rect == null) {
			rect = new Rectangle((int) (getWidth() / 2 - strlen.getWidth() / 2), y - (int) strlen.getHeight(), (int) strlen.getWidth(), (int) strlen.getHeight());
		}
		if (rect.contains(mx, my)) {
			g.setColor(new Color(220, 50, 50));
		}
		g.drawString(text, (int) (getWidth() / 2 - strlen.getWidth() / 2), y);
		return rect;
	}
	
	private class MouseEvents extends MouseAdapter {
		
		public void mouseMoved(MouseEvent e) {
			mx = e.getX();
			my = e.getY();
			if (!gameOver) {
				for (int i = 0; i < inBoxes.length; i++) {
					for (int j = 0; j < inBoxes[0].length; j++) {
						if (boxes[i][j].contains(mx, my) && state[i][j] == 0) inBoxes[i][j] = true;
						else inBoxes[i][j] = false;
					}
				}
			}
		}
		
		public void mousePressed(MouseEvent e) {
			if (!gameOver && !stopped) {
				for (int i = 0; i < inBoxes.length; i++) {
					for (int j = 0; j < inBoxes[0].length; j++) {
						if (boxes[i][j].contains(mx, my) && state[i][j] == 0) {
							inBoxes[i][j] = false;
							state[i][j] = 1;
							AIT = true;
							moves.add(i * 3 + j + 1);
						}
					}
				}
			} else if (gameOver) {
				if (playAgain.contains(mx, my)) {
					start();
				}
			}
		}
		
		public void mouseReleased(MouseEvent e) {
			if (!gameOver && !stopped) {
				for (int i = 0; i < inBoxes.length; i++) {
					for (int j = 0; j < inBoxes[0].length; j++) {
						if (boxes[i][j].contains(mx, my) && state[i][j] == 0) inBoxes[i][j] = true;
					}
				}
			}
		}
	}
}
