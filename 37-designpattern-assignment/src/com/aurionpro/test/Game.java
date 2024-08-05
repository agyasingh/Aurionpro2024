package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Player;
import com.aurionpro.model.TicTacBoard;

public class Game {
	public Scanner scanner=new Scanner(System.in);
	 public static void main(String[] args) {
	        TicTacBoard board = new TicTacBoard();
	        Player bob = new Player('X'); 
	        Player mary = new Player('O'); 

	        Player currentPlayer = bob; 

	        while (!board.isBoardFull() && !board.checkForWin()) {
	            
	            displayBoard(board);

	           
	            System.out.println("Current turn: Player " + currentPlayer.getSymbol());
	            boolean validMove = false;
	            while (!validMove) {
	                int[] move = getPlayerMove(currentPlayer);
	                validMove = board.makeMove(move[0], move[1], currentPlayer.getSymbol());
	                if (!validMove) {
	                    System.out.println("Invalid move. Try again.");
	                }
	            }

	           
	            currentPlayer = (currentPlayer == bob) ? mary : bob;
	        }

	      
	        displayBoard(board);
	        if (board.checkForWin()) {
	            System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
	        } else {
	            System.out.println("It's a draw!");
	        }
	    }

	    public static void displayBoard(TicTacBoard board) {
	        System.out.println("Current Board:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(board.getBoard()[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int[] getPlayerMove(Player player) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter row (0-2) for Player " + player.getSymbol() + ": ");
	        int row = scanner.nextInt();
	        System.out.print("Enter column (0-2) for Player " + player.getSymbol() + ": ");
	        int col = scanner.nextInt();
	        return new int[]{row, col};
	    }

}
