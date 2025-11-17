import java.util.Scanner;

public class HummaSoft1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int Belanja;

        System.out.print("Inputkan Total Belanja Anda : ");
        Belanja = a.nextInt();

        if (Belanja >= 500000) {
            System.out.println("Selamat Anda Mendapatkan Hadiah Gantungan Kunci");
        } else {
            int Selisih_Belanja = 500000 - Belanja;
            System.out.println("Belanja Anda Kurang Dari Rp. 500000");
           

            System.out.println("Silahkan Tambah Lagi Belanja Nya Senilai " + Selisih_Belanja);
            System.out.println("Agar Bisa Mendapatkan Bonus Gantungan Kunci");
        }
    }
}
