package Lesson3.DZ3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> boxes;

    public Box(ArrayList<T> boxes) {
        this.boxes = boxes;
    }

    public ArrayList<T> getBoxes() {
        return boxes;
    }

    public void setBoxes(T fruit, int value) throws resceduleFruitInBixException{ //добавление фруктов
        if (boxes.size() == 0 || fruit.getName().equals(boxes.get(0).getName())) {
            for (int i = 0; i < value; i++) {
                boxes.add(fruit);
            }
        } else {
            throw new resceduleFruitInBixException("Ошибка, в эту коробку ложим только " + boxes.get(0).getName());
            //System.out.println("Ошибка, в эту коробку ложим только " + boxes.get(0).getName());
        }
    }

    public double getWeight() { // показать вес коробки
        double wtBox = 0.0;
        for (T b : boxes) {
            wtBox += b.getWeight();
        }
        return wtBox;
    }

    @Override
    public String toString() {
        return "Box{" +
                " " + boxes.get(0).getName() + " " +
                boxes.size() + " штук" + " и вес " +
                this.getWeight() + " килограмм" + '}';
    }

    public boolean compare(Box<? extends Fruit> boxes){
        return this.getWeight() == boxes.getWeight();
    }

    public Box<T> pourItOverBoxes(Box<T> boxes) throws resceduleFruitInBixException{
        if(!boxes.getBoxes().get(0).getName().equals(this.boxes.get(0).getName())) {
            throw new resceduleFruitInBixException("Ошибка, в эту коробку ложим только " + this.boxes.get(0).getName());
        }
        for (T b : this.boxes) {
            boxes.setBoxes(b, 1);
        }
        return boxes;
    }



    public static void main(String[] args) {
        try {
            Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
            appleBox1.setBoxes(new Apple("Apple", 1), 5);
            System.out.println("1 " + appleBox1.toString());

            Box<Apple> appleBox2 = new Box<>(new ArrayList<>());
            appleBox2.setBoxes(new Apple("Apple", 1), 6);
            System.out.println("2 " + appleBox2.toString());

            Box<Orange> orangeBox1 = new Box<>(new ArrayList<>());
            orangeBox1.setBoxes(new Orange("Orange", 1.5), 4);
            System.out.println("3 " + orangeBox1.toString());

            Box<Orange> orangeBox2 = new Box<>(new ArrayList<>());
            orangeBox2.setBoxes(new Orange("Orange", 1.5), 3);
            System.out.println("4 " + orangeBox2.toString());

            System.out.println("Вес в коробках 2 и 3 одинаковый - это " + appleBox2.compare(orangeBox1));

            System.out.println("Пересыпем 3 " + orangeBox1.toString() + " в 4 " + orangeBox2.toString());
            orangeBox2 = orangeBox1.pourItOverBoxes(orangeBox2);
            System.out.println("Теперь в 4 " + orangeBox2.toString());


        } catch (resceduleFruitInBixException e) {
            e.printStackTrace();
        }

    }
}
