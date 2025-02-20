public class Adds {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(sumNumbers(numbers));
    }
    public static int sumNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
