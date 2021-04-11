package Lesson3;

public class GenBox<T> {
    private T object;

    public GenBox(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        GenBox<Integer> genBox1 = new GenBox<>(10);
        GenBox<Integer> genBox2 = new GenBox<>(20);

        System.out.println(genBox1.getClass().getName());

        System.out.println(genBox1.getObject() + genBox2.getObject());
    }
}
