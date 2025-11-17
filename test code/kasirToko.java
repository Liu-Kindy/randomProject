import java.util.Scanner;
public class kasirToko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // data menu
        String[] menuItems = {"Nasi Goreng", "Mie Ayam", "Geprek", "Es Teh", "Es Jeruk", "Kopi Hitam"};
        int[] menuPrices = {15000, 12000, 18000, 5000, 8000, 7000};
        boolean running = true;
        while(running) {
            System.out.println("=== WARUNG MAKAN SAYA SUKA ===");
            System.out.println("MENU MAKANAN DAN MINUMAN:");
            System.out.println("-----------------------------");
            System.out.println("Kode | Nama Menu | Harga");
            System.out.println("-----------------------------");
            for (int i = 0; i < menuItems.length; i++) {
                System.out.printf("%-5d | %-15s | Rp%d\n", (i + 1), menuItems[i], menuPrices[i]);
            }
            System.out.println("-----------------------------");
            System.out.print("masukan jumlah Item: ");
            int jumlahBeli = scanner.nextInt();
            int kodeBelian[] = new int[jumlahBeli];
            int jumlahItem[] = new int[jumlahBeli];
            scanner.nextLine(); // consume newline
            //input pesanan
            for (int i = 0; i < jumlahBeli; i++) {
                System.out.printf("Masukan kode menu ke-%d: ", (i + 1));
                kodeBelian[i] = scanner.nextInt();
                System.out.printf("Masukan jumlah item ke-%d: ", (i + 1));
                jumlahItem[i] = scanner.nextInt();
            }
            //cetak struk
            System.out.println("\n=== STRUK PEMBELIAN ===");
            int totalBayar = 0;
            for (int i = 0; i < jumlahBeli; i++) {
                int index = kodeBelian[i] - 1;
                int subTotal = menuPrices[index] * jumlahItem[i];
                totalBayar += subTotal;
            }
            //hitumg diskon
            double diskon = 0;
            if (totalBayar >= 1000000) {
                diskon = 0.10 * totalBayar;
            } else if (totalBayar >= 200000) {
                diskon = 0.05 * totalBayar;
            }
            double totalBayardiskon = totalBayar - diskon;
            System.out.println("-----------------------------");
            System.out.println("Total Belanja: Rp"+totalBayar);
            System.out.println("Diskon: Rp" + (int)diskon);
            System.out.println("Total Bayar Setelah Diskon:"+ (int)totalBayardiskon);
            System.out.print("Masukan jumlah uang pembayaran: Rp");
            int uangBayar = scanner.nextInt();
            //percabangan uang cukup atau tidak
            if (uangBayar < totalBayardiskon) {
                System.out.println("Uang pembayaran tidak cukup.");
            } else {
                int kembalian = uangBayar - (int)totalBayardiskon;
                System.out.println("Kembalian: Rp" + kembalian);
                System.out.println("Terima kasih telah berbelanja di warung kami!");
            }
            //tanya ulang
            System.out.print("Apakah Anda ingin melakukan transaksi lagi? (y/n): ");
            char ulang = scanner.next().charAt(0);
            if(ulang == 'n' || ulang == 'N') {
                running = false;
                System.out.println("Terima kasih telah menggunakan program kasir kami!");
           
            
            }
        }
    }
}
