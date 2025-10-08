public class absen {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println();
            System.out.println("kelas " + i);
            for (int j = 1; j <= 10; j++) {
                
                if (j == 8) {
                    break;
                }
                
                if (j == 3) {
                    continue;
                }
                
                System.out.println("siswa ke-" + j + " hadir");
            }
        }
    }
}