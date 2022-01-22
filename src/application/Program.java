package application;

import battleship.BattleShipMatch;
import boardgame.Board;


public class Program {

	public static void main(String[] args) {

		Board board = new Board(10, 10);
		
		BattleShipMatch bsMatch = new BattleShipMatch();
		UI.printBoard(bsMatch.getParts());

	}

}
