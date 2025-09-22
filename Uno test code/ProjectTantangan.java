import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class ProjectTantangan {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int Pilihan=0,Harga=0,Pilihan_Jenis=0,Jumlah,Total=0;

        System.out.println("===================================");
        System.out.println("============    MENU    ===========");
        System.out.println("===================================");
        System.out.println("1. PROCESSOR");
        System.out.println("2. LAPTOP");
        System.out.println("3. MINI PC");
        System.out.println("4. MONITOR");
        System.out.println("5. iPad");
        System.out.println("===================================");
        System.out.print("PRODUK YANG MAU DIPILIH : ");
        Pilihan = a.nextInt();

        switch (Pilihan) {
            case 1:
                System.out.println("PROCESSOR");
                System.out.println("PILIHAN");
                System.out.println("1. AMD CPU RYZEN 7 7700X");
                System.out.println("2. INTEL Core i7-11700F Processor");
                System.out.print("MASUKAN PILIHAN : ");
                Pilihan_Jenis = a.nextInt();
                if (Pilihan_Jenis==1) {
                    System.out.println("PROCESSOR AMD CPU RYZEN 7 7700X");
                    Harga = 5699000;
                }
                else{
                    System.out.println("PROCESSOR INTEL Core i7-11700F Processor");
                    Harga = 4999000;
                }
                break;
            case 2:
                System.out.println("LAPTOP");
                System.out.println("PILIHAN");
                System.out.println("1. Infinix INBOOK X2");
                System.out.println("2. Xiaomi RedmiBook 15");
                System.out.print("MASUKAN PILIHAN : ");
                Pilihan_Jenis = a.nextInt();
                if (Pilihan_Jenis==2) {
                    System.out.println("LAPTOP Infinix INBOOK X2");
                    Harga = 5000000;
                }
                else{
                    System.out.println("LAPTOP");
                    Harga = 300000;
                }
                break;
            case 3:
                System.out.println("MINI PC");
                System.out.println("PILIHAN");
                System.out.println("1. ASUS Mini PC PN62 (Core i5-10210U");
                System.out.println("2. ELL OptiPlex 3070 MFF (Core i5-8500, 8GB, 500GB HDD)");
                System.out.print("MASUKAN PILIHAN : ");
                Pilihan_Jenis = a.nextInt();
                if (Pilihan_Jenis==3) {
                    System.out.println("ASUS Mini PC PN62 (Core i5-10210U");
                    Harga = 12311000;
                }
                else{
                    System.out.println("MINI PC ELL OptiPlex 3070 MFF (Core i5-8500, 8GB, 500GB HDD)");
                    Harga = 11100500;
                }
                break;
            case 4:
                System.out.println("MONITOR");
                System.out.println("PILIHAN");
                System.out.println("1. ASUS Monitor LED 27 Inch MX27U");
                System.out.println("2. SAMSUNG QLED Gaming Monitor 49 Inch");
                System.out.print("MASUKAN PILIHAN : ");
                Pilihan_Jenis = a.nextInt();
                if (Pilihan_Jenis==4) {
                    System.out.println("ASUS Monitor LED 27 Inch MX27U");
                    Harga = 11904500;
                }
                else{
                    System.out.println("SAMSUNG QLED Gaming Monitor 49 Inch");
                    Harga = 17054000;
                }
                break;
            case 5:
                System.out.println("iPad");
                System.out.println("PILIHAN");
                System.out.println("1. APPLE iPad Mini 6 2021 Wifi");
                System.out.println("2. APPLE iPad Mini 6 2021 Wifi Cellular");
                System.out.print("MASUKAN PILIHAN : ");
                Pilihan_Jenis = a.nextInt();
                if (Pilihan_Jenis==5) {
                    System.out.println("APPLE iPad Mini 6 2021 Wifi");
                    Harga = 12613000;
                }
                else{
                    System.out.println("APPLE iPad Mini 6 2021 Wifi Cellular");
                    Harga = 15640000;
                }
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
        }

        System.out.print("JUMLAH PRODUK YANG INGIN DI PESAN : ");
        Jumlah = a.nextInt();

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        Total = Harga*Jumlah;
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        System.out.printf("Total Yang Di Bayar : "+ kursIndonesia.format(Total));
    }
}