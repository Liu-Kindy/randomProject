public class advLoop {
    public static void main(String[] args) {
        System.out.println("==Perulangan dengan break==");
        for (int i = 1; i <= 10; i++) {
            System.out.println("ini adalah perulangan ke-" + i);
            
            if (i == 5) {
                break;
            }
        }
        System.out.println("==Perulangan dengan continue==");
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println("ini adalah perulangan ke-" + j);
        }
        System.out.println("==Perulangan bersarang (nested loop)==");
        for (int m = 1; m <= 3; m++) {
            System.out.println("Perulangan luar ke-" + m);
            for (int n = 1; n <= 3; n++) {
                System.out.println("  Perulangan dalam ke-" + n);
            }
        }
        
    }
}