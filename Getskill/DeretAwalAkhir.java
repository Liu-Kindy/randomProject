public class DeretAwalAkhir {
    public static void main(String[] args) {
        System.out.println("=== DERET 5 ANGKA AWAL & 5 ANGKA AKHIR ===");
        System.out.println("Range: 1-20");
        System.out.println();        
        System.out.print("Hasil: ");
        
        for (int i = 1; i <= 20; i++) {
            // Skip angka 6-15 menggunakan continue
            if (i > 5 && i < 16) {
                continue; // Langsung melanjutkan ke iterasi berikutnya
            }
            
            // Kode ini hanya dijalankan untuk angka 1-5 dan 16-20
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n");
    }
}