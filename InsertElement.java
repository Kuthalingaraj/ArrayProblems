import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements :");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the Arrays :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Insert Number :");
        int number = sc.nextInt();
        System.out.println("Enter the Insert Number Position :");
        int pos = sc.nextInt();
        
        
        for(int i= n-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        n=n+1;
        arr[pos]=number;
        System.out.println("\n Inserting new Element is :");
        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
       
    }

}
