import java.util.Scanner;

public class kuisOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Berikut ini manakah yang termasuk jenis operator di dalam pemrograman Java?");
        System.out.println("A. Operator Indosat");
        System.out.println("B. Operator Aritmatika");
        System.out.println("C. Operator Telkomsel");
        System.out.println("D. Operator Assignment");
        System.out.print("Masukkan jawaban Anda (A/B/C/D): ");
        String jawaban = input.nextLine().toUpperCase();
        if (jawaban.equals("B") || jawaban.equals("D")) {
            System.out.println("Jawaban Anda benar!");
        } else {
            System.out.println("Jawaban Anda salah. Jawaban yang benar adalah B dan D.");
        }
    }
}
