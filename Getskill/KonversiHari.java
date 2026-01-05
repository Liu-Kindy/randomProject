import java.util.Scanner;

public class KonversiHari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM KONVERSI ANGKA KE HARI ===");
        System.out.print("Masukkan angka (1-7): ");
        
        int angka = scanner.nextInt();
        String hari = konversiHari(angka);
        
        System.out.println("\n=== HASIL KONVERSI ===");
        if (hari != null) {
            System.out.println("Angka " + angka + " = " + hari);
        } else {
            System.out.println("Angka " + angka + " tidak valid!");
            System.out.println("Masukkan angka antara 1-7.");
        }
        
        scanner.close();
    }
    
    // Method untuk mengkonversi angka ke nama hari
    public static String konversiHari(int angka) {
        switch (angka) {
            case 1:
                return "Minggu";
            case 2:
                return "Senin";
            case 3:
                return "Selasa";
            case 4:
                return "Rabu";
            case 5:
                return "Kamis";
            case 6:
                return "Jum'at";
            case 7:
                return "Sabtu";
            default:
                return null; // Return null untuk angka yang tidak valid
        }
    }
}