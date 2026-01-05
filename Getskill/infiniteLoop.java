import java.util.Scanner;

public class infiniteLoop {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int angka = -1; // Inisialisasi dengan nilai selain 0 untuk memulai loop
        while (angka != 0) {
            System.out.print("Masukkan angka (0 untuk keluar): ");
            angka = i.nextInt();
            if (angka == 0) {
                System.out.println("Program dihentikan.");
                break;
            }
            System.out.println("Anda memasukkan: " + angka);
        }
    }
}
