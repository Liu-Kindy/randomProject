import java.io.*;

public class inputBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inputkan nama: "); 
        String nama= input.readLine(); 

        System.out.print ("Inputkan angka: "); 
        int angka = Integer.parseInt (input.readLine());

        System.out.print ("Inputkan angka desimal: "); 
        double desimal = Double.parseDouble(input.readLine());       

        // menampilkan output
        System.out.println("\n======= Output =======");
        System.out.println("Nama: " + nama); 
        System.out.println("Angka: " + angka);
        System.out.println("Desimal: " + desimal);
    }
}
