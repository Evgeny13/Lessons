package Lesson1.game1;

public class Dog extends Animal implements CanRun, CanSwim{

    public Dog(String name, int maxSpeed, int swimSpeed) {
        super(name, maxSpeed, swimSpeed, 1);
    }

    @Override
    public double run(int length, int height) {
        if (height > 100) {
            super.setHeightKoeff(0.5);
        }
        else {
            super.setHeightKoeff(1);
        }
        return length / (super.getMaxSpeed() * super.getHeightKoeff());
    }

    @Override
    public double swim(int length) {
        return length / super.getSwimSpeed();
    }
}
