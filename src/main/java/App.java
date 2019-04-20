import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int m = 0;
        int r = 0;
        final Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("Ented `m` : ");
            try {
                m = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e1) {
                System.out.println("Incorrect data! Enter the number.");
            }
        }
        for (;;) {
            System.out.println("Enter `r` <= `m` : ");
            try {
                r = Integer.parseInt(sc.next());
                if (r <= m) break;
                else System.out.println("`r` must be less than or equal to `m` !");
            } catch (NumberFormatException e1) {
                System.out.println("Incorrect data! Enter the number.");
            }
        }

        System.out.println(Factorial.calculateFunction(m, r));
    }
}
