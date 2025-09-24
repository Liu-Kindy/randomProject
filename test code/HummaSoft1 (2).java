import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
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
            System.out.println("Belanja Anda Kurang Dari Rp. 500,000,00");
            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');

            kursIndonesia.setDecimalFormatSymbols(formatRp);

            System.out.println("Silahkan Tambah Lagi Belanja Nya Senilai " + kursIndonesia.format(Selisih_Belanja));
            System.out.println("Agar Bisa Mendapatkan Bonus Gantungan Kunci");
        }
    }
}
