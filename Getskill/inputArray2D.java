import java.util.Scanner;

public class inputArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan jumlah baris: ");
        int baris=scanner.nextInt();
        System.out.print("masukkan jumlah kolom: ");
        int kolom=scanner.nextInt();
        int[][] array2D = new int[baris][kolom];
        System.out.println("masukkan elemen array: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                array2D[i][j] = scanner.nextInt();
            }
        }


    }
}
