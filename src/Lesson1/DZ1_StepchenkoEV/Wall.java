package Lesson1.DZ1_StepchenkoEV;

public class Wall {
    private int hight;
    private final int lenght = 0;

    public Wall(int hight) {
        this.hight = hight;
    }

    public int getLenght() {
        return lenght;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public void getIsJamp(Jamp jamper) {
        jamper.jamp(hight);
    }

    public void getIsRun(Run runner) { }
}
