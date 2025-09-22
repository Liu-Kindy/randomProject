import java.io.Console;

public class bioData3 {
    public static void main(String[] args) {
        Console con = System.console();
        String jenis = con.readLine("Masukan Jenis Kelamin: ");
        int ukuran = Integer.parseInt(con.readLine("Masukan Ukuran Sepatu: "));
        boolean menikah = Boolean.parseBoolean(con.readLine("Sudah Menikah (true/false): "));

        System.out.println("Jenis Kelamin: " + jenis);
        System.out.println("Ukuran Sepatu: " + ukuran);
        System.out.println("Sudah Menikah: " + menikah);
    }
}
