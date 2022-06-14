import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        System.out.println("Enter the Number of Rows :");
        row = sc.nextInt();
        System.out.println("Enter the Number of Columns :");
        column = sc.nextInt();
        int mat[][] = new int[row][column];
        System.out.println("Enter the Element of Matrices :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Element of Matrices are :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");

        }
    }
}
