public class SecondsToHoursChallenge {
    public static void main(String[] args) {
        System.out.println(getDuration(3945));
        System.out.println(getDuration(3600));
        System.out.println(getDuration(60));
        System.out.println(getDuration(0));
        System.out.println(getDuration(-1));
        System.out.println(getDuration(999999999));
        System.out.println(getDuration(1, 99));
        System.out.println(getDuration(-1, 45));

    }

    public static String getDuration(int seconds) {

        if (seconds <= 0) {
            return (seconds + " seconds is an Invalid Value");
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        String hours = getDuration(minutes, remainingSeconds);

        return hours;
    }

    public static String getDuration(int minutes, int seconds) {
        if (minutes < 0) {
            return (minutes + "m is an Invalid Value");
        }

        if (seconds < 0 || seconds > 59) {
            return (seconds + "s is an Invalid Value");
        }
        int hours = minutes / 60;
        int remainingMin = minutes % 60;

        return (hours + "h " + remainingMin + "m " + seconds + "s");
    }
}
