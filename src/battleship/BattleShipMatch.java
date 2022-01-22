package battleship;

import battleship.pieces.Battleship;
import battleship.pieces.Carrier;
import battleship.pieces.Cruiser;
import battleship.pieces.Destroyer;
import battleship.pieces.Submarine;
import boardgame.Board;
import boardgame.Position;

public class BattleShipMatch {

	private Board board;
	
	public BattleShipMatch() {
		board = new Board(10, 10);
		initialSetup();
	}
	
	public ShipPiece[][] getParts() { // Nao existe matriz ShipPiece e sim a matriz Piece. precisa liberar a ShipPiece para o programa
		ShipPiece[][] mat = new ShipPiece[board.getRows()][board.getColumns()]; //variavel auxiliar de matriz com a quantidade de linhas e colunas do tabuleiro
	for (int i=0; i<board.getRows(); i++) {//Percorre todas as linhas da matriz 
		for (int j=0; j<board.getColumns(); j++) { //Percorre todas as colunas da matriz 
			mat[i][j] = (ShipPiece) board.piece(i, j); // fazer um downcasting  para cada piece do board 
		}
	} return mat;
	}
	
//	public ShipPiece[][] space() {
	//	ShipPiece[][] horizontal = new ShipPiece[board.getRows()][board.getColumns()];
	//	if () {
	//		(ShipPiece) board.getRows() = null && board.getColumns()=getSpace;
	//	} else {
	//		(ShipPiece) board.getColumns() = null && board.getRows() = getSpace;
	//	}
		
	//}
	private void initialSetup () { // Inicia a partida, colocando as peças no tabuleiro
		board.placePiece(new Carrier(board, 5, ShipColor.GREEN), new Position(8,2));
		board.placePiece(new Carrier(board, 5, ShipColor.GREEN), new Position(8,3));
		board.placePiece(new Carrier(board, 5, ShipColor.GREEN), new Position(8,4));
		board.placePiece(new Carrier(board, 5, ShipColor.GREEN), new Position(8,5));
		board.placePiece(new Carrier(board, 5, ShipColor.GREEN), new Position(8,6));
		
		board.placePiece(new Battleship(board, 4, ShipColor.GREEN), new Position(2,1));
		board.placePiece(new Battleship(board, 4, ShipColor.GREEN), new Position(3,1));
		board.placePiece(new Battleship(board, 4, ShipColor.GREEN), new Position(4,1));
		board.placePiece(new Battleship(board, 4, ShipColor.GREEN), new Position(5,1));
		
		board.placePiece(new Cruiser(board, 3, ShipColor.GREEN), new Position(1,5));
		board.placePiece(new Cruiser(board, 3, ShipColor.GREEN), new Position(1,6));
		board.placePiece(new Cruiser(board, 3, ShipColor.GREEN), new Position(1,7));
		
		board.placePiece(new Submarine(board, 3, ShipColor.GREEN), new Position(4,5));
		board.placePiece(new Submarine(board, 3, ShipColor.GREEN), new Position(5,5));
		board.placePiece(new Submarine(board, 3, ShipColor.GREEN), new Position(6,5));
		
		board.placePiece(new Destroyer(board, 2, ShipColor.GREEN), new Position(3,7));
		board.placePiece(new Destroyer(board, 2, ShipColor.GREEN), new Position(3,8));
		
	}
	
	
}
