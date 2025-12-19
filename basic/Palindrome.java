
import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(int num) {
        int original = num;   // store original number
        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("Number " + num + " is a Palindrome");
        } else {
            System.out.println("Number " + num + " is not a Palindrome");
        }
    }
}
