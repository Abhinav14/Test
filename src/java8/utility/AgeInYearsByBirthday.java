package java8.utility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeInYearsByBirthday {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1985, 01, 23);
        LocalDate today = LocalDate.now();
        System.out.println(birthday);
        System.out.println(today);
        System.out.println(ChronoUnit.YEARS.between(birthday, today));
    }
}
