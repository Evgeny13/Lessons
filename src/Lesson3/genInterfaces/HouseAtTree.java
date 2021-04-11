package Lesson3.genInterfaces;

public class HouseAtTree<T extends Animal & Flyable> {
    public T owner;

    public static void main(String[] args) {
        Cat cat = new Cat();
        Eagle eagle = new Eagle();
        HouseAtTree<Eagle> eagleHouseAtTree = new HouseAtTree<>();
        eagleHouseAtTree.owner = eagle;
    }
}
