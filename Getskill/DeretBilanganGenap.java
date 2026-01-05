public class DeretBilanganGenap {
    public static void main(String[] args) {
        System.out.println("Deret bilangan genap antara 1 - 100:");
        System.out.println("=====================================");
        
        // Menggunakan for loop dengan pengecekan modulus
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Pengecekan bilangan genap
                System.out.print(i + " ");
            }
        }
    }
}