package battleship;

import boardgame.Board;

public class BattleShipMatch {

	private Board board;
	
	public BattleShipMatch() {
		board = new Board(10, 10);
	}
	
	public ShipPiece[][] getParts() { // Nao existe matriz ShipPiece e sim a matriz Piece. precisa liberar a ShipPiece para o programa
		ShipPiece[][] mat = new ShipPiece[board.getRows()][board.getColumns()]; //variavel auxiliar de matriz com a quantidade de linhas e colunas do tabuleiro
	for (int i=0; i<board.getRows(); i++) {//Percorre todas as linhas da matriz 
		for (int j=0; j<board.getColumns(); j++) { //Percorre todas as colunas da matriz 
			mat[i][j] = (ShipPiece) board.piece(i, j); // fazer um downcasting  para cada piece do board 
		}
	} return mat;
	}
}
