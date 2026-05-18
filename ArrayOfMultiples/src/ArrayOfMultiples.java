public class ArrayOfMultiples {
    public static int[] arrayOfMultiples(int num, int length) {
        int[] multiples = new int[length];
        int multiple = num;

        for (int i = 0; i < multiples.length; i++) {
            multiples[i] = multiple;
            multiple += num;
        }

        return multiples;
    }
}
