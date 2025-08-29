import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Assignement7 {
    public static void main(String[] args) {
        //Q1
        List<String> words = new ArrayList<>(Arrays.asList(
                "apple", "banana", "cherry", "date", "elderberry",
                "fig", "grape", "honeydew", "kiwi", "lemon"
        ));
        StringJoiner str = new StringJoiner(", ", "{", "}");
        for (String word : words) {
            str.add(word);
        }
        System.out.println(str);

        //Q2
        List<String> states = new ArrayList<>(Arrays.asList(
                "Andhra pradesh", "odissa", "tamil nadu", "kerala", "banglore",
                "telangana", "Uttar pradesd", "delhi", "mumbai", "kolkata"
        ));
        StringJoiner s1 = new StringJoiner("-");
        for (String word : states) {
            s1.add(word);
        }
        System.out.println(s1);

        List<String> cities = new ArrayList<>(Arrays.asList(
                "vizag", "bhavaneswar", "chennai", "cochin", "White city",
                "Hyderabad", "lucknow", "delhi", "maharastra", "west bengal"
        ));
        StringJoiner s2 = new StringJoiner(",");
        for (String word : cities) {
            s2.add(word);
        }
        System.out.println(s2);

        System.out.println(s1.merge(s2));
        System.out.println(s2.merge(s1));


        // Q3
        displayDateAndAfterTenDays();
        // Q4
        findSecondSundayNextMonth();
        // Q5
        calculateExperience();
        // Q6
        checkLeapYear();
        // Q7
        displayTimeAfter25Minutes();
        // Q8
        displayTimeBefore5Hours30Minutes();
    }


    // Q3
    public static void displayDateAndAfterTenDays() {
        LocalDate today = LocalDate.now();
        LocalDate afterTenDays = today.plusDays(10);
        System.out.println("\nQ3: Today's Date: " + today);
        System.out.println("Date after 10 days: " + afterTenDays);
    }

    // Q4
    public static void findSecondSundayNextMonth() {
        LocalDate firstDayNextMonth = LocalDate.now().plusMonths(1).withDayOfMonth(1);
        LocalDate firstSunday = firstDayNextMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        LocalDate secondSunday = firstSunday.plusWeeks(1);
        System.out.println("Second Sunday of next month: " + secondSunday);
    }

    // Q5
    public static void calculateExperience() {
        LocalDate joiningDate = LocalDate.of(2022, 2, 1);
        LocalDate today = LocalDate.now();
        Period experience = Period.between(joiningDate, today);
        System.out.printf(" Experience: %d years, %d months, %d days%n",
                experience.getYears(), experience.getMonths(), experience.getDays());
    }

    // Q6
    public static void checkLeapYear() {
        int currentYear = Year.now().getValue();
        boolean isLeap = Year.isLeap(currentYear);
        System.out.println(" Year: " + currentYear);
        System.out.println("Leap Year " + isLeap);
    }

    // Q7
    public static void displayTimeAfter25Minutes() {
        LocalTime now = LocalTime.now();
        LocalTime after25Min = now.plusMinutes(25);
        System.out.println("Current Time: " + now);
        System.out.println("Time after 25 minutes: " + after25Min);
    }

    // Q8
    public static void displayTimeBefore5Hours30Minutes() {
        LocalTime now = LocalTime.now();
        LocalTime beforeTime = now.minusHours(5).minusMinutes(30);
        System.out.println("Current Time: " + now);
        System.out.println("Time before 5 hours 30 minutes: " + beforeTime);
    }
}
