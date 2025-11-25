public class DeretGenapContinue {
    public static void main(String[] args) {
        System.out.println("=== DERET BILANGAN GENAP 1-20 ===");
        System.out.println();
        
        System.out.print("Deret bilangan genap: ");
        
        for (int i = 1; i <= 20; i++) {
            // Skip bilangan ganjil menggunakan continue
            if (i % 2 != 0) {
                continue; // Langsung melanjutkan ke iterasi berikutnya
            }
            
            // Kode ini hanya dijalankan untuk bilangan genap
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n");
    }
}