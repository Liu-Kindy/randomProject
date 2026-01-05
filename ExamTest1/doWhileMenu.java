import java.util.Scanner;

public class doWhileMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. bilangan ganjil");
            System.out.println("2. bilangan genap");
            System.out.println("3. Keluar");
            System.out.print("masukkan pilihan anda: ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println("Anda memilih bilangan ganjil.\n");
                System.out.print("Masukkan batas bilangan ganjil: ");
                int batasGanjil = input.nextInt();
                System.out.println("Bilangan ganjil hingga " + batasGanjil + ":");
                for (int i = 1; i <= batasGanjil; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.println("\n");
            } else if (pilihan == 2) {
                System.out.println("Anda memilih bilangan genap.\n");
                System.out.print("Masukkan batas bilangan genap: ");
                int batasGenap = input.nextInt();
                System.out.println("Bilangan genap hingga " + batasGenap + ":");
                for (int i = 2; i <= batasGenap; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.println("\n");
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);
        System.out.println("Terimakasih telah menggunakan program ini.");
    }
}
