import java.util.Scanner;

public class AngkaTerbesarSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM PENENTU ANGKA TERBESAR ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        
        System.out.println("\n=== HASIL ===");
        
        if (angka1 > angka2) {
            System.out.println(angka1 + " lebih besar dari " + angka2);
        } else if (angka2 > angka1) {
            System.out.println(angka2 + " lebih besar dari " + angka1);
        } else {
            System.out.println("Kedua angka sama besar: " + angka1);
        }
        
        scanner.close();
    }
}