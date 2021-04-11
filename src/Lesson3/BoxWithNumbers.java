package Lesson3;

public class BoxWithNumbers<T extends Number> {
    private T[] nums;

    public BoxWithNumbers(T ... nums) {
        this.nums = nums;
    }

    public T[] getNums() {
        return nums;
    }

    public void setNums(T[] nums) { // ... - VarArgs - Variable Arguments List - список переменной длины в котором лежат аргументы
        this.nums = nums;
    }

    public double avg() {
        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    public boolean isSameAvg(BoxWithNumbers<? extends Number> box) { // vildCard - ? (extends - ограничение сверху, super - ограничение снизу )
        return Math.abs(this.avg() - box.avg()) < 0.0001;
    }

    public static <U extends Number> U getFirstElement(BoxWithNumbers<U> boxWithNumbers) {
        return boxWithNumbers.nums[0];
    }


    public static void main(String[] args) {
        BoxWithNumbers<Integer> intBox1 = new BoxWithNumbers<>(1, 4, 6);
        System.out.println(BoxWithNumbers.getFirstElement(intBox1));
        BoxWithNumbers<Integer> intBox2 = new BoxWithNumbers<>(1, 4, 6);
        BoxWithNumbers<Double> dubBox3 = new BoxWithNumbers<>(1.1, 1.4, 1.6);
        System.out.println(intBox1.isSameAvg(dubBox3));


    }
}
