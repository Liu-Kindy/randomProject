import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM PENENTU BILANGAN GANJIL & GENAP ===");
        
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
        
        scanner.close();
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