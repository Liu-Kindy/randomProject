import javax.swing.JOptionPane;
public class bioData4 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukan Nama Lengkap: ");
        int nis = Integer.parseInt(JOptionPane.showInputDialog("Masukan NIS: "));
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukan Umur: "));

        String output = "Nama Lengkap: " + nama + "\n" +
                        "NIS: " + nis + "\n" +
                        "Umur: " + umur + " Tahun";

        JOptionPane.showMessageDialog(null, output);
    }
}
