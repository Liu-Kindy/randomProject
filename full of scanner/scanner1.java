import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);

        System.out.print("Nama: ");
        String name=a.nextLine();

        System.out.print("Kelas: ");
        String kelas=a.nextLine();

        System.out.print("Hobi: ");
        String hobi=a.nextLine();

        System.out.print("Cita-Cita: ");
        String cita=a.nextLine();

        System.out.println("===Output===");
        System.out.println("Nama: "+name);
        System.out.println("Kelas: "+kelas);
        System.out.println("Hobi: "+hobi);
        System.out.println("Cita-Cita: :"+cita);
    }

}
