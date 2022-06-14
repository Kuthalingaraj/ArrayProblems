import java.util.Scanner;

public class Largestelement {
    public static void main(String[] args) {
        int lar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements :");
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.println("Enter the Arrays :");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        lar = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>lar){
                lar = arr[i];
            }
        }
        System.out.println("Largest Element in the Array :"+lar);
    }
}
