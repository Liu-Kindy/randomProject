import java.util.Scanner;
public class bioData2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //menerima inputan
        System.out.print("Inputan Nama Lengkap: ");
        String Nama = input.nextLine() ;

        System.out.print("Inputkan Usia : ");
        int Umur = input.nextInt() ;

        System.out.print("Inputkan Kota Asal : ");
        String Kota = input.next() ;

        System.out.print("Inputkan tinggi : ");
        float tinggi = input.nextFloat() ;






        //menampilkan output
        System.out.println("\n======= Output =======");
        System.out.println("Nama Lengakp : "+ Nama);
        System.out.println("Kota Lahir : "+ Kota);
        System.out.println("Umur : "+ Umur);
        System.out.println("tinggi : "+ tinggi);


}


}
