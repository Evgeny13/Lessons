package Lesson1.DZ1_StepchenkoEV;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Петр", 1000, 1);
        Cat cat = new Cat("Мурзик", 500, 3);
        Robot robot = new Robot("Chapi", 2000, 2);
        Track[] tracks = {new Track(250), new Track(500), new Track(1000)};
        Wall[] walls = {new Wall(1), new Wall(2), new Wall(3)};

        for (Track t : tracks) {
            for (Wall w : walls) {
                w.getIsJamp(human);
                w.getIsJamp(cat);
                w.getIsJamp(robot);
                t.getIsRun(human);
                t.getIsRun(cat);
                t.getIsRun(robot);
            }
        }

    }
}
