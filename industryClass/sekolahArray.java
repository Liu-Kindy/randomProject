public class sekolahArray {
    public static void main(String[] args) {
        String[] namaSekolah = {"smuhero", "smanrog", "smaga", "sempesa", "MA 5", "STM 6", "SMA 7", "SMK 8", "SMPN 9", "SDN 10"};
        for (int i = 0; i < namaSekolah.length; i++) {
            System.out.println("Sekolah ke-" + (i + 1) + ": " + namaSekolah[i]);
        }
    }
}
