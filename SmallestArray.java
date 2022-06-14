import java.util.Scanner;

//JAVA program to find smallest of n numbers in a given array
public class SmallestArray {

    public static void main(String[] args) {
        int small;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Arrays");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        small = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]<small) {
                small =arr[i];
            }
        }
        System.out.println("Smallest Array is :" + small);

    }
}
