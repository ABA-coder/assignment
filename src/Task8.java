import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(checkDigits(s, 0));
        }
        sc.close();
    }
    public static String checkDigits(String s, int index) {
        if (index == s.length()) {
            return "Yes";
        }
        if (!Character.isDigit(s.charAt(index))) {
            return "No";
        }
        return checkDigits(s, index + 1);
    }
}