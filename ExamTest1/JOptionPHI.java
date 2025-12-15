import javax.swing.JOptionPane;
public class JOptionPHI {
    public static void main(String[] args) {
        double phi=3.14;
        int r=Integer.parseInt(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran: "));
        int t=Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi lingkaran: "));
        double luas=phi*r*r*t;
        JOptionPane.showMessageDialog(null, "rumus luas lingkaran adalah phi * r * r * t\nLuas lingkaran adalah: " + luas);
    }
}
