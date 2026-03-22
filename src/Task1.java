import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            printD(number);
        }
        sc.close();
    }
    public static void printD(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }
        if (n < 10) {
            System.out.println(n);
        } else {
            printD(n / 10);
            System.out.println(n % 10);
        }
    }
}