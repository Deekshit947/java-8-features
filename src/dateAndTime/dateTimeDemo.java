package dateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class dateTimeDemo {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalTime nowTime = LocalTime.now();
        System.out.println("Current Time: " + nowTime);

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + nowDateTime);

        LocalDate customDate = LocalDate.of(2024, 5, 10);
        System.out.println("Custom Date: " + customDate);

        LocalTime customTime = LocalTime.of(10, 30, 45);
        System.out.println("Custom Time: " + customTime);

        System.out.println("Add 5 Days: " + today.plusDays(5));
        System.out.println("Minus 1 Month: " + today.minusMonths(1));

        System.out.println("Add 2 Hours: " + nowTime.plusHours(2));
        System.out.println("Minus 15 Minutes: " + nowTime.minusMinutes(15));

        DateTimeFormatter dateFormatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(dateFormatter);
        System.out.println("Formatted Date: " + formattedDate);

        LocalDate parsedDate =
                LocalDate.parse("10-05-2024", dateFormatter);
        System.out.println("Parsed Date: " + parsedDate);

        ZonedDateTime indiaTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usaTime =
                ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("India Time: " + indiaTime);
        System.out.println("USA Time: " + usaTime);

        LocalDate startDate = LocalDate.of(2020, 1, 1);
        Period period = Period.between(startDate, today);
        System.out.println("Years Difference: " + period.getYears());
        System.out.println("Months Difference: " + period.getMonths());
        System.out.println("Days Difference: " + period.getDays());

        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(12, 30);
        Duration duration = Duration.between(t1, t2);
        System.out.println("Hours Difference: " + duration.toHours());
        System.out.println("Minutes Difference: " + duration.toMinutes());

        long daysBetween =
                ChronoUnit.DAYS.between(startDate, today);
        System.out.println("Days Between Dates: " + daysBetween);
    }
}

