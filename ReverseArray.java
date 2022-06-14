import java.util.Scanner;

//JAVA program to reverse the elements of an array
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] reverse = new int[n];
        System.out.println("Enter the Elements :");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            reverse[i] =arr[n-i-1];
        }
        System.out.println("Element Arrays are Reversed :");
        for(int i=0;i<n;i++){
            System.out.print(reverse[i]);
        }
    }

}
