package nz.ac.ara.tpm.eyeballmaze.model;

public class Game implements ILevelHolder, IGoalHolder, IEyeballHolder, IMoving {

    private final List<Square[][]> levels = new ArrayList<>();

    private final LevelHolder levelHolder;
    private final GoalHolder goalHolder;
    private final SquareHolder squareHolder;
    private final EyeballHolder eyeballHolder;
    private final Moving moving;

    public static void main(String[] args) {
        this.levelHolder = new LevelHolder();
        this.goalHolder = new GoalHolder();
        this.squareHolder = new SquareHolder();
        this.eyeballHolder = new EyeballHolder();
        this.moving = new Moving();
	}

    public void addLevel(int height, int width) {
        this.levelHolder.addLevel(height, width);
    }

}
