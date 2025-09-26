import java.util.Scanner;
public class inputKal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan angka yang ingin di jumlah : ");
        int angka1= input.nextInt();
        System.out.print("berapa banyak jumlah: ");
        int angka2= input.nextInt();
        

        int hasil = angka1+angka2; 
        System.out.println("hasil dari "+angka1+"+"+angka2+"="+hasil);




    }
    
}
