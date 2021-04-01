package Lesson1.game1;

public class Animal {
    private  String name;
    private  int maxSpeed;
    private int swimSpeed;
    private  double heightKoeff;

    public Animal(String name, int maxSpeed, int swimSpeed, double heightKoeff) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.swimSpeed = swimSpeed;
        this.heightKoeff = heightKoeff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public double getHeightKoeff() {
        return heightKoeff;
    }

    public void setHeightKoeff(double heightKoeff) {
        this.heightKoeff = heightKoeff;
    }
}
