import java.util.Scanner;

//JAVA program to sort the elements of an array in Descending order
public class Sortarraydes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Unsorted Arrays :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Descending  order of array is");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
