package Lesson2;

public class CalculateScuare {
    public static void main(String[] args) {
        try {
            int rectangleSquare = square(-20, 15);
        } catch (noNegativeValuesAllovedException e) {
            e.printStackTrace();
        }
    }

    public static int square(int a, int b)  throws noNegativeValuesAllovedException {
        if (a < 0 || b < 0) {
            throw  new noNegativeValuesAllovedException("Отрицательные длины!");
        }
        return  a * b;
    }
}
