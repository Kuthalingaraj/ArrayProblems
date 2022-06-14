import java.util.Scanner;

public class RemoverElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element :");
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.println("Enter the Arrays :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Position of the Number to Delete :");
        int pos = sc.nextInt();
        for(int i = pos;i<n-1;i++){
            arr[i] =arr[i+1];
        }
        n=n-1;
        System.out.println("Deleted Elemets Array :");
        for(int i =0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
