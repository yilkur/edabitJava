public class HowMuchIsTrue {
    public static int countTrue(boolean[] arr) {
        int count = 0;

        for (boolean el : arr) {
            if (el) {
                count++;
            }
        }

        return count;
    }
}
