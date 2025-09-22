import java.util.Scanner;
public class bioData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //menerima inputan
        System.out.print("Inputan Nama : ");
        String Nama = input.nextLine() ;

        System.out.print("Inputkan Nama panggilan : ");
        String nama = input.nextLine() ;

        System.out.print("Inputkan Kota lahir : ");
        String Kota = input.nextLine() ;

        System.out.print("Inputkan Umur : ");
        int Umur = input.nextInt() ;

        System.out.print("Inputkan tinggi : ");
        float tinggi = input.nextFloat() ;

        System.out.print("Inputkan Berat : ");
        double Berat = input.nextDouble() ;

        System.out.print("Inputkan Jenis klamin (L/P) : ");
        char Jenis = input.next().charAt(0) ;

        System.out.print("Sudah Menikah? : ");
        boolean nikah = input.nextBoolean() ;

        System.out.print("Apakah WNI? : ");
        boolean WNI = input.nextBoolean() ;






        //menampilkan output
        System.out.println("\n======= Output =======");
        System.out.println("Nama Lengakp : "+ Nama);
        System.out.println("Nama panggilan : "+ nama);
        System.out.println("Kota Lahir : "+ Kota);
        System.out.println("Umur : "+ Umur);
        System.out.println("tinggi : "+ tinggi);
        System.out.println("Berat : "+ Berat);

        System.out.println( "Jenis kelamin : "+ Jenis);
        System.out.println("Sudah Menikah? : "+ nikah);
        System.out.println("WNI? : "+ WNI);

}


}
