package boardgame;

public class Position {
	//Atributes
	private int row;
	private int column;
	
	//Constructors
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	//Getters & Setters
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
