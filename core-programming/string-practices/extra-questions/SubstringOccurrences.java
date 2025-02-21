import java.util.Scanner;

public class SubstringOccurrences {
    public static int countOccurrences(String text, String sub) {
        int count = 0, index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String sub = scanner.nextLine();
        System.out.println("Occurrences: " + countOccurrences(text, sub));
        scanner.close();
    }
}
