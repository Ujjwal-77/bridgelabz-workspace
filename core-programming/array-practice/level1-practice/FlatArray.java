import java.util.Scanner;

public class FlatArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        System.out.println("Enter the elements of the array: ");
        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int[] flatArray = new int[row * col];

        int k = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                flatArray[k++] = arr[i][j];
            }
        }

        for (int i = 0; i < row * col; i++) {
            System.out.print(flatArray[i] + " ");
        }

    }

}
