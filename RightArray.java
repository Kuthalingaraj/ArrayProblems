import java.util.Scanner;

//JAVA program to shift elements of a single dimensional array in the right direction by one position
public class RightArray {
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
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];

        }
        arr[0]=temp;
        System.out.println("Right Traverse the Elements are :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
