public class rataNilai  {
    public static void main(String[] args) {

        int nilai1 = 80;
        int nilai2 = 95; 
        int nilai3 = 75;

        int total = 0;
        double rataRata = 0.0;
        
        total += nilai1; 
        total += nilai2;  
        total += nilai3;  
        
        rataRata = total;     
        rataRata /= 3;        
        

        System.out.println("Nilai siswa 1: " + nilai1);
        System.out.println("Nilai siswa 2: " + nilai2);
        System.out.println("Nilai siswa 3: " + nilai3);
        System.out.println("Total nilai: " + total);
        System.out.printf("Rata-rata nilai (2 desimal): %.2f", rataRata);
    }
}

