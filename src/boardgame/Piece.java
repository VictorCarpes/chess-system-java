package boardgame;

public class Piece {
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
	
}
