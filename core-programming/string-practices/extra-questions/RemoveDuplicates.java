import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicateCharacters(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                result.append(c);
                seen[c] = true;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("String after removing duplicates: " + removeDuplicateCharacters(input));
        scanner.close();
    }
}
