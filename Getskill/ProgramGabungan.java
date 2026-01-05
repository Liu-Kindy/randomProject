import java.util.Scanner;

public class ProgramGabungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====================================");
        System.out.println("      PROGRAM MULTIFUNGSI");
        System.out.println("====================================");
        
        int pilihan;
        do {
            // Menampilkan menu
            System.out.println("\nPilihan menu:");
            System.out.println("1. Penentuan Angka Terbesar");
            System.out.println("2. Penentuan Angka Ganjil dan Genap");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda (1-3): ");
            
            pilihan = scanner.nextInt();
            
            // Memproses pilihan user
            switch (pilihan) {
                case 1:
                    programAngkaTerbesar(scanner);
                    break;
                case 2:
                    programGanjilGenap(scanner);
                    break;
                case 3:
                    System.out.println("\nTerima kasih telah menggunakan program!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid! Silakan pilih 1-3.");
            }
            
        } while (pilihan != 3);
        
        scanner.close();
    }
    
    // Program untuk menentukan angka terbesar (Tugas 7)
    public static void programAngkaTerbesar(Scanner scanner) {
        System.out.println("\n=== PROGRAM MENENTUKAN ANGKA TERBESAR ===");
        
        // Input angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        
        // Input angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        
        // Menentukan angka terbesar
        double terbesar = tentukanTerbesar(angka1, angka2);
        
        // Menampilkan hasil
        System.out.println("\n=== HASIL PERBANDINGAN ===");
        System.out.println("Angka pertama: " + angka1);
        System.out.println("Angka kedua: " + angka2);
        
        if (angka1 == angka2) {
            System.out.println("Kedua angka SAMA BESAR");
        } else {
            System.out.println("Angka terbesar: " + terbesar);
        }
    }
    
    // Method untuk menentukan angka terbesar
    public static double tentukanTerbesar(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    // Program untuk menentukan ganjil genap (Tugas 8)
    public static void programGanjilGenap(Scanner scanner) {
        System.out.println("\n=== PROGRAM PENENTU BILANGAN GANJIL & GENAP ===");
        
        // Input angka pertama
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        
        // Input angka kedua
        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
        
        // Menentukan ganjil/genap
        System.out.println("\n=== HASIL ===");
        System.out.println("Angka pertama: " + angka1 + " adalah " + cekGanjilGenap(angka1));
        System.out.println("Angka kedua: " + angka2 + " adalah " + cekGanjilGenap(angka2));
    }
    
    // Method untuk mengecek ganjil/genap
    public static String cekGanjilGenap(int angka) {
        if (angka % 2 == 0) {
            return "GENAP";
        } else {
            return "GANJIL";
        }
    }
}