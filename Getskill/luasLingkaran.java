import java.util.Scanner;

public class luasLingkaran {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final double pi=3.14;
        System.out.println("rumus: pi * jari-jari * jari-jari");
        System.out.println("pi= "+pi);
        System.out.print("bearapakah jari-jari lingkaran: ");
        double jari_jari=input.nextDouble();
        
        double luas=pi*jari_jari*jari_jari;
        System.out.print(pi+"*"+jari_jari+"*"+jari_jari+"= "+luas);
        
    }
}
