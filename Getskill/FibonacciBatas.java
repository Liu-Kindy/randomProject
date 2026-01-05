public class FibonacciBatas {
    public static void main(String[] args) {
        System.out.println("=== DERET FIBONACCI DI BAWAH 200 ===");
        System.out.println("Batas nilai deret maksimal: 100");
        
        int first = 1;
        int second = 1;
        int count = 0;
        
        System.out.print("Deret Fibonacci: ");
        
        // Perulangan tak terhingga
        while (true) {
            int current;
            
            if (count == 0) {
                current = first;
            } else if (count == 1) {
                current = second;
            } else {
                current = first + second;
                first = second;
                second = current;
            }
            
            // Hentikan perulangan jika nilai >= 200
            if (current >= 200) {
                break;
            }
            
            // Tampilkan nilai
            System.out.print(current);
            count++;
            
            // Tambahkan koma jika bukan elemen terakhir
            if (first + second < 200) {
                System.out.print(", ");
            }
        }
        
        System.out.println("\nTotal bilangan Fibonacci yang ditampilkan: " + count);
        System.out.println("Nilai tertinggi dalam deret: " + second);
    }
}