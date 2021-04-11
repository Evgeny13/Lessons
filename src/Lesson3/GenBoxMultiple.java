package Lesson3;

public class GenBoxMultiple <T, U> {
    private T obj1;
    private U obj2;

    public GenBoxMultiple(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public U getObj2() {
        return obj2;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }

    public static void main(String[] args) {
        GenBoxMultiple<Integer, String> box1 = new GenBoxMultiple<>(145000000, " Население России");

        System.out.println(box1.getObj1() + box1.getObj2());
    }
}
