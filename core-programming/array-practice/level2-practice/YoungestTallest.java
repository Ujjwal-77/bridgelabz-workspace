import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        System.out.println("Enter the ages and heights of three person:");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
        }

        int youngest = Math.min(ages[0], Math.min(ages[1], ages[2]));
        
        double tallest = Math.max(heights[0], Math.max(heights[1], heights[2]));

        System.out.println("Youngest friend is " + youngest + " years old.");
        System.out.println("Tallest friend is " + tallest + " centimeters tall.");
    }
}
