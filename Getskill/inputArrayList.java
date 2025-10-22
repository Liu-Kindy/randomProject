import java.util.ArrayList;
import java.util.Scanner;

public class inputArrayList {
    public static void main(String[] args) {
        ArrayList nama = new ArrayList(5);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
        System.out.println("masukan nama : ");
        String inputNama = scanner.nextLine();
        }
        for (int i = 0; i < 5; i++) {
        nama.add(inputNama);
        }
        
        
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("Nama yang dimasukan: " + nama.get(i));

        }
        
    }
}
