package boardgame;

public abstract class Piece {
	//Atributes
	protected Position position;
	private Board board;
	//Constructor using just board as a field cause position must be null
	public Piece(Board board) {
		this.board = board;
	}
	//Get protected board
	protected Board getBoard() {
		return board;
		
	}
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
