import java.io.*;;


public class TugasB2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inputkan Nama Sekolah : ");
        String Nama= input.readLine();

        System.out.print ("Inputkan Jarak Rumah Ke Sekolah : ");
        double Desimal = Double.parseDouble(input.readLine());

        System.out.print("Inputkan Kde Plat Nomer Kendaraan : ");
        char Plat = input.readLine().charAt(0);

        System.out.print ("Inputkan Anak Ke Berapa : "); 
        int Angka = Integer.parseInt (input.readLine());

        // menampilkan output
        System.out.println("\n========== Output ==========");
        System.out.println("Nama Sekolah : " + Nama); 
        System.out.println("Jarak Rumah Ke Sekolah : " + Desimal);
        System.out.println("Kode Plat Nomor Kendaraan :"+ Plat);
        System.out.println("Anak ke Berapa : " + Angka);

    }
}