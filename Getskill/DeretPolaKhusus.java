import java.util.Scanner;

public class DeretPolaKhusus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM DERET BILANGAN 3 5 8 12 17... ===");
        System.out.print("Masukkan jumlah deret yang ingin ditampilkan: ");
        int n = scanner.nextInt();
        
        System.out.println("\nDeret bilangan:");
        System.out.println("===============");
        
        // Inisialisasi variabel
        int current = 3;  // Angka pertama
        int increment = 2; // Penambahan awal
        
        // Menampilkan deret
        for (int i = 1; i <= n; i++) {
            System.out.println(current);
            
            
            
            
            // Menghitung nilai berikutnya
            current += increment;
            increment++; // Increment bertambah 1 setiap iterasi
        }        
        scanner.close();
    }
}