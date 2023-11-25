
public class Pattern5 {
    public static void main(String[] args) {
        int n = 7; // Change the value of n to control the number of rows

        for (int i = 0; i < n; i++) {
            char currentChar = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(currentChar);
                currentChar++;
            }
            System.out.println();
        }
    }
}
