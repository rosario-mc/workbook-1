package week3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateExercises {
    public static void main(String[] args) {

        //1. Print today's date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        //2.Print a specific date
        LocalDate ld2 = LocalDate.of(2025, 12, 25);
        System.out.println(ld2);

        //3.Get parts of a date
        DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter month = DateTimeFormatter.ofPattern("MMM");
        DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
        System.out.println("Year: " + ld2.format(year));
        System.out.println("Month: " + ld2.format(month));
        System.out.println("Day: " + ld2.format(day));

        //4.Print the current time
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        //5. Create a specific time
        LocalTime lt2 = LocalTime.of(15, 30);
        System.out.println(lt2);

        //6.Print parts of a time
        DateTimeFormatter time = DateTimeFormatter.ofPattern("KK:mma");
        DateTimeFormatter hours = DateTimeFormatter.ofPattern("KK");
        DateTimeFormatter minutes = DateTimeFormatter.ofPattern("mm");
        System.out.println("Time: " + lt2.format(time));
        System.out.println("Hour: " + lt2.format(hours));
        System.out.println("Minutes: " + lt2.format(minutes));

        //7. Create a LocalDateTime from date and time
        LocalDate date = LocalDate.of(2025, 4, 23);
        LocalTime time2 = LocalTime.of(14, 30);
        LocalDateTime dateTime = date.atTime(time2);
        System.out.println("Combined LocalDateTime: " + dateTime);

        //8. Print the current date and time
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //9. Add 1 week to today’s date
        LocalDateTime addDate = ldt.plusWeeks(1);
        System.out.println(addDate);

        //10. Subtract 3 days from a specific date
        LocalDate date2 = LocalDate.of(2024, 10, 15);
        LocalDate subDate = date2.minusDays(3);
        System.out.println(subDate);

        //11.Add 2 hours and 15 minutes to a LocalTime
        LocalTime addHoursMin = lt2.plusHours(2).plusMinutes(15);
        System.out.println(addHoursMin);

        //12. Calculate tomorrow's datetime
        LocalDateTime tomorrow = ldt.plusDays(1);
        System.out.println(tomorrow);

        //13. Parse a date from a string (yyyy-MM-dd)
        String sDate = "2025-04-01";
        LocalDate date1 = LocalDate.parse(sDate);
        System.out.println(date1);

        //14. Parse a time from a string (HH:mm)
        String sTime = "09:30";
        LocalTime time1 = LocalTime.parse(sTime);
        System.out.println(time1);

        //15. Parse a LocalDateTime from a string
        String slDT = "2025-04-01T09:30";
        LocalDateTime ldt1 = LocalDateTime.parse(slDT);
        System.out.println(ldt1);

        //16. Format a date using DateTimeFormatter
        LocalDate dateA = LocalDate.of(2025, 4, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = dateA.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
