import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char removeChar = scanner.next().charAt(0);
        scanner.close();

        StringBuilder modifiedString = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch != removeChar) {
                modifiedString.append(ch);
            }
        }

        System.out.println("Modified String: \"" + modifiedString + "\"");
    }
}
