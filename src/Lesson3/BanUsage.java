package Lesson3;

import Lesson3.genInterfaces.Animal;

public class BanUsage {
    public static void main(String[] args) {
        Object[] array = new String[2];
        array[0] = "sdvasdv";

        Lesson3.Cat cat1 = new Cat("Murzik",1);
        Animal animal = cat1;                               //ковариантные
        GenBox<Integer> genBox = new GenBox<>(1);
        //GenBox<Number> genBox1 = genBox;                    //инвариантные


        //GenBox<Object>[] array2 = new GenBox<String>[5];
    }
}
