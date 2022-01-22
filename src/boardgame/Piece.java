package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // no inicio fica nulo a position 
	}

	protected Board getBoard() { // somente classes e subclasses acessam o getBoard
		return board;
	}

	
}
