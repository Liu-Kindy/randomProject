import java.util.Scanner;

public class KotakBintangKosong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        int n = scanner.nextInt(); // Ukuran kotak
        System.out.println("output:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
