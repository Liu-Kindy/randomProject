import java.util.Scanner;

public class ProjectSoftware {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("==========PERANGKAT PILIHAN=======");
        System.out.println("===================================");
        System.out.println("1. DESKTOP");
        System.out.println("2. LAPTOP");
        System.out.println("3. MINI PC");
        System.out.println("4. MONITOR");
        System.out.println("5. TABLET");
        System.out.println("6. SMART PHONE");
        System.out.println("7. SMART WATCH");
        System.out.println("8. HEADSEAT");
        System.out.println("9. KEYBOARD");
        System.out.println("10. MOUSE");
        System.out.println("===================================");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pilihan: ");
        int pilihan=input.nextInt();

        if(pilihan==1){
        System.out.println("Anda Memilih DESKTOP Harga Rp. 2.599.000");
        }
        else if(pilihan==2){
        System.out.println("Anda Memilih LAPTOP Harga Rp. 5.499.000");
        }
        else if(pilihan==3){
            System.out.println("Anda Memilih MINI PC Rp. 4.999.000");
        }
        else if(pilihan==4){
            System.out.println("Anda Memilih MONITOR Rp. 5.999.000");
        }
        else if(pilihan==5){
            System.out.println("Anda Memilih TABLET Rp. 9.499.000");
        }
        else if(pilihan==6){
            System.out.println("Anda Memilih SMART PHONE Rp. 1.599.000");
        }
        else if(pilihan==7){
            System.out.println("Anda Memilih SMART WATCH Rp. 299.000");
        }
        else if(pilihan==8){
            System.out.println("Anda Memilih HEATSEAT Rp. 59.000");
        }
        else if(pilihan==9){
            System.out.println("Anda Memilih KEYBOARD Rp. 200.000");
        }
        else if(pilihan==10){
            System.out.println("Anda Memilih MOUSE Rp. 99.000");
        }
        else{
            System.out.println("Pesanan Anda Tidak Ada Di Dalam Menu");
        } 
    }
}