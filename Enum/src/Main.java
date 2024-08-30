import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.THURSDAY;
        System.out.println(weekDay);
        // Enum has two built in functions name and ordinal (order zero indexed)
        System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
            if (weekDay == DayOfTheWeek.FRIDAY) {
                System.out.println("TGIF");
            }
        }
    }

    public static DayOfTheWeek getRandomDay() {
        // how to get a random number with an upper bound of 7 non inclusive
        int randomInt = new Random().nextInt(7);
        // get all days from our enum
        var allDays = DayOfTheWeek.values();
        // Return by index
        return allDays[randomInt];
    }
}
