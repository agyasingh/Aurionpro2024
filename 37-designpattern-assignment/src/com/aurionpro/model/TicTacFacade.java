package com.aurionpro.model;

public class TicTacFacade {
	private TicTacBoard board;

    public TicTacFacade() {
        this.board = new TicTacBoard();
    }

    public boolean makeMove(int row, int col, Player player) {
        return board.makeMove(row, col, player.getSymbol());
    }

    public boolean checkForWin() {
        return board.checkForWin();
    }

    public boolean isBoardFull() {
        return board.isBoardFull();
    }

}
