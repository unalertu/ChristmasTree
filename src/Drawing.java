import java.util.*;
public class Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter level:");
        int levels = scanner.nextInt();
        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j <= levels-i; j++)  System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)  System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= levels-2; j++)  System.out.print(" ");
            System.out.println("| |");
        }

    }
}
