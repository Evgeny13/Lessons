package Lesson1.DZ1_StepchenkoEV;

public class Track {
    private int length;
    private final int hight = 0;

    public Track(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void getIsRun(Run runner) {
        runner.run(length);
    }

    public void getIsJamp(Jamp jamper) { }
}
