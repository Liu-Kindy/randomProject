import java.util.Scanner;

public class PercabanganExam {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int Belanja;
        int uang;
        int diskon = 0;

        System.out.print("Inputkan Total Belanja Anda : ");
        Belanja = a.nextInt();

        if (Belanja >= 1000000) {
            System.out.println("selamat anda mendapatkan diskon 20%");
            diskon = 20;
        } else if (Belanja >= 100000) {
            System.out.println("Selamat Anda Mendapatkan Diskon 10%");
            diskon = 10;
        } else {
            int kurang = 100000 - Belanja;
            System.out.println("Anda tidak mendapat diskon apapun");
            System.out.println("Silahkan tambahkan belanjaan sebesar "+kurang+" untuk mendapatkan minimal diskon 10%");
        }
        
        int total = Belanja * (100 - diskon) / 100;
        System.out.println("total yang harus di bayar: " + total);
        System.out.print("Berapa banyak uang yang di berikan: ");
        uang = a.nextInt();
        

        if (total > uang) {
            while (total>uang){
                int tambahan = total - uang;
                System.out.println("Uang anda kurang " + tambahan);
                System.out.print("masukan uang tambahan: ");
                int tambahanUang = a.nextInt();
                uang += tambahanUang;{
                
            }
            }
            if (total < uang) {
            System.out.println("uang anda lebih");
            int kembalian = uang - total;
            System.out.println("kembaliannya " + kembalian);
            } else {
            System.out.println("uang pas");
        }
        } else if (total < uang) {
            System.out.println("uang anda lebih");
            int kembalian = uang - total;
            System.out.println("kembaliannya " + kembalian);
        } else {
            System.out.println("uang pas");
            
        }
        
        System.out.println("terimaksih telah berbelanja");
    }
}
