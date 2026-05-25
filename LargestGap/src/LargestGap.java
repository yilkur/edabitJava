import java.util.Arrays;

public class LargestGap {
    public static int largestGap(int[] numbers) {
        Arrays.sort(numbers);
        int diff = 0;

        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int last = numbers[i-1];
            int tempDiff = current - last;

            if (tempDiff > diff) {
                diff = tempDiff;
            }
        }

        return diff;
    }
}
