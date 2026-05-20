public class WarOfNumbers {
    public static int warOfNumbers(int[] numbers) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        return Math.abs(sumEven - sumOdd);
    }
}
