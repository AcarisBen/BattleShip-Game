package battleship.pieces;

import battleship.ShipColor;
import battleship.ShipPiece;
import boardgame.Board;

public class Destroyer extends ShipPiece{
	
	public Destroyer(Board board, int space, ShipColor shipColor) {
		super(board, space, shipColor);
		space = 2;
		}

	@Override
	public String toString() {
		return "D";
	}
}
