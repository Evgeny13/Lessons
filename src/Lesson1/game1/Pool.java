package Lesson1.game1;

public class Pool {
    private int poolLength;

    public Pool(int poolLength) {
        this.poolLength = poolLength;
    }

    public  double getTimeToOvercomePool(CanSwim swimmer) {
        return  swimmer.swim(poolLength);
    }
}
