import java.util.Scanner;

public class uncountedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kondisi = "tidak";
        while (kondisi.equals("tidak")) {
            System.out.println("perogram terus berjalan sampai user menjawab ya");
            System.out.print("Apakah anda ingin berhenti? (ya/tidak): ");
            kondisi = scanner.nextLine().toLowerCase();
        }
    }
}
