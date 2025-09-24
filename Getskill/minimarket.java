import javax.swing.JOptionPane;

public class minimarket {
    public static void main(String[] args) {
        int mie, sirup, deterjen;
        sirup = 5;
        deterjen = 6;
        mie = 10;
        JOptionPane.showMessageDialog(null, "jumlah mie = " + mie +" bungkus"+ "\njumlah sirup = " + sirup+" botol" + "\njumlah deterjen = " + deterjen+" bungkus");
        int jummie = Integer.parseInt(JOptionPane.showInputDialog("masukan jumlah mie dari distributor: "));
        int jumsirup = Integer.parseInt(JOptionPane.showInputDialog("masukan jumlah sirup dari distributor: "));
        int jumdeterjen = Integer.parseInt(JOptionPane.showInputDialog("masukan jumlah deterjen dari distributor: "));
        mie =+ jummie;
        sirup =+ jumsirup;
        deterjen =+ jumdeterjen;
        JOptionPane.showMessageDialog(null, "jumlah barang setelah di tambah distributor: \n"+"jumlah mie = " + mie +" bungkus"+ "\njumlah sirup = " + sirup+" botol" + "\njumlah deterjen = " + deterjen+" bungkus");

    }
}
