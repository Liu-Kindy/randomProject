import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input bio data
        System.out.println("====Masukkan Biodata====\n");
        System.out.print("Masukkan nama lengkap: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        System.out.print("Masukan tinggi badan: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan berat badan: ");
        float berat = scanner.nextFloat();
        System.out.print("Masukan asal Sekolah: ");
        String sekolah = scanner.next();
        System.out.print("Masukan no telepon: ");
        String notelp = scanner.next();
        System.out.print("Masukan Alamat: ");
        String alamat = scanner.next();
        System.out.println();
        //output bio data
        System.out.println("===Biodata===\n");
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi Badan: " + tinggi + " cm");
        System.out.println("Berat Badan: " + berat + " kg");
        System.out.println("Asal Sekolah: " + sekolah);
        System.out.println("No Telepon: " + notelp);
        System.out.println("Alamat: " + alamat);
    }
}
