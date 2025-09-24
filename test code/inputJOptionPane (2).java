import javax.swing.JOptionPane;


public class inputJOptionPane {
    public static void main(String[] args) {
        String Nama = JOptionPane.showInputDialog("Inputkan Nama");
        String kelas = JOptionPane.showInputDialog("Inputkan Kelas");
        String Hobi = JOptionPane.showInputDialog("Inputkan Hobi");
        String cita = JOptionPane.showInputDialog("Inputkan Cita-Cita");
        int Umur = Integer.parseInt(JOptionPane.showInputDialog("Inputkan Usia"));
        
        // menampilkan output
        System.out.println("\n========== Output ==========");
        System.out.println("Nama Lengkap: " + Nama);
        System.out.println("Cita-Cita: " + cita);
        System.out.println("Kelas: " + kelas);
        System.out.println("Hobi: " + Hobi);
        System.out.println("Umur: " + Umur);
    }
}