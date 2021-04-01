package Lesson1.game1;

public class Road {
    private int roadLength;
    private int roadHeght;

    public Road(int roadLength, int roadHeght) {
        this.roadLength = roadLength;
        this.roadHeght = roadHeght;
    }

    public double getTimeToRunOvercomeRoad(CanRun runner) {
        return runner.run(roadLength, roadHeght);
    }


}
