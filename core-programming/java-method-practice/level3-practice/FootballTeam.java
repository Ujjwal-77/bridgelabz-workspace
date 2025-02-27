import java.util.Random;
public class FootballTeam {
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) sum += height;
        return sum;
    }
    public static double findMean(int[] heights) {
        return findSum(heights) / (double) heights.length;
    }
    public static int findShortest(int[] heights) {
        int shortest = Integer.MAX_VALUE;
        for (int height : heights) if (height < shortest) shortest = height;
        return shortest;
    }
    public static int findTallest(int[] heights) {
        int tallest = Integer.MIN_VALUE;
        for (int height : heights) if (height > tallest) tallest = height;
        return tallest;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];
        
        for (int i = 0; i < 11; i++) heights[i] = 150 + random.nextInt(101);
        
        System.out.println("Heights: " + java.util.Arrays.toString(heights));
        System.out.println("Shortest player: " + findShortest(heights) + " cm");
        System.out.println("Tallest player: " + findTallest(heights) + " cm");
        System.out.println("Mean height: " + findMean(heights) + " cm");
    }
}
