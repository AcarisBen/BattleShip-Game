package boardgame;

public class Board { 
	
	private int rows; // Um tabuleiro tem linhas
	private int columns; // Um tabuleiro tem colunas
	private Piece[][] pieces; // As pieces ficam na matriz que vai ser a position delas.

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Pieces[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	
}
