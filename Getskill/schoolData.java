import java.io.*;

public class schoolData {
    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan Nama Sekolah: ");
        String school=input.readLine();
        System.out.print("Jarak Rumah Ke Sekolah: ");
        double jarak=Double.parseDouble(input.readLine());
        System.out.print("Kode Plat Nomer: ");
        char kode=input.readLine().charAt(0);
        System.out.print("Anak Ke: ");
        int anak=Integer.parseInt(input.readLine());

        System.out.println("Nama Sekolah: "+school);
        System.out.println("Jarak Rumah Ke Sekolah: "+jarak+" km");
        System.out.println("Kode Plat Nomer: "+kode);
        System.out.println("Anak Ke: "+anak);
    }
    
}
