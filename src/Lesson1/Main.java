package Lesson1;

public class Main {
    public static void main(String[] args) {
//        Cat cat1;
//        cat1 = new Cat();
//        System.out.println("Имя кота" + cat1.name);
//        System.out.println("Возраст кота" + cat1.age);
//        cat1.setName("Мурзик");
//        cat1.setAge(5);
//        cat1.setColor("Белый");
//        Cat cat2 = new Cat("Барсик", 1, "Черный");
//        Cat cat3 = new Cat();
        //cat3.setName("Леопольд").setAge(3).setColor("Серый");
//        Cat cat2 = new Cat();
//        cat2.setName("Cat");
//        System.out.println();
//        Wolf wolf = new Wolf();
//        wolf.setAge(4);
//
//        Util.makeAnimalOlder(wolf);
//        System.out.println("Возраст волка :" + wolf.getAge());
        Wolf wolf = new Wolf();
        Animal cat = new Cat();
        cat.voice();
        ((Cat)cat).jamp();

    }
}