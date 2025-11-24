import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM PENGHITUNG FAKTORIAL ===");
        System.out.print("Masukkan bilangan untuk dihitung faktorialnya: ");
        int n = scanner.nextInt();
        
        // Validasi input
        if (n < 0) {
            System.out.println("Error: Faktorial tidak terdefinisi untuk bilangan negatif!");
        } else {
            long faktorial = 1;
            
            System.out.print(n + "! = ");
            
            // Perulangan dengan decrement
            for (int i = n; i >= 1; i--) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" * ");
                }
                faktorial *= i;
            }
            
            System.out.println(" = " + faktorial);
        }
        
        scanner.close();
    }
}