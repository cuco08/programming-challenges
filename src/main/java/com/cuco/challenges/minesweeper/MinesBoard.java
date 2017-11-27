package com.cuco.challenges.minesweeper;

public class MinesBoard {
	private short board[][];
	private static char MINE = '*';
	private short n;
	private short m;
	
	public MinesBoard(short n, short m, String initialValues) {
		board = new short[n][m];
		this.n = n;
		this.m = m;
		for(short i=0; i<n; ++i) {
			for(short j=0; j<m; ++j) {
				if(initialValues.charAt(i*m + j) == MINE) {
					board[i][j] = -1;
				}
			}
		}
	}
	
	public void print() {
		for(short i=0; i<n; ++i) {
			for(short j=0; j<m; ++j) {
				if(board[i][j] < 0) {
					System.out.print(MINE);
				} else {
					System.out.print(board[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void resolve() {
		for(short i=0; i<n; ++i) {
			for(short j=0; j<m; ++j) {
				if(board[i][j] < 0) {
					updateSafeSquares(i, j);
				}
			}
		}
	}
	
	public void updateSafeSquares(short x, short y) {
		for(short i=(short) (x-1); i<=x+1; ++i) {
			for(short j=(short) (y-1); j<=y+1; ++j) {
				if(isValidSafeSquare(i, j)) {
					board[i][j] ++;
				}
			}
		}
	}
	
	public boolean isValidSafeSquare(short x, short y) {
		return isValidSquare(x, y) && board[x][y] >= 0;
	}
	
	public boolean isValidSquare(short x, short y) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}
	
	public short getValue(short x, short y) {
		short value = -1;
		if(isValidSquare(x, y)) {
			value = board[x][y];
		}
		return value;
	}
}
