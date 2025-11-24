import java.util.Scanner;

public class FibonacciDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM DERET FIBONACCI ===");
        System.out.print("Masukkan jumlah deret Fibonacci: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Jumlah deret harus lebih dari 0!");
        } else {
            System.out.println("\nDeret Fibonacci " + n + " bilangan pertama:");
            System.out.println("=================================");
            
            // Inisialisasi variabel
            int first = 1, second = 1;
            int count = 0;
            
            // Menampilkan deret Fibonacci menggunakan do-while
            do {
                if (count == 0) {
                    // Bilangan pertama
                    System.out.print(first);
                } else if (count == 1) {
                    // Bilangan kedua
                    System.out.print(" " + second);
                } else {
                    // Bilangan selanjutnya (jumlah dua bilangan sebelumnya)
                    int next = first + second;
                    System.out.print(" " + next);
                    first = second;
                    second = next;
                }
                
                count++;
            } while (count < n);
            
            System.out.println();
        }
        
        scanner.close();
    }
}