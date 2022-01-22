package application;

import battleship.ShipPiece;

public class UI {

	public static void printBoard(ShipPiece [][] pieces) {
		System.out.println();
		System.out.println("    a b c d e f g h i j");
		System.out.println();
		for (int i=0; i<pieces.length; i++) {
			System.out.print((" " + (9 - i)) + "  ");
			for(int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
		System.out.print((" " + (9 - i)) + " ");
			
	System.out.println();
	}
	System.out.println();
	
	System.out.print("    a b c d e f g h i j");
	}
	private static void printPiece (ShipPiece piece) {
		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		} System.out.print(" ");
	}
}
