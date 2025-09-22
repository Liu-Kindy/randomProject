import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double Belanja;
        double uang;
        double diskon = 0;

        System.out.print("Inputkan Total Belanja Anda : ");
        Belanja = a.nextDouble();

        if (Belanja >= 100000) {
            System.out.println("selamat anda mendapatkan diskon 20%");
            diskon = 0.20;
        } else if (Belanja >= 50000) {
            System.out.println("Selamat Anda Mendapatkan Diskon 10%");
            diskon = 0.10;
        } else if (Belanja >= 20000) {
            System.out.println("selamat anda mendapatkan diskon 5%");
            diskon = 0.05;
        } else {
            System.out.println("Anda tidak mendapat diskon apapun");
        }

        System.out.print("Berapa banyak uang yang di berikan: ");
        uang = a.nextDouble();
        double total = Belanja * diskon;
        double totalb = Belanja - total;
        System.out.println("total yang harus di bayar: " + totalb);

        if (totalb > uang) {
            System.out.println("uang anda kurang");
            while (totalb>uang){
                double tambahan = totalb - uang;
                System.out.println("Uang anda kurang " + tambahan);
                System.out.print("masukan uang tambahan: ");
                double tambahanUang = a.nextDouble();
                uang += tambahanUang;{
                
                
            }
        }
        } else if (totalb < uang) {
            System.out.println("uang anda lebih");
            double kembalian = uang - totalb;
            System.out.println("kembaliannya " + kembalian);
        } else {
            
            
        }
        System.out.println("uang pas");
        System.out.println("terimaksih telah berbelanja");
    }
}
