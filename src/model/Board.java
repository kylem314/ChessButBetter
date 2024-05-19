package model;
import java.lang.Math;

public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        initBoard();
    }

    // Check move given square
    public boolean checkMove(int x1, int y1, int x2, int y2) {
    	return board[x1][y1].canMove(board, x1, y1, x2, y2);
    }
    
    // initBoard
    private void initBoard() {
    	for(int i = 0; i < 8; i++) {
    		board[i][1] = new Pawn(true);
    		board[i][6] = new Pawn(false);
    		if(i == 0 || i == 7) {
    			board[i][0] = new Rook(true);
    			board[i][7] = new Rook(false);
    		}else if(i == 1 || i == 6) {
    			board[i][0] = new Knight(true);
    			board[i][7] = new Knight(false);
    		}else if(i == 2 || i == 5) {
    			board[i][0] = new Bishop(true);
    			board[i][6] = new Bishop(false);
    		}
    	}
    	board[3][0] = new Queen(true);
    	board[3][7] = new Queen(false);
    	board[4][0] = new King(true);
    	board[4][7] = new King(false);
    }
    
    // 
    

}