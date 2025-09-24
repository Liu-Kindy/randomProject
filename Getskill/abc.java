import java.io.*;

public class abc {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("masukan nilai a : ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("masukan nilai b : ");
        int b = Integer.parseInt(br.readLine());
        System.out.println("masukan nilai c : ");
        int c = Integer.parseInt(br.readLine());
        int d = a + b * c;
        System.out.println("hasilnya adalah : " + d);
    }
}