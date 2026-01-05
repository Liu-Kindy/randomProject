public class InfiniteLoopHentikan {
    public static void main(String[] args) {
        System.out.println("=== INFINITE LOOP YANG DIHENTIKAN PADA ANGKA 10 ===");
        
        // Infinite loop dimulai dari 1
        for (int i = 1; i > 0; i++) {
            System.out.println("Angka: " + i);
            
            // Menghentikan perulangan ketika mencapai angka 10
            if (i == 10) {
                System.out.println("Perulangan dihentikan pada angka 10!");
                break; // Menghentikan perulangan
            }
        }
        
        System.out.println("Program selesai.");
    }
}