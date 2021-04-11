package Lesson3.DZ3;

public class Main { //Задание 1
    public static void main(String[] args) {
        Integer [] boxArreys = {1, 2, 3, 4, 5};
        changePositionInArrey(boxArreys, 2, 4);

    }

    public static <T> T[] changePositionInArrey(T [] arr, int a, int b) {
        for (T i : arr) { // до
            System.out.print(i + " ");
        }
        T t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
        System.out.println();
        for (T i : arr) { // после
            System.out.print(i + " ");
        }
        return arr;
    }



}
