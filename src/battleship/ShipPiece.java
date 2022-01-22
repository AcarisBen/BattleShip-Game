package battleship;

import boardgame.Board;
import boardgame.Piece;

public class ShipPiece extends Piece { // uma ShipPiece tambem e' uma Piece 
	
	private int space;
	private ShipColor shipColor;

	public ShipPiece(Board board, int space, ShipColor shipColor) {
	super(board);
	this.space = space;
	this.shipColor = shipColor;
}

	public int getSpace() {
		return space;
	}
	
	public ShipColor getShipColor() {
		return shipColor;
	}
}
