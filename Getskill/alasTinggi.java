import java.util.Scanner;

public class alasTinggi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Masukkan Tinggi: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan Alas: ");
        double alas = scanner.nextDouble();
        
        double luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah: " + luas);
    }
}
