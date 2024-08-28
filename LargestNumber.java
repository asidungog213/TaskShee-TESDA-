import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("60: ");
            int num1 = scanner.nextInt();

            System.out.print("1000: ");
            int num2 = scanner.nextInt();

            System.out.print("62: ");
            int num3 = scanner.nextInt();

            int max = Math.max(Math.max(num1, num2), num3);

            if (num1 == num2 && num2 == num3) {
                System.out.println("All numbers are equal.");
            } else if (max == num1) {
                System.out.println("The largest number is: " + num1);
            } else if (max == num2) {
                System.out.println("The largest number is: " + num2);
            } else {
                System.out.println("The largest number is: " + num3);
            }
        }
    }
}