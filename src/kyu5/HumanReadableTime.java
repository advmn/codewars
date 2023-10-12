package kyu5;

public class HumanReadableTime {
    public static String makeReadable (int seconds){

        if (seconds < 0);

        return String.format("%02d:%02d:%02d", (seconds / 3600) % 100, (seconds / 60) % 60, seconds % 60);
    }
}
