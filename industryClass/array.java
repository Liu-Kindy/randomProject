public class array {
    public static void main(String[] args) {
        System.out.println("array 1 dimensi");
        String[] nama = {"Andi", "Budi", "Nika", "Amba", "Beta"};
        int[] umur = {20, 21, 19, 22, 20};

        System.out.println("Daftar Nama dan Umur:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + " - " + umur[i] + " tahun");
        }
        System.out.println("\narray 2 dimensi");
        String[][] mahasiswa = {
            {"Andi", "20", "Teknik Informatika"},
            {"Budi", "21", "Sistem Informasi"},
            {"Nika", "19", "Teknik Komputer"},
            {"Amba", "22", "Teknologi Informasi"},
            {"Beta", "20", "Ilmu Komputer"}
        };
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Nama: " + mahasiswa[i][0] + ", Umur: " + mahasiswa[i][1] + ", Jurusan: " + mahasiswa[i][2]);
        }
    }
}
