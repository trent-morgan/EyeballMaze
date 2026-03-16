package nz.ac.ara.tpm.eyeballmaze.model;

import java.util.ArrayList;
import java.util.List;

public class LevelHolder implements ILevelHolder {
	private final List<Square[][]> levels = new ArrayList<>();
	private  int currentLevelIndex = 0;

	@Override
	public void addLevel(int height, int width) {
		Square[][] newLevel = new Square[height][width];
		levels.add(newLevel);
		currentLevelIndex = levels.size() - 1;
	}

	@Override
	public int getLevelWidth() {
		if (levels.isEmpty()) {
	        return 0;
	    }
		Square[][] currentLevel = levels.get(currentLevelIndex);
		return currentLevel[0].length;
	}

	@Override
	public int getLevelHeight() {
		if (levels.isEmpty()) {
	        return 0;
	    }
		Square[][] currentLevel = levels.get(currentLevelIndex);
		return currentLevel.length;
	}

	@Override
	public void setCurrentLevel(int levelNumber) {
		// TODO Auto-generated method stub
		currentLevelIndex = levelNumber;
	}

	@Override
	public int getLevelCount() {
		// TODO Auto-generated method stub
		return levels.size();
	}

}
