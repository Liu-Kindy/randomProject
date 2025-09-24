import java.util.Scanner;


public class TugasB1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //menerima inputan
        System.out.print("Inputan Nama : ");
        String Nama = input.nextLine() ;

        System.out.print("Inputkan Alamat : ");
        String Alamat = input.nextLine() ;

        System.out.print("Inputkan Kelas : ");
        String Kelas = input.nextLine() ;

        System.out.print("Inputkan Hobi : ");
        String Hobi = input.nextLine() ;

        System.out.print("Inputkan Cita-Cita : ");
        String Cita = input.nextLine() ;

        System.out.print("Inputkan Status : ");
        String Status = input.nextLine() ;

        System.out.print("Inputkan Tinggi Badan : ");
        int Tinggi = input.nextInt() ;

        System.out.print("Inputkan Berat Badan : ");
        int Berat = input.nextInt() ;

        





        //menampilkan output
        System.out.println("\n======= Output =======");
        System.out.println("Nama Lengakp : "+ Nama);
        System.out.println("Alamat : "+ Alamat);
        System.out.println("Kelas : "+ Kelas);
        System.out.println("Hobi : "+ Hobi);
        System.out.println("Cita-Cita : "+ Cita);
        System.out.println("Tinggi Badan : "+ Tinggi );
        System.out.println("Berat Badan : "+ Berat );
        System.out.println("Status : "+ Status);

    }
}