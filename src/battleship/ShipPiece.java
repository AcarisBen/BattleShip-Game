package battleship;

import boardgame.Board;
import boardgame.Piece;

public class ShipPiece extends Piece { // uma ShipPiece tambem e' uma Piece 
	
	private int space;

	public ShipPiece(Board board, int space) {
	super(board);
	this.space = space;
}

	public int getSpace() {
		return space;
	}
	

}
