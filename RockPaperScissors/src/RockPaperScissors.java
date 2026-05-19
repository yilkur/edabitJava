import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {
    public static String rps(String s1, String s2) {
        if (s1.equals(s2)) {
            return "TIE";
        }

        Map<String, String> combinations = new HashMap<>();

        combinations.put("rockscissors", "Player 1 wins");
        combinations.put("paperrock", "Player 1 wins");
        combinations.put("scissorspaper", "Player 1 wins");

        combinations.put("scissorsrock", "Player 2 wins");
        combinations.put("rockpaper", "Player 2 wins");
        combinations.put("paperscissors", "Player 2 wins");

        return combinations.getOrDefault(s1 + s2, "Ungültige Eingabe!");
    }
}
