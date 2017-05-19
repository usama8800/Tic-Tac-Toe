import java.util.ArrayList;

public class AI {

	public int[][] move(int[][] state, ArrayList<Integer> moves) {
		int[][] move = new int[3][3];
		for (int i = 0; i < move.length; i++) {
			for (int j = 0; j < move[0].length; j++) {
				move[i][j] = 0;
			}
		}
		if (moves.get(0) == 1) {
			if (moves.size() > 1) {
				if (moves.get(2) == 2) {
					if (moves.size() > 3) {
						if (moves.get(4) == 4) {
							move[2][0] = -1;
						} else if (moves.get(4) == 6) {
							move[2][0] = -1;
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[1][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[2][0] = -1;
						} else if (moves.get(4) == 9) {
							move[2][0] = -1;
						}
					} else {
						move[0][2] = -1;
					}
				} else if (moves.get(2) == 3) {
					if (moves.size() > 3) {
						if (moves.get(4) == 4) {
							move[2][1] = -1;
						} else if (moves.get(4) == 6) {
							move[2][1] = -1;
						} else if (moves.get(4) == 7) {
							move[2][1] = -1;
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 7) {
									move[1][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 9) {
							move[2][1] = -1;
						}
					} else {
						move[0][1] = -1;
					}
				} else if (moves.get(2) == 4) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							move[0][2] = -1;
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 6) {
							move[0][2] = -1;
						} else if (moves.get(4) == 8) {
							move[0][2] = -1;
						} else if (moves.get(4) == 9) {
							move[0][2] = -1;
						}
					} else {
						move[2][0] = -1;
					}
				} else if (moves.get(2) == 6) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 4) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						}
					} else {
						move[2][2] = -1;
					}
				} else if (moves.get(2) == 7) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							move[1][2] = -1;
						} else if (moves.get(4) == 3) {
							move[1][2] = -1;
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[1][2] = -1;
						} else if (moves.get(4) == 9) {
							move[1][2] = -1;
						}
					} else {
						move[1][0] = -1;
					}
				} else if (moves.get(2) == 8) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 6) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][2] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 6) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 4) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[1][2] = -1;
								} else if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						}
					} else {
						move[2][2] = -1;
					}
				} else if (moves.get(2) == 9) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 6) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 3) {
							move[0][1] = -1;
						} else if (moves.get(4) == 4) {
							move[0][1] = -1;
						} else if (moves.get(4) == 6) {
							move[0][1] = -1;
						} else if (moves.get(4) == 7) {
							move[0][1] = -1;
						}
					} else {
						move[2][1] = -1;
					}
				}
			} else {
				move[1][1] = -1;
			}
		} else if (moves.get(0) == 2) {
			if (moves.size() > 1) {
				if (moves.get(2) == 1) {
					if (moves.size() > 3) {
						if (moves.get(4) == 4) {
							move[2][0] = -1;
						} else if (moves.get(4) == 6) {
							move[2][0] = -1;
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[1][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[2][0] = -1;
						} else if (moves.get(4) == 9) {
							move[2][0] = -1;
						}
					} else {
						move[0][2] = -1;
					}
				} else if (moves.get(2) == 3) {
					if (moves.size() > 3) {
						if (moves.get(4) == 4) {
							move[2][2] = -1;
						} else if (moves.get(4) == 6) {
							move[2][2] = -1;
						} else if (moves.get(4) == 7) {
							move[2][2] = -1;
						} else if (moves.get(4) == 8) {
							move[2][2] = -1;
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								} else if (moves.get(6) == 8) {
									move[1][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						}
					} else {
						move[0][0] = -1;
					}
				} else if (moves.get(2) == 4) {
					if (moves.size() > 3) {
						if (moves.get(4) == 3) {
							move[2][2] = -1;
						} else if (moves.get(4) == 6) {
							move[2][2] = -1;
						} else if (moves.get(4) == 7) {
							move[2][2] = -1;
						} else if (moves.get(4) == 8) {
							move[2][2] = -1;
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						}
					} else {
						move[0][0] = -1;
					}
				} else if (moves.get(2) == 6) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[2][0] = -1;
						} else if (moves.get(4) == 4) {
							move[2][0] = -1;
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[2][2] = -1;
						} else if (moves.get(4) == 9) {
							move[2][0] = -1;
						}
					} else {
						move[0][2] = -1;
					}
				} else if (moves.get(2) == 7) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[1][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								} else if (moves.get(6) == 8) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][2] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								} else if (moves.get(6) == 6) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								} else if (moves.get(6) == 6) {
									move[0][0] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						}
					} else {
						move[0][2] = -1;
					}
				} else if (moves.get(2) == 8) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[1][0] = -1;
						} else if (moves.get(4) == 3) {
							move[1][0] = -1;
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][0] = -1;
								} else if (moves.get(6) == 7) {
									move[0][2] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 7) {
							move[1][0] = -1;
						} else if (moves.get(4) == 9) {
							move[1][0] = -1;
						}
					} else {
						move[1][2] = -1;
					}
				} else if (moves.get(2) == 9) {
					if (moves.size() > 3) {
						if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								} else if (moves.get(6) == 8) {
									move[1][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								} else if (moves.get(6) == 8) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 4) {
									move[0][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						}
					} else {
						move[0][0] = -1;
					}
				}
			} else {
				move[1][1] = -1;
			}
		} else if (moves.get(0) == 3) {
			if (moves.size() > 1) {
				if (moves.get(2) == 1) {
					if (moves.size() > 3) {
						if (moves.get(4) == 4) {
							move[2][1] = -1;
						} else if (moves.get(4) == 6) {
							move[2][1] = -1;
						} else if (moves.get(4) == 7) {
							move[2][1] = -1;
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								} else if (moves.get(6) == 9) {
									move[1][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							move[2][1] = -1;
						}
					} else {
						move[0][1] = -1;
					}
				} else if (moves.get(2) == 2) {
					if (moves.size() > 3) {
						if (moves.get(4) == 4) {
							move[2][2] = -1;
						} else if (moves.get(4) == 6) {
							move[2][2] = -1;
						} else if (moves.get(4) == 7) {
							move[2][2] = -1;
						} else if (moves.get(4) == 8) {
							move[2][2] = -1;
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								} else if (moves.get(6) == 8) {
									move[1][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						}
					} else {
						move[0][0] = -1;
					}
				} else if (moves.get(2) == 4) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[2][1] = -1;
								} else if (moves.get(6) == 2) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 6) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 8) {
									move[0][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						}
					} else {
						move[2][0] = -1;
					}
				} else if (moves.get(2) == 6) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][1] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[1][0] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 2) {
							move[0][0] = -1;
						} else if (moves.get(4) == 4) {
							move[0][0] = -1;
						} else if (moves.get(4) == 7) {
							move[0][0] = -1;
						} else if (moves.get(4) == 8) {
							move[0][0] = -1;
						}
					} else {
						move[2][2] = -1;
					}
				} else if (moves.get(2) == 7) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[1][2] = -1;
						} else if (moves.get(4) == 2) {
							move[1][2] = -1;
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 8) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[1][2] = -1;
						} else if (moves.get(4) == 9) {
							move[1][2] = -1;
						}
					} else {
						move[1][0] = -1;
					}
				} else if (moves.get(2) == 8) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][2] = -1;
								} else if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][2] = -1;
								} else if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][0] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][2] = -1;
								} else if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 2) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						}
					} else {
						move[2][0] = -1;
					}
				} else if (moves.get(2) == 9) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[1][0] = -1;
						} else if (moves.get(4) == 2) {
							move[1][0] = -1;
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[2][1] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 7) {
							move[1][0] = -1;
						} else if (moves.get(4) == 8) {
							move[1][0] = -1;
						}
					} else {
						move[1][2] = -1;
					}
				}
			} else {
				move[1][1] = -1;
			}
		} else if (moves.get(0) == 4) {
			if (moves.size() > 1) {
				if (moves.get(2) == 1) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							move[0][2] = -1;
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 6) {
							move[0][2] = -1;
						} else if (moves.get(4) == 8) {
							move[0][2] = -1;
						} else if (moves.get(4) == 9) {
							move[0][2] = -1;
						}
					} else {
						move[2][0] = -1;
					}
				} else if (moves.get(2) == 2) {
					if (moves.size() > 3) {
						if (moves.get(4) == 3) {
							move[2][2] = -1;
						} else if (moves.get(4) == 6) {
							move[2][2] = -1;
						} else if (moves.get(4) == 7) {
							move[2][2] = -1;
						} else if (moves.get(4) == 8) {
							move[2][2] = -1;
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								} else if (moves.get(6) == 8) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						}
					} else {
						move[0][0] = -1;
					}
				} else if (moves.get(2) == 3) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[2][1] = -1;
								} else if (moves.get(6) == 2) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 6) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 8) {
									move[0][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						}
					} else {
						move[2][0] = -1;
					}
				} else if (moves.get(2) == 6) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[2][1] = -1;
						} else if (moves.get(4) == 3) {
							move[2][1] = -1;
						} else if (moves.get(4) == 7) {
							move[2][1] = -1;
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[0][0] = -1;
								} else if (moves.get(6) == 9) {
									move[2][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							move[2][1] = -1;
						}
					} else {
						move[0][1] = -1;
					}
				} else if (moves.get(2) == 7) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[2][2] = -1;
						} else if (moves.get(4) == 2) {
							move[2][2] = -1;
						} else if (moves.get(4) == 6) {
							move[2][2] = -1;
						} else if (moves.get(4) == 8) {
							move[2][2] = -1;
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 6) {
									move[0][1] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						}
					} else {
						move[0][0] = -1;
					}
				} else if (moves.get(2) == 8) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[0][2] = -1;
						} else if (moves.get(4) == 2) {
							move[0][2] = -1;
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[2][2] = -1;
								} else if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							move[0][2] = -1;
						} else if (moves.get(4) == 9) {
							move[0][2] = -1;
						}
					} else {
						move[2][0] = -1;
					}
				} else if (moves.get(2) == 9) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[0][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][2] = -1;
								} else if (moves.get(6) == 2) {
									move[0][1] = -1;
								} else if (moves.get(6) == 6) {
									move[0][1] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						}
					} else {
						move[0][0] = -1;
					}
				}
			} else {
				move[1][1] = -1;
			}
		} else if (moves.get(0) == 5) {
			if (moves.size() > 1) {
				if (moves.get(2) == 2) {
					if (moves.size() > 3) {
						if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][2] = -1;
								} else if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][0] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[0][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[2][1] = -1;
								} else if (moves.get(6) == 7) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[1][0] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[1][0] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						}
					} else {
						move[2][1] = -1;
					}
				} else if (moves.get(2) == 3) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							move[1][0] = -1;
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][1] = -1;
								} else if (moves.get(6) == 9) {
									move[0][1] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 6) {
							move[1][0] = -1;
						} else if (moves.get(4) == 8) {
							move[1][0] = -1;
						} else if (moves.get(4) == 9) {
							move[1][0] = -1;
						}
					} else {
						move[2][0] = -1;
					}
				} else if (moves.get(2) == 4) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[0][2] = -1;
								} else if (moves.get(6) == 9) {
									move[0][2] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][1] = -1;
								} else if (moves.get(6) == 9) {
									move[0][1] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[0][1] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[0][2] = -1;
								} else if (moves.get(6) == 9) {
									move[0][2] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][1] = -1;
								} else if (moves.get(6) == 7) {
									move[0][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][1] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						}
					} else {
						move[1][2] = -1;
					}
				} else if (moves.get(2) == 6) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							move[2][0] = -1;
						} else if (moves.get(4) == 3) {
							move[2][0] = -1;
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][1] = -1;
								} else if (moves.get(6) == 9) {
									move[0][1] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[2][0] = -1;
						} else if (moves.get(4) == 9) {
							move[2][0] = -1;
						}
					} else {
						move[1][0] = -1;
					}
				} else if (moves.get(2) == 7) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[1][0] = -1;
								} else if (moves.get(6) == 9) {
									move[1][0] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						} else if (moves.get(4) == 4) {
							move[0][1] = -1;
						} else if (moves.get(4) == 6) {
							move[0][1] = -1;
						} else if (moves.get(4) == 8) {
							move[0][1] = -1;
						} else if (moves.get(4) == 9) {
							move[0][1] = -1;
						}
					} else {
						move[0][2] = -1;
					}
				} else if (moves.get(2) == 8) {
					if (moves.size() > 3) {
						if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[1][0] = -1;
								} else if (moves.get(6) == 9) {
									move[1][0] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 4) {
							move[0][2] = -1;
						} else if (moves.get(4) == 6) {
							move[0][2] = -1;
						} else if (moves.get(4) == 7) {
							move[0][2] = -1;
						} else if (moves.get(4) == 9) {
							move[0][2] = -1;
						}
					} else {
						move[0][1] = -1;
					}
				} else if (moves.get(2) == 9) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							move[1][0] = -1;
						} else if (moves.get(4) == 3) {
							move[1][0] = -1;
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][1] = -1;
								} else if (moves.get(6) == 3) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][1] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 6) {
							move[1][0] = -1;
						} else if (moves.get(4) == 8) {
							move[1][0] = -1;
						}
					} else {
						move[2][0] = -1;
					}
				}
			} else {
				move[0][0] = -1;
			}
		} else if (moves.get(0) == 6) {
			if (moves.size() > 1) {
				if (moves.get(2) == 1) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][1] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 8) {
									move[0][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 4) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						}
					} else {
						move[2][2] = -1;
					}
				} else if (moves.get(2) == 2) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[2][0] = -1;
						} else if (moves.get(4) == 4) {
							move[2][0] = -1;
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								} else if (moves.get(6) == 8) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[2][0] = -1;
						} else if (moves.get(4) == 9) {
							move[2][0] = -1;
						}
					} else {
						move[0][2] = -1;
					}
				} else if (moves.get(2) == 3) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][1] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 2) {
							move[0][0] = -1;
						} else if (moves.get(4) == 4) {
							move[0][0] = -1;
						} else if (moves.get(4) == 7) {
							move[0][0] = -1;
						} else if (moves.get(4) == 8) {
							move[0][0] = -1;
						}
					} else {
						move[2][2] = -1;
					}
				} else if (moves.get(2) == 4) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[0][1] = -1;
						} else if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 3) {
							move[0][1] = -1;
						} else if (moves.get(4) == 7) {
							move[0][1] = -1;
						} else if (moves.get(4) == 9) {
							move[0][1] = -1;
						}
					} else {
						move[2][1] = -1;
					}
				} else if (moves.get(2) == 7) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[0][1] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][1] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						}
					} else {
						move[0][2] = -1;
					}
				} else if (moves.get(2) == 8) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][0] = -1;
								} else if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 2) {
							move[0][0] = -1;
						} else if (moves.get(4) == 3) {
							move[0][0] = -1;
						} else if (moves.get(4) == 4) {
							move[0][0] = -1;
						} else if (moves.get(4) == 7) {
							move[0][0] = -1;
						}
					} else {
						move[2][2] = -1;
					}
				} else if (moves.get(2) == 9) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[2][0] = -1;
						} else if (moves.get(4) == 2) {
							move[2][0] = -1;
						} else if (moves.get(4) == 4) {
							move[2][0] = -1;
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][1] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[2][0] = -1;
						}
					} else {
						move[0][2] = -1;
					}
				}
			} else {
				move[1][1] = -1;
			}
		} else if (moves.get(0) == 7) {
			if (moves.size() > 1) {
				if (moves.get(2) == 1) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							move[1][2] = -1;
						} else if (moves.get(4) == 3) {
							move[1][2] = -1;
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 9) {
									move[0][1] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[1][2] = -1;
						} else if (moves.get(4) == 9) {
							move[1][2] = -1;
						}
					} else {
						move[1][0] = -1;
					}
				} else if (moves.get(2) == 2) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[1][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								} else if (moves.get(6) == 8) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][2] = -1;
								} else if (moves.get(6) == 4) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								} else if (moves.get(6) == 6) {
									move[0][0] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						}
					} else {
						move[0][2] = -1;
					}
				} else if (moves.get(2) == 3) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[1][0] = -1;
						} else if (moves.get(4) == 2) {
							move[1][0] = -1;
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[1][0] = -1;
						} else if (moves.get(4) == 9) {
							move[1][0] = -1;
						}
					} else {
						move[1][2] = -1;
					}
				} else if (moves.get(2) == 4) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							move[2][2] = -1;
						} else if (moves.get(4) == 3) {
							move[2][2] = -1;
						} else if (moves.get(4) == 6) {
							move[2][2] = -1;
						} else if (moves.get(4) == 8) {
							move[2][2] = -1;
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 6) {
									move[0][1] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						}
					} else {
						move[0][0] = -1;
					}
				} else if (moves.get(2) == 6) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][1] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][2] = -1;
								} else if (moves.get(6) == 8) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[0][1] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][1] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						}
					} else {
						move[0][2] = -1;
					}
				} else if (moves.get(2) == 8) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[1][2] = -1;
								} else if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 2) {
							move[0][0] = -1;
						} else if (moves.get(4) == 3) {
							move[0][0] = -1;
						} else if (moves.get(4) == 4) {
							move[0][0] = -1;
						} else if (moves.get(4) == 6) {
							move[0][0] = -1;
						}
					} else {
						move[2][2] = -1;
					}
				} else if (moves.get(2) == 9) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[0][01] = -1;
						} else if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][2] = -1;
								} else if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 3) {
							move[0][1] = -1;
						} else if (moves.get(4) == 4) {
							move[0][1] = -1;
						} else if (moves.get(4) == 6) {
							move[0][1] = -1;
						}
					} else {
						move[2][1] = -1;
					}
				}
			} else {
				move[1][1] = -1;
			}
		} else if (moves.get(0) == 8) {
			if (moves.size() > 1) {
				if (moves.get(2) == 1) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 6) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][2] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 6) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][0] = -1;
								} else if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[1][2] = -1;
								} else if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						}
					} else {
						move[2][2] = -1;
					}
				} else if (moves.get(2) == 2) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[1][2] = -1;
						} else if (moves.get(4) == 3) {
							move[1][2] = -1;
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[2][0] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 7) {
							move[1][2] = -1;
						} else if (moves.get(4) == 9) {
							move[1][2] = -1;
						}
					} else {
						move[1][0] = -1;
					}
				} else if (moves.get(2) == 3) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][2] = -1;
								} else if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[0][1] = -1;
							}
						} else if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[1][0] = -1;
								} else if (moves.get(6) == 9) {
									move[1][0] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][2] = -1;
								} else if (moves.get(6) == 6) {
									move[2][2] = -1;
								} else if (moves.get(6) == 9) {
									move[1][2] = -1;
								}
							} else {
								move[0][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 9) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 2) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						}
					} else {
						move[2][0] = -1;
					}
				} else if (moves.get(2) == 4) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[0][2] = -1;
						} else if (moves.get(4) == 2) {
							move[0][2] = -1;
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 6) {
									move[0][0] = -1;
								}
							} else {
								move[2][2] = -1;
							}
						} else if (moves.get(4) == 6) {
							move[0][2] = -1;
						} else if (moves.get(4) == 9) {
							move[0][2] = -1;
						}
					} else {
						move[2][0] = -1;
					}
				} else if (moves.get(2) == 6) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 4) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 2) {
							move[0][0] = -1;
						} else if (moves.get(4) == 3) {
							move[0][0] = -1;
						} else if (moves.get(4) == 4) {
							move[0][0] = -1;
						} else if (moves.get(4) == 7) {
							move[0][0] = -1;
						}
					} else {
						move[2][2] = -1;
					}
				} else if (moves.get(2) == 7) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[1][2] = -1;
								} else if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[1][0] = -1;
							}
						} else if (moves.get(4) == 2) {
							move[0][0] = -1;
						} else if (moves.get(4) == 3) {
							move[0][0] = -1;
						} else if (moves.get(4) == 4) {
							move[0][0] = -1;
						} else if (moves.get(4) == 6) {
							move[0][0] = -1;
						}
					} else {
						move[2][2] = -1;
					}
				} else if (moves.get(2) == 9) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[0][2] = -1;
						} else if (moves.get(4) == 2) {
							move[0][2] = -1;
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 4) {
							move[0][2] = -1;
						} else if (moves.get(4) == 6) {
							move[0][2] = -1;
						}
					} else {
						move[2][0] = -1;
					}
				}
			} else {
				move[1][1] = -1;
			}
		} else if (moves.get(0) == 9) {
			if (moves.size() > 1) {
				if (moves.get(2) == 1) {
					if (moves.size() > 3) {
						if (moves.get(4) == 3) {
							move[2][1] = -1;
						} else if (moves.get(4) == 4) {
							move[2][1] = -1;
						} else if (moves.get(4) == 6) {
							move[2][1] = -1;
						} else if (moves.get(4) == 7) {
							move[2][1] = -1;
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 4) {
									move[0][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						}
					} else {
						move[0][1] = -1;
					}
				} else if (moves.get(2) == 2) {
					if (moves.size() > 3) {
						if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[1][0] = -1;
								} else if (moves.get(6) == 8) {
									move[1][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								} else if (moves.get(6) == 8) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 4) {
									move[0][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 4) {
									move[0][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						}
					} else {
						move[0][0] = -1;
					}
				} else if (moves.get(2) == 3) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[1][0] = -1;
						} else if (moves.get(4) == 2) {
							move[1][0] = -1;
						} else if (moves.get(4) == 4) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 7) {
									move[0][1] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						} else if (moves.get(4) == 7) {
							move[1][0] = -1;
						} else if (moves.get(4) == 8) {
							move[1][0] = -1;
						}
					} else {
						move[0][1] = -1;
					}
				} else if (moves.get(2) == 4) {
					if (moves.size() > 3) {
						if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 6) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 4) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 6) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[2][0] = -1;
								} else if (moves.get(6) == 7) {
									move[2][1] = -1;
								} else if (moves.get(6) == 8) {
									move[2][0] = -1;
								}
							} else {
								move[0][2] = -1;
							}
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[0][1] = -1;
								} else if (moves.get(6) == 6) {
									move[0][1] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						} else if (moves.get(4) == 8) {
							if (moves.size() > 5) {
								if (moves.get(6) == 2) {
									move[0][2] = -1;
								} else if (moves.get(6) == 3) {
									move[1][2] = -1;
								} else if (moves.get(6) == 6) {
									move[0][2] = -1;
								}
							} else {
								move[2][0] = -1;
							}
						}
					} else {
						move[0][1] = -1;
					}
				} else if (moves.get(2) == 6) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[2][0] = -1;
						} else if (moves.get(4) == 2) {
							move[2][0] = -1;
						} else if (moves.get(4) == 4) {
							move[2][0] = -1;
						} else if (moves.get(4) == 7) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[0][1] = -1;
								} else if (moves.get(6) == 2) {
									move[0][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][1] = -1;
								}
							} else {
								move[2][1] = -1;
							}
						} else if (moves.get(4) == 8) {
							move[2][0] = -1;
						}
					} else {
						move[0][2] = -1;
					}
				} else if (moves.get(2) == 7) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[0][1] = -1;
						} else if (moves.get(4) == 2) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 3) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 3) {
							move[0][1] = -1;
						} else if (moves.get(4) == 4) {
							move[0][1] = -1;
						} else if (moves.get(4) == 6) {
							move[0][1] = -1;
						}
					} else {
						move[2][1] = -1;
					}
				} else if (moves.get(2) == 8) {
					if (moves.size() > 3) {
						if (moves.get(4) == 1) {
							move[0][2] = -1;
						} else if (moves.get(4) == 2) {
							move[0][2] = -1;
						} else if (moves.get(4) == 3) {
							if (moves.size() > 5) {
								if (moves.get(6) == 1) {
									move[1][0] = -1;
								} else if (moves.get(6) == 2) {
									move[1][0] = -1;
								} else if (moves.get(6) == 4) {
									move[0][0] = -1;
								}
							} else {
								move[1][2] = -1;
							}
						} else if (moves.get(4) == 4) {
							move[0][2] = -1;
						} else if (moves.get(4) == 6) {
							move[0][2] = -1;
						}
					} else {
						move[2][0] = -1;
					}
				}
			} else {
				move[1][1] = -1;
			}
		}
		return move;
	}
}
