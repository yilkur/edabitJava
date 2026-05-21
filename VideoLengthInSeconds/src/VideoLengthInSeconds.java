public class VideoLengthInSeconds {
    public static int minutesToSeconds(String tm) {
        String[] parts = tm.split(":");
        int totalSec = 0;

        int sec = Integer.parseInt(parts[1]);

        if (sec >= 60) {
            return -1;
        }

        int minToSec = Integer.parseInt(parts[0]) * 60;

        totalSec += minToSec + sec;

        return totalSec;
    }
}
