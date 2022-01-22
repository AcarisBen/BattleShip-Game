package battleship.pieces;

import battleship.ShipColor;
import battleship.ShipPiece;
import boardgame.Board;

public class Submarine extends ShipPiece{
	
	public Submarine(Board board, int space, ShipColor shipColor) {
		super(board, space, shipColor);
		space =3;
		}

	@Override
	public String toString() {
		return "S";
	}
}
