package Lesson1.game1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 80, 10);
        Dog dog = new Dog("Шарик", 100, 10);
        Car car = new Car("Mazda", 120, 1);

        Road[] roads = {new Road(100, 10), new Road(800, 120)};
        Pool[] pools = {new Pool(1000), new Pool(400)};

        double dogTime = 0;
        double catTime = 0;
        double carTime = 0;

        for (Road road : roads) {
            dogTime += road.getTimeToRunOvercomeRoad(dog);
            catTime += road.getTimeToRunOvercomeRoad(cat);
            carTime += road.getTimeToRunOvercomeRoad(car);
        }

        for (Pool pool : pools) {
            dogTime += pool.getTimeToOvercomePool(dog);
            catTime += pool.getTimeToOvercomePool(cat);
            carTime += pool.getTimeToOvercomePool(car);
        }

        System.out.println("Время собаки " + dogTime);
        System.out.println("Время кота " + catTime);
        System.out.println("Время машины " + carTime);
    }
}
