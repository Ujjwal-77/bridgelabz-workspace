import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        scanner.close();

        LocalDate date = LocalDate.parse(inputDate, formatter);
        date = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Final Date: " + date.format(formatter));
    }
}