import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("radar, madam, level: ");
            String input = scanner.nextLine();

            String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            boolean isPalindrome = cleanedInput.equals(new StringBuilder(cleanedInput).reverse().toString());

            System.out.println(isPalindrome ? "The input string is a palindrome." : "The input string is not a palindrome.");
        }
    }
}