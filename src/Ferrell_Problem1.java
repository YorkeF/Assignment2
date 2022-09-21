import java.util.Scanner;

/*
Prompt the user for a number n. Find the number of digits in the number. Do NOT use
string length.
 */
public class Ferrell_Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = 0;
        boolean going = true;
        while (going) {
            try {
                System.out.println("Input an integer: ");
                input = scan.nextInt();
                going = false;
            } catch (Exception e) {
                scan.nextLine();
                if (e.toString() == "java.util.InputMismatchException") {
                    System.out.println("You entered something other than an Integer\nTry again");
                } else {
                    e.printStackTrace();
                }
            }
        }
        int digits = 0;
        if (input < 0) {
            for (int i = -1; i >= input; i *= 10) {
                digits++;
            }
        }
        if (input > 0) {
            for (int i = 1; i <= input; i *= 10) {
                digits++;
            }
        }
        if (input == 0) {
            digits++;
        }
        System.out.println("Your number has " + digits + " digits in it.");
    }
}