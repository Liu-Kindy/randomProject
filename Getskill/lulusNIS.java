import java.util.Scanner;

public class lulusNIS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIS: ");
        int nis = input.nextInt();
        switch (nis) {
            case 1001:
                System.out.println("Selamat, Anda lulus!");
                break;
            case 1002:
                System.out.println("Selamat, Anda lulus!");
                break;
            case 1003:
                System.out.println("Selamat, Anda lulus!");
                break;
            case 1004:
                System.out.println("Selamat, Anda lulus!"); 
                break;
            default:
                System.out.println("Maaf, Anda tidak lulus.");
                break;
        }
    }
}
