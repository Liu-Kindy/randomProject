import java.util.Scanner;

public class KonversiPlatNomorIndonesia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM KONVERSI KODE PLAT NOMOR INDONESIA ===");
        
        System.out.print("\nMasukkan kode plat nomor (huruf): ");
        
        String input = scanner.nextLine().toUpperCase();
        String kota = konversiPlat(input);
        
        System.out.println("\n=== HASIL KONVERSI ===");
        if (kota != null) {
            System.out.println("Kode Plat " + input + " = " + kota);
        } else {
            System.out.println("Kode plat '" + input + "' tidak dikenali!");
            System.out.println("Silakan masukkan kode plat yang valid.");
        }
        
        scanner.close();
    }
    
    // Method untuk mengkonversi kode plat ke nama kota
    public static String konversiPlat(String kode) {
        switch (kode) {
            // Kode plat untuk Jawa
            case "A": return "Banten, Jakarta, Tangerang, Bekasi";
            case "B": return "Jawa Barat (Bandung, Bogor, Sukabumi, Cianjur)";
            case "D": return "Jawa Tengah (Semarang, Kudus, Pati, Jepara)";
            case "E": return "Jawa Timur (Surabaya, Malang, Jombang, Mojokerto)";
            case "F": return "Jawa Timur (Bojonegoro, Tuban)";
            case "P": return "Jawa Timur (Jember, Banyuwangi, Bondowoso, Situbondo)";
            case "R": return "Jawa Tengah (Banyumas, Cilacap, Purbalingga)";
            case "S": return "Jawa Timur (Madium, Magetan, Ngawi, Ponorogo)";
            case "T": return "Jawa Tengah (Purwokerto, Tegal, Brebes, Pemalang)";
            case "W": return "Jawa Timur (Sidoarjo, Gresik, Lamongan)";
            case "AA": return "Jawa Tengah (Kediri, Tulungagung, Blitar)";
            case "AB": return "DI Yogyakarta";
            case "AD": return "Surakarta (Solo) dan sekitarnya";
            case "AE": return "Jawa Timur (Kediri, Tulungagung, Blitar, Trenggalek)";
            case "AG": return "Jawa Timur (Malang, Batu, Pasuruan)";
            case "CC": return "Jawa Barat (Cirebon, Indramayu, Majalengka)";
            case "EB": return "Jawa Timur (Lumajang, Probolinggo)";
            
            // Kode plat untuk Sumatra
            case "Z": return "Sumatra Barat";
            case "BA": return "Sumatra Barat";
            case "BB": return "Sumatra Utara (Tapanuli)";
            case "BD": return "Bengkulu";
            case "BE": return "Lampung";
            case "BG": return "Sumatra Selatan";
            case "BH": return "Jambi";
            case "BK": return "Sumatra Utara";
            case "BL": return "Nanggroe Aceh Darussalam";
            case "BM": return "Riau";
            case "BN": return "Kepulauan Bangka Belitung";
            case "BP": return "Kepulauan Riau";
            
            // Kode plat untuk Kalimantan
            case "H": return "Kalimantan Barat";
            case "K": return "Kalimantan Selatan";
            case "L": return "Kalimantan Tengah";
            case "M": return "Kalimantan Timur";
            case "N": return "Kalimantan Utara";
            case "KB": return "Kalimantan Barat";
            
            // Kode plat untuk Sulawesi
            case "DB": return "Sulawesi Utara (Manado)";
            case "DC": return "Sulawesi Barat";
            case "DD": return "Sulawesi Selatan (Makassar)";
            case "DL": return "Sulawesi Utara (Gorontalo)";
            case "DM": return "Sulawesi Tengah";
            case "DN": return "Sulawesi Tenggara";
            case "DT": return "Sulawesi Selatan";
            case "ED": return "Sulawesi Selatan (Enrekang, Pinrang)";
            
            // Kode plat untuk Indonesia Timur
            case "G": return "Bali";
            case "DK": return "Bali";
            case "DR": return "Nusa Tenggara Barat (Lombok)";
            case "EA": return "Nusa Tenggara Barat";
            case "DH": return "Nusa Tenggara Timur";
            case "DE": return "Maluku";
            case "DG": return "Maluku Utara";
            case "DS": return "Papua Barat";
            
            default: return null;
        }
    }
}