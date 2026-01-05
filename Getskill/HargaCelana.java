import java.util.Scanner;

public class HargaCelana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan pilihan merk
        System.out.println("=== PROGRAM PENENTU HARGA CELANA ===");
        System.out.println("Pilihan Merk:");
        System.out.println("1. ABC");
        System.out.println("2. DEF");
        System.out.print("Masukkan merk celana (ABC/DEF): ");
        String merk = scanner.nextLine().toUpperCase();
        
        // Meminta input ukuran
        System.out.print("Masukkan ukuran celana (26-34): ");
        int ukuran = scanner.nextInt();
        
        // Menentukan harga berdasarkan merk dan ukuran
        int harga = tentukanHarga(merk, ukuran);
        
        // Menampilkan hasil
        if (harga != -1) {
            System.out.println("\n=== HASIL PERHITUNGAN ===");
            System.out.println("Merk: " + merk);
            System.out.println("Ukuran: " + ukuran);
            System.out.println("Harga: Rp. " + String.format("%,d", harga));
        } else {
            System.out.println("\nInput tidak valid! Silakan coba lagi.");
            System.out.println("Pastikan:");
            System.out.println("- Merk: ABC atau DEF");
            System.out.println("- Ukuran: 26-34");
        }
        
        scanner.close();
    }
    
    // Method untuk menentukan harga berdasarkan merk dan ukuran
    public static int tentukanHarga(String merk, int ukuran) {
        int harga = -1; // Default value untuk input tidak valid
        
        if (merk.equals("ABC")) {
            if (ukuran >= 26 && ukuran <= 30) {
                harga = 160000;
            } else if (ukuran >= 31 && ukuran <= 34) {
                harga = 180000;
            }
        } else if (merk.equals("DEF")) {
            if (ukuran >= 26 && ukuran <= 30) {
                harga = 210000;
            } else if (ukuran >= 31 && ukuran <= 34) {
                harga = 220000;
            }
        }
        
        return harga;
    }
}