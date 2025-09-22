import java.util.Scanner;

public class HummaTech {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double Belanja;
        double diskon;

        System.out.print("Inputkan Total Belanja Anda : ");
        Belanja = a.nextInt();

        if(Belanja >= 100000){
            System.out.println("selamat anda mendapatkan diskon 20%");
            diskon=20;
            double total=Belanja * (1 - (diskon / 100));
            double kembalian=Belanja - total;
            System.out.println("kembaliannya "+kembalian);
        }else if (Belanja >= 50000) {
            System.out.println("Selamat Anda Mendapatkan Diskon 10%");
        }else if(Belanja >= 20000){
            System.out.println("selamat anda mendapatkan diskon 5%");
        }else {
            System.out.println("Terimakasih telah berbelanja");
        }
    }
}
