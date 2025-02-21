import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] frequency = new int[256];
        for (char ch : input.toCharArray()) {
            frequency[ch]++;
        }

        char mostFrequentChar = input.charAt(0);
        int maxCount = 0;

        for (char ch : input.toCharArray()) {
            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequentChar = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
