import java.util.Scanner;

public class LeftArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element :");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the arrays :");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original arrays :");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        System.out.println("Left Traverse the Elements are :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
