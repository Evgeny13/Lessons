package Lesson1;

public class Cat extends Animal implements CanSwim, CanRun{

    private boolean isWild; //домашний или дикий

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);
        this.isWild = false;

    }

    @Override
    public void swim() {
        System.out.println("Кот плывет!");
    }

    @Override
    public void run() {
        System.out.println("Кот бегает!");
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает");
    }

    public void jamp() {
        System.out.println("Кот прыгает");
    }


    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean getIsWild() {
        return isWild;
    }
}
