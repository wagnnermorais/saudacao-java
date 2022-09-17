import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        LocalDate today = LocalDate.now();
        LocalDateTime hourNow = LocalDateTime.now();
        LocalDateTime minutesNow = LocalDateTime.now();
        Locale usa = new Locale("en", "US");

        System.out.println("Welcome, " + name + "!");
        if(hourNow.getHour() >= 6 && hourNow.getHour() < 12) {
            System.out.println("Today is " + today.getDayOfWeek().getDisplayName(TextStyle.FULL, usa) + " " + today.getDayOfMonth() + "/" + today.getMonthValue() + "/" + today.getYear() + ", " + hourNow.getHour() + ":" + minutesNow.getMinute() + ". Good morning!");
        } else if(hourNow.getHour() >= 12 && hourNow.getHour() < 18) {
            System.out.println("Today is " + today.getDayOfWeek().getDisplayName(TextStyle.FULL, usa) + " " + today.getDayOfMonth() + "/" + today.getMonthValue() + "/" + today.getYear() + ", " + hourNow.getHour() + ":" + minutesNow.getMinute() + ". Good afternoon!");
        } else {
            System.out.println("Today is " + today.getDayOfWeek().getDisplayName(TextStyle.FULL, usa) + " " + today.getDayOfMonth() + "/" + today.getMonthValue() + "/" + today.getYear() + ", " + hourNow.getHour() + ":" + minutesNow.getMinute() + ". Good evening!");
        }
    }
}