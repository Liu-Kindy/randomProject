import java.util.Scanner;

public class syaratKerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan tinggi badan (cm): ");
        int tinggi = input.nextInt();
        System.out.print("masukan nilai UN (0-100): ");
        int nilai = input.nextInt();
        
        if (tinggi >= 160 && nilai >= 80) {
            System.out.println("Diterima");
        } else {
            System.out.println("Tidak diterima");
            System.out.println("syarat diterima: harus memiliki tinggi minimal 160 cm dan nilai UN minimal 80");
        }
    }
}
