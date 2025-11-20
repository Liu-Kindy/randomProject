import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai akhir Anda (0-100): ");
        int nilaiAkhir = input.nextInt();
        if (nilaiAkhir >= 81 && nilaiAkhir <= 100) {
            System.out.println("Grade: A");
        } else if (nilaiAkhir >= 71 && nilaiAkhir <= 85) {
            System.out.println("Grade: B");
        } else if (nilaiAkhir >= 51 && nilaiAkhir <= 70) {
            System.out.println("Grade: C");
        } else if (nilaiAkhir >= 21 && nilaiAkhir <= 50) {
            System.out.println("Grade: D");
        } else if (nilaiAkhir >= 0 && nilaiAkhir <= 20) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0 hingga 100.");
        }
    }
}
