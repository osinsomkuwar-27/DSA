
import java.util.*;

public class IST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day from 1 to 7: ");
        int day = sc.nextInt();

        System.out.print("Enter GST hour: ");
        int hour = sc.nextInt();

        System.out.print("Enter GST minute: ");
        int minute = sc.nextInt();

        // GST → IST offset (+1 hour 30 minutes)
        minute += 30;
        hour += 1;

        // Handle minute overflow
        if (minute >= 60) {
            hour++;
            minute -= 60;
        }

        // Handle hour overflow
        if (hour >= 24) {
            day++;
            hour -= 24;
        }

        // Handle day overflow (1–7)
        if (day > 7) {
            day = 1;
        }

        System.out.println("IST Time Day: " + day
                + " Hour: " + hour
                + " Minute: " + minute);

        sc.close();
    }
}
