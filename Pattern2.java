import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting a word from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Displaying the pattern
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            for (int j = 0; j <= i; j++) {
                System.out.print(currentChar);
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
