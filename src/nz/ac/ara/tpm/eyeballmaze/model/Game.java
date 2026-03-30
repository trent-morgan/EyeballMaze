package nz.ac.ara.tpm.eyeballmaze.model;

public class Game implements IMoving, IEyeballHolder {
	
	private LevelHolder levelHolder;
	private EyeballHolder eyeballHolder;
	private Level currentLevel;

	
	public void main(String[] args) {
		this.levelHolder = new LevelHolder();
		this.eyeballHolder = new EyeballHolder();
		this.currentLevel = levelHolder.currentLevel;
	}
	
	//LEVELHOLDER ACCESS METHODS
	public void addLevel(int height, int width) {
		this.levelHolder.addLevel(height, width);
	}

	public int getLevelWidth() {
		return this.levelHolder.getLevelWidth();
	}

	
	public int getLevelHeight() {
		return this.levelHolder.getLevelHeight();
	}

	
	public void setCurrentLevel(int levelNumber) {
		this.levelHolder.setCurrentLevel(levelNumber);
	}
	
	public int getLevelCount() {
		return this.levelHolder.getLevelCount();
	}
	
	//LEVEL ACESS METHODS
	public void addGoal(int row, int column) {
	    this.currentLevel.addGoal(row, column);
	}

	public int getGoalCount() {
	    return this.currentLevel.getGoalCount();
	}

	public boolean hasGoalAt(int targetRow, int targetColumn) {
	    return this.currentLevel.hasGoalAt(targetRow, targetColumn);
	}

	public int getCompletedGoalCount() {
	    return this.currentLevel.getCompletedGoalCount();
	}

	public void addSquare(Square square, int row, int column) {
	    this.currentLevel.addSquare(square, row, column);
	}

	public Color getColorAt(int row, int column) {
	    return this.currentLevel.getColorAt(row, column);
	}

	public Shape getShapeAt(int row, int column) {
	    return this.currentLevel.getShapeAt(row, column);
	}
	
	// NEED TO DO
	public void addEyeball(int row, int column, Direction direction) {
		this.eyeballHolder.addEyeball(row, column, direction);
	}

	public int getEyeballRow() {
	    return this.eyeballHolder.getEyeballRow();
	}

	public int getEyeballColumn() {
	    return this.eyeballHolder.getEyeballColumn();
	}

	public Direction getEyeballDirection() {
	    return this.eyeballHolder.getEyeballDirection();
	}
	
	//MOVE VALIDATING METHODS
	@Override
	public boolean canMoveTo(int destinationRow, int destinationColumn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Message messageIfMovingTo(int destinationRow, int destinationColumn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDirectionOK(int destinationRow, int destinationColumn) {
		
		if (destinationRow == this.getEyeballRow() || destinationColumn == this.getEyeballColumn()) {
			
			Direction currentDir = this.getEyeballDirection();
	        
	        if (destinationRow < this.getEyeballRow() && currentDir == Direction.DOWN) {
	            return false; // Target is UP, but we are facing DOWN (180 deg)
	        }
	        if (destinationRow > this.getEyeballRow() && currentDir == Direction.UP) {
	            return false; // Target is DOWN, but we are facing UP (180 deg)
	        }
	        if (destinationColumn < this.getEyeballColumn() && currentDir == Direction.RIGHT) {
	            return false; // Target is LEFT, but we are facing RIGHT (180 deg)
	        }
	        if (destinationColumn > this.getEyeballColumn() && currentDir == Direction.LEFT) {
	            return false; // Target is RIGHT, but we are facing LEFT (180 deg)
	        }

	        return true;
		}
		return false;
	}

	@Override
	public Message checkDirectionMessage(int destinationRow, int destinationColumn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasBlankFreePathTo(int destinationRow, int destinationColumn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Message checkMessageForBlankOnPathTo(int destinationRow, int destinationColumn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void moveTo(int destinationRow, int destinationColumn) {
		// TODO Auto-generated method stub

	}

}
