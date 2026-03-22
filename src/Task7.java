import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            reverseInput(n, sc);
        }
        sc.close();
    }
    public static void reverseInput(int n, Scanner sc) {
        if (n <= 0) {
            return;
        }
        int current = sc.nextInt();
        reverseInput(n - 1, sc);
        System.out.println(current);
    }
}