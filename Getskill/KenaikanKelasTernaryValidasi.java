import java.util.Scanner;

public class KenaikanKelasTernaryValidasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jawab pertanyaan dengan memasukkan (ya) atau (tidak)");
        
        // Input nilai akademik dengan validasi
        String nilaiAkademik;
        while (true) {
            System.out.print("Apakah nilai akademik kamu lebih dari 70? ");
            nilaiAkademik = scanner.nextLine().toLowerCase();
            if (nilaiAkademik.equals("ya") || nilaiAkademik.equals("tidak")) {
                break;
            }
            System.out.println("Input tidak valid! Masukkan 'ya' atau 'tidak'");
        }
        
        // Input ketidakhadiran dengan validasi
        String ketidakhadiran;
        while (true) {
            System.out.print("Apakah ketidakhadiran kamu selama 1 semester kurang dari 10? ");
            ketidakhadiran = scanner.nextLine().toLowerCase();
            if (ketidakhadiran.equals("ya") || ketidakhadiran.equals("tidak")) {
                break;
            }
            System.out.println("Input tidak valid! Masukkan 'ya' atau 'tidak'");
        }
        
        // Ternary operator untuk menentukan output
        boolean naikKelas = nilaiAkademik.equals("ya") && ketidakhadiran.equals("ya");
        
        String status = naikKelas ? "Selamat kamu naik kelas... :)" : "Maaf, kamu tidak naik kelas";
        String pesan = nilaiAkademik.equals("ya") ? "Pertahankan nilaimu" : "Semangat belajar lagi";
        
        System.out.println("\n" + status);
        System.out.println(pesan);
        
        scanner.close();
    }
}