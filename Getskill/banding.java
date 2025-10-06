public class banding {
    public static void main(String[] args) {
        boolean hasilBanding;
        int a = 10;
        int b = 15;
        System.out.println("nilai a = " + a + "\nnilai b = " + b);
        hasilBanding = (a == b);
        System.out.println("a == b ? " + hasilBanding);
        hasilBanding = (a != b);
        System.out.println("a != b ? " + hasilBanding);
        hasilBanding = (a > b);
        System.out.println("a > b ? " + hasilBanding);
        hasilBanding = (a < b);
        System.out.println("a < b ? " + hasilBanding);
        hasilBanding = (a >= b);
        System.out.println("a >= b ? " + hasilBanding);
        hasilBanding = (a <= b);
        System.out.println("a <= b ? " + hasilBanding);
    }
}
