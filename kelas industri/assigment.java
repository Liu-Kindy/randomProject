import java.util.Scanner;

public class assigment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2;
        
        System.out.print("masukan angka yang ingin di jumlah : ");
        angka1= input.nextInt();
        System.out.print("berapa banyhak jumlah: ");
        angka2= input.nextInt();

        angka1 += angka2;
        System.out.println("hasil dari angka1 di+ angka2= "+angka1);
        
    }
}
