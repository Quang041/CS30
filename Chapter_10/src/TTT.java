import java.util.*;


public class TTT {
	
	private String[][] board;
	private String player1, player2;
	
	
	/**
	 * constructor
	 * pre:none
	 * post: tttBoard has been initialized
	 * player1 is X and play2 is O
	 */
	
	public TTT() {
		player1 = "X";
		player2 = "0";
		
		board = new String[3][3];
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col] = " ";
			}
		}
	}
	
	/**
	 * Prompt user for a move until a valid move had been made
	 * pre: none
	 * post: A mark has been made in an empty tic-tac-toe
	 * board square
	 */
			
	public boolean makeMove(String player, int row, int col) {
		
		if ((row >=0 && row < board.length && col >=0 && col < board[0].length) && board[row][col].equals(" ")) {
			board[row][col] = player;
			return true;
		}
		return false;
	}
		
		

	/**Determine winner. Return " " if no winner
	 * pre: none
	 * post: X, O, or " " has been returned as the winner
	 */

	public String winner() {
		
		/* test row */
		for (int row = 0; row < board.length; row++) {
			if (board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2]) && !(board[row][0].equals(" "))) {
				return(board[row][0]);
			}
		}
		
		/* test column */
		for (int col = 0; col < board.length; col++) {
			if (board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col]) && !(board[0][col].equals(" "))) {
				return(board[0][col]);
			}
		}
		
		/* test diagonal */
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals(" ")) {
			return(board[0][0]);
		}
		
		/* test other diagonal */
		if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals(" ")) {
			return(board[0][2]);
		}
		return(" ");
	}}
		
	


