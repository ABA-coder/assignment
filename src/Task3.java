import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (primeornot(n, 2)) {
                System.out.println("prime");
            } else {
                System.out.println("composite");
            }
        }
        sc.close();
    }
    public static boolean primeornot(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return primeornot(n, divisor + 1);
    }
}