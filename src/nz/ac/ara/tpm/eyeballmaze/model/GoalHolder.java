package nz.ac.ara.tpm.eyeballmaze.model;

import java.util.ArrayList;
import java.util.List;

public class GoalHolder implements IGoalHolder {
	private List<Position> goals = new ArrayList<>();
	
	@Override
	public void addGoal(int row, int column) {
		Position goal = new Position(row, column);
		if (!goals.contains(goal)) {
		    goals.add(goal);
		}
	}

	@Override
	public int getGoalCount() {
		return goals.size();
	}

	@Override
	public boolean hasGoalAt(int targetRow, int targetColumn) {
		Position targetGoal = new Position(targetRow, targetColumn);
		if (goals.contains(targetGoal)) {
			return true;
		}
		return false;
	}

	@Override
	public int getCompletedGoalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
