package Lesson3;

import Lesson3.genInterfaces.Animal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cat extends Animal implements Comparable<Cat> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Cat[] cats = new Cat[] {new Cat("Мурзик", 1), new Cat("Персик", 8), new Cat("Черныш", 2)};

        Arrays.sort(cats);

        System.out.println(Arrays.toString(cats));
    }

    @Override
    public int compareTo(Cat cat) {
        return cat.age - this.age;
    }
}
