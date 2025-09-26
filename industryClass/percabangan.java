import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("masukan angka pertama  = ");
        int angka=input.nextInt(); 
        System.out.print("masukan angka kedua    = ");
        int angka1=input.nextInt();

        if(angka > angka1){
            System.out.println(angka+" lebih dari "+angka1);
        }else if(angka < angka1){
            System.out.println(angka+" kurang dari "+angka1);
        }else{
            System.out.println(angka+" sama dengan "+angka1);
        }



    }
}
