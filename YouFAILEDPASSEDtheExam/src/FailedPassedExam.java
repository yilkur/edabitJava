public class FailedPassedExam {
    static int getScore(String stringScore) {
        return Integer.parseInt(stringScore.split("%")[0]);
    }

    public static String gradePercentage(String userScore, String passScore) {
        int userScoreInt = getScore(userScore);
        int passScoreInt = getScore(passScore);

        return userScoreInt >= passScoreInt ? "You PASSED the Exam" : "You FAILED the Exam";
    }
}
