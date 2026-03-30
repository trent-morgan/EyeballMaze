package nz.ac.ara.tpm.eyeballmaze.model;

public class Level {
    private GoalHolder goalHolder;
    private SquareHolder squareHolder;
    private final int height;
    private final int width;

    public Level(int height, int width) {
        this.height = height;
        this.width = width;
        
        this.goalHolder = new GoalHolder();
        this.squareHolder = new SquareHolder(height, width);
    }
    
	public int getLevelWidth() {
		return this.width;
	}

	public int getLevelHeight() {
		return this.height;
	}
	
	public void addGoal(int row, int column) {
		this.goalHolder.addGoal(row, column);
	}

	public int getGoalCount() {
		return this.goalHolder.getGoalCount();
	}

	public boolean hasGoalAt(int targetRow, int targetColumn) {
		return this.goalHolder.hasGoalAt(targetRow, targetColumn);
	}

	public int getCompletedGoalCount() {
		return this.goalHolder.getCompletedGoalCount();
	}
	
	public void addSquare(Square square, int row, int column) {
		this.squareHolder.addSquare(square, row, column);
	}

	public Color getColorAt(int row, int column) {
		return this.squareHolder.getColorAt(row, column);
	}

	public Shape getShapeAt(int row, int column) {
		return this.squareHolder.getShapeAt(row, column);
	}

}
