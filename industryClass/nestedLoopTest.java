public class nestedLoopTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Perulangan luar ke-" + i);
            for (int j = 1; j <= 5; j++) {
                if (j == 5) {
                    continue;
                }
                System.out.println("  Perulangan dalam ke-" + j);
            }
            if (i == 5) {
                break;
            }
        }
    }
}
