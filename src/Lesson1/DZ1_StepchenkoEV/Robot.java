package Lesson1.DZ1_StepchenkoEV;

public class Robot implements  Run, Jamp{
    private String name;
    private int maxLenght;
    private int maxJamp;
    private boolean success;

    public Robot() {
    }

    public Robot(String name, int maxLenght, int maxJamp) {
        this.name = name;
        this.maxLenght = maxLenght;
        this.maxJamp = maxJamp;
        this.success = true;
    }

    @Override
    public void run(int lenght) {
        if (success) {
            if (maxLenght >= lenght) {
                System.out.println("Робот пробежал!");
            } else {
                System.out.println("Робот не пробежал!");
                success = false;
            }
        }
    }

    @Override
    public void jamp(int hight) {
        if (success) {
            if (maxJamp >= hight) {
                System.out.println("Робот перепрыгнул!");
            } else {
                System.out.println("Робот не перепрыгнул!");
                success = false;
            }
        } else {
            System.out.println("Робот не допущен так как не преодолел предыдущее препятствие");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxLenght() {
        return maxLenght;
    }

    public void setMaxLenght(int maxLenght) {
        this.maxLenght = maxLenght;
    }

    public int getMaxJamp() {
        return maxJamp;
    }

    public void setMaxJamp(int maxJamp) {
        this.maxJamp = maxJamp;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
