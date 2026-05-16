public class GetWordCount {
    public static int countWords(String s) {
        String[] words = s.split(" ");
        return words.length;
    }
}
