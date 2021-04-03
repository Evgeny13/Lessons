package Lesson2.DZ2;

public class Main {
    public static void main(String[] args) {
        String [][] intArr = new String[][]{{"2", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            printArr(intArr);
        } catch (MySizeArreyException e) {
            e.printStackTrace();
        } catch (MyArreyDataException exception) {
            exception.printStackTrace();
        }
    }

    public static void printArr(String[][] intArr) throws MySizeArreyException, MyArreyDataException {
        Integer integer;
        if (intArr.length != 4 || intArr[0].length != 4) {
            throw new MySizeArreyException("Массив должен быть 4 х 4");
        }
        int t = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                char [] chars = intArr[i][j].toCharArray();
                for (char ch : chars) {
                    if (Character.isDigit(ch)) {
                    } else {
                        throw new MyArreyDataException("Элемент intArr[" + i + "][" + j + "]: " + intArr[i][j] + " не преобразовался в число");
                    }
                }
                t += Integer.parseInt(intArr[i][j].trim());
            }
        }
        System.out.println("Сумма всех членов массива: " + t);


    }




}
