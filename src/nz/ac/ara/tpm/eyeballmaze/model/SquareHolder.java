package nz.ac.ara.tpm.eyeballmaze.model;


public class SquareHolder implements ISquareHolder {
	private final Square[][] squares;
	
	public SquareHolder(int height, int width) {
		squares = new Square[width][height];
	}
	
	@Override
	public void addSquare(Square square, int row, int column) {
		squares[row][column] = square;
	}

	@Override
	public Color getColorAt(int row, int column) {
		return squares[row][column].color();
	}

	@Override
	public Shape getShapeAt(int row, int column) {
		// TODO Auto-generated method stub
		return squares[row][column].shape();
	}

}
