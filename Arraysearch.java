import java.util.Scanner;

public class Arraysearch {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Array :");
        int tar = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (tar == arr[i]) {
                System.out.println("Found the Position at" + i);
                flag = 1;
                break;
            }
        }
            if (flag == 0) {
                System.out.println("Target Element is not Founded :");
            }
        }
    }

