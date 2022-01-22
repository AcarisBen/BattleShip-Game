package battleship.pieces;

import battleship.ShipColor;
import battleship.ShipPiece;
import boardgame.Board;

public class Battleship extends ShipPiece {

	public Battleship(Board board, int space, ShipColor shipColor) {
		super(board, space, shipColor);
		space = 4;
	}

	
	@Override
	public String toString() {
		return "B";
	}
}

