package battleship.pieces;

import battleship.ShipColor;
import battleship.ShipPiece;
import boardgame.Board;

public class Carrier extends ShipPiece {

	public Carrier(Board board, int space, ShipColor shipColor) {
		super(board, space, shipColor);
		space = 5;
	}
	
	@Override
	public String toString() {
		return "A";
	}
}

