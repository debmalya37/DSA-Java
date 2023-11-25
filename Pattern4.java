import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting a word from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Displaying the pattern
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0, i + 1));
        }

        scanner.close();
    }
}
