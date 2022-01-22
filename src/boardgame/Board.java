package boardgame;

public class Board { 
	
	private int rows; // Um tabuleiro tem linhas
	private int columns; // Um tabuleiro tem colunas
	private Piece[][] pieces; // As pieces ficam na matriz que vai ser a position delas.

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
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

	public Piece piece(int row, int column) { //Pede para ter um piece a partir de um int linha e coluna.
		return pieces[row][column]; // adiciona a piece na matriz pieces
	}
	
	public Piece piece(Position position) { // //Pede para ter um piece a partir de uma Position.
		return pieces[position.getRow()][position.getColumn()]; // // adiciona a position na matriz pieces a partir da linha e da coluna.
	}
	
	public void placePiece(Piece piece, Position position) {//Coloca a peça no tabuleiro.
		pieces[position.getRow()][position.getColumn()] = piece; //vai na matriz de peças do tableiro, na linha e na coluna position e atribuia a essa position a peça que vier como argumento.
		piece.position = position;//informa que a peça não está mais na posição nula e sim, na posição Position da peça
	}
}
