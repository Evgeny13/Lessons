package Lesson3;

public class Box {
    private Object object;

    public Box(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Box box1 = new Box(10);
        System.out.println(box1.getObject().getClass().getName()); // имя класса
        Box box2 = new Box(20);

        box2.setObject("sbhskb");

        if(box1.getObject() instanceof Integer && box2.getObject() instanceof  Integer) {
            System.out.println((Integer) box1.getObject() + (Integer) box2.getObject());
        }

    }
}
