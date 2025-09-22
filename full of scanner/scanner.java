import java.util.Scanner;

public class scanner{
    public static void main(String[] args) {
        Scanner nick=new Scanner(System.in);

        System.out.print("Nama: ");
        String name=nick.nextLine();

        System.out.print("Kelas: ");
        String kelas=nick.nextLine();

        System.out.print("Hobi: ");
        String hobi=nick.nextLine();

        System.out.print("Cita-Cita: ");
        String cita=nick.nextLine();

        System.out.println("===Output===");
        System.out.println("Nama: "+name);
        System.out.println("Kelas: "+kelas);
        System.out.println("Hobi: "+hobi);
        System.out.println("Cita-Cita: :"+cita);
    }
}