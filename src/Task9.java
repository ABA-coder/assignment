import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(count(s));
        }
        sc.close();
    }
    public static int count(String s) {
        if (s.equals("")) {
            return 0;
        }
        return 1 + count(s.substring(1));
    }
}