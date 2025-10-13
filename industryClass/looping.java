import java.util.Scanner;

public class looping {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perulangan for");
        int k;
        for (k = 1; k <= 10; k++) {
            System.out.println("ini adalah perulangan ke-" + k);
        }
        System.out.println("Perulangan while");
        int i = 1;
        while (i <= 10) {
            System.out.println("ini adalah perulangan ke-" + i);
            i++;
        }
        System.out.println("Perulangan do while");
        int j = 1;
        do {
            System.out.println("ini adalah perulangan ke-" + j);
            j++;
        } while (j <= 10);

        int angka=0;
        while (angka < 10) {
            System.out.print("masukan angka (10 atau lebih untuk keluar) = ");
            angka=input.nextInt();
        }



        
    }
}