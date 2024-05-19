package model;
public abstract class Piece {
	protected boolean color;
	
	Piece(boolean color){
		this.color = color;
	}
	
	public abstract boolean canMove(int curX, int curY, int x, int y);
}
