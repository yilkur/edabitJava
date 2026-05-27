import java.util.Arrays;

public class ConsecutiveNumbers {
    public static boolean cons(int[] arr) {
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i] - 1) {
                return false;
            }
        }

        return true;
    }
}
