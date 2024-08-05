package com.aurionpro.model;

public class TicTacBoard {
	private char[][] board;
    private static final int SIZE = 3; 
    
    public TicTacBoard() {
        board = new char[SIZE][SIZE];
        resetBoard();
    }
    
    

    public char[][] getBoard() {
		return board;
	}



	public void setBoard(char[][] board) {
		this.board = board;
	}



	public static int getSize() {
		return SIZE;
	}



	public void resetBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            return false; 
        }
        if (board[row][col] != '-') {
            return false; 
        }
        board[row][col] = symbol;
        return true;
    }

    public boolean checkForWin() {
        
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true; // Row i is all the same symbol
            }
        }

        
        for (int j = 0; j < SIZE; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                return true; // Column j is all the same symbol
            }
        }

       
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true; 
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true; 
        }

        return false; 
    }

    public boolean isBoardFull() {
       
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '-') {
                    return false; 
                }
            }
        }
        return true; 
    }
}


