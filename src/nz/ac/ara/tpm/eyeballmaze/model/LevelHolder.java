package nz.ac.ara.tpm.eyeballmaze.model;

import java.util.List;

public class LevelHolder implements ILevelHolder {
	private List<Level> levels;
	public Level currentLevel;

	@Override
	public void addLevel(int height, int width) {
		Level level = new Level(height, width);
		levels.add(level);
	}

	@Override
	public int getLevelWidth() {
		//add exceptions
		return currentLevel.getLevelWidth();
	}

	@Override
	public int getLevelHeight() {
		//add exceptions
		return currentLevel.getLevelHeight();
	}

	@Override
	public void setCurrentLevel(int levelNumber) {
		this.currentLevel = levels.get(levelNumber);
	}

	@Override
	public int getLevelCount() {
		return this.levels.size();
	}

}
