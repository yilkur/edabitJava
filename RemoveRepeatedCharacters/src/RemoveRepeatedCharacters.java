public class RemoveRepeatedCharacters {
    public static String unrepeated(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String currentChar = String.valueOf(str.charAt(i));

            if (result.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
