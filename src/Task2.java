import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = Sum(arr, n);
        double average = (double) sum / n;
        System.out.println(sum);
        System.out.println(average);
        sc.close();
    }
    public static int Sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + Sum(arr, n - 1);
    }
}