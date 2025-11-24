import java.util.Scanner;

public class MenuProgramOperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        System.out.println("====================================");
        System.out.println("   PROGRAM KALKULATOR SEDERHANA");
        System.out.println("====================================");
        
        do {
            // Menampilkan menu
            System.out.println("\nMenu Pilihan:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda (1-3): ");
            
            pilihan = scanner.nextInt();
            
            // Memproses pilihan user
            switch (pilihan) {
                case 1:
                    System.out.println(">>> Anda memilih menu PENJUMLAHAN");
                    System.out.print("Masukkan bilangan pertama: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Masukkan bilangan kedua: ");
                    double b1 = scanner.nextDouble();
                    double hasilJumlah = a1 + b1;
                    System.out.println("Hasil: " + a1 + " + " + b1 + " = " + hasilJumlah);
                    break;
                    
                case 2:
                    System.out.println(">>> Anda memilih menu PENGURANGAN");
                    System.out.print("Masukkan bilangan pertama: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Masukkan bilangan kedua: ");
                    double b2 = scanner.nextDouble();
                    double hasilKurang = a2 - b2;
                    System.out.println("Hasil: " + a2 + " - " + b2 + " = " + hasilKurang);
                    break;
                    
                case 3:
                    System.out.println(">>> Program berhenti!");
                    break;
                    
                default:
                    System.out.println(">>> Pilihan tidak valid! Silakan pilih 1-3.");
            }
            
        } while (pilihan != 3);
        
        System.out.println("Terima kasih!");
        scanner.close();
    }
}