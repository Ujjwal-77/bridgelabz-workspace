import java.util.Scanner;
public class WordLength {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static String[][] getWordsWithLength(String str) {
        String[] words = str.split(" ");
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(getLength(words[i]));
        }
        return wordLengthArray;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = input.nextLine();
        String[][] result = getWordsWithLength(str);
        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
