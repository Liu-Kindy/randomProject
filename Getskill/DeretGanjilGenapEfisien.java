import java.util.Scanner;

public class DeretGanjilGenapEfisien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM DERET BILANGAN GANJIL & GENAP ===");
        System.out.print("Masukkan panjang deret: ");
        int panjangDeret = scanner.nextInt();
        
        System.out.println("\n" + panjangDeret + " bilangan pertama:");
        System.out.println("========================");
        
        // Menampilkan bilangan ganjil (langsung increment 2)
        System.out.print("● Bilangan GANJIL: ");
        int bilanganGanjil = 1;
        int count = 0;
        
        do {
            System.out.print(bilanganGanjil);
            bilanganGanjil += 2;
            count++;
            if (count < (panjangDeret + 1) / 2) {
                System.out.print(" ");
            }
        } while (count < (panjangDeret + 1) / 2);
        
        System.out.println();
        
        // Menampilkan bilangan genap (langsung increment 2)
        System.out.print("● Bilangan GENAP: ");
        int bilanganGenap = 2;
        count = 0;
        
        do {
            System.out.print(bilanganGenap);
            bilanganGenap += 2;
            count++;
            if (count < panjangDeret / 2) {
                System.out.print(" ");
            }
        } while (count < panjangDeret / 2);
        
        System.out.println();
        
        scanner.close();
    }
}