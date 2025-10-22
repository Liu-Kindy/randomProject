import java.util.ArrayList;
import java.util.Scanner;

public class inputArrayList {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==Masukan 5 nama teman==");
        for (int i = 0; i < 5; i++) {
        System.out.print("masukan nama teman ke-"+(i+1)+": ");
        String inputNama = scanner.nextLine();
        nama.add(inputNama);
        }
        
        
        System.out.println("\n==Daftar nama teman yang dimasukan==");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("Nama yang dimasukan ke-"+(i+1)+": " + nama.get(i));

        }
        
    }
}
