import java.util.Scanner;

public class OperatorBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai a dari user
        System.out.print("Masukkan nilai a (integer): ");
        int a = scanner.nextInt();
        
        // Input nilai b dari user
        System.out.print("Masukkan nilai b (integer): ");
        int b = scanner.nextInt();
        
        System.out.println("\n=== HASIL OPERATOR BITWISE ===");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai a dalam biner: " + Integer.toBinaryString(a));
        System.out.println("Nilai b dalam biner: " + Integer.toBinaryString(b));
        
        // Operator Bitwise AND
        int andResult = a & b;
        System.out.println("\n1. AND Bitwise (a & b):");
        System.out.println(a + " & " + b + " = " + andResult);
        System.out.println("Biner: " + Integer.toBinaryString(a) + " & " + 
                        Integer.toBinaryString(b) + " = " + Integer.toBinaryString(andResult));
        
        // Operator Bitwise OR
        int orResult = a | b;
        System.out.println("\n2. OR Bitwise (a | b):");
        System.out.println(a + " | " + b + " = " + orResult);
        System.out.println("Biner: " + Integer.toBinaryString(a) + " | " + 
                        Integer.toBinaryString(b) + " = " + Integer.toBinaryString(orResult));
        
        // Operator Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("\n3. XOR Bitwise (a ^ b):");
        System.out.println(a + " ^ " + b + " = " + xorResult);
        System.out.println("Biner: " + Integer.toBinaryString(a) + " ^ " + 
                        Integer.toBinaryString(b) + " = " + Integer.toBinaryString(xorResult));
        
        // Operator Bitwise NOT
        int notA = ~a;
        int notB = ~b;
        System.out.println("\n4. NOT Bitwise (~a dan ~b):");
        System.out.println("~" + a + " = " + notA);
        System.out.println("~" + b + " = " + notB);
        System.out.println("Biner ~a: ~" + Integer.toBinaryString(a) + " = " + Integer.toBinaryString(notA));
        System.out.println("Biner ~b: ~" + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(notB));
        
        // Left Shift (a << 2)
        int leftShift = a << 2;
        System.out.println("\n5. LEFT SHIFT (a << 2):");
        System.out.println(a + " << 2 = " + leftShift);
        System.out.println("Biner: " + Integer.toBinaryString(a) + " << 2 = " + Integer.toBinaryString(leftShift));
        System.out.println("Penjelasan: Setiap bit digeser 2 posisi ke kiri, sama dengan mengalikan dengan 2² = 4");
        
        // Right Shift (b >> 2)
        int rightShift = b >> 2;
        System.out.println("\n6. RIGHT SHIFT (b >> 2):");
        System.out.println(b + " >> 2 = " + rightShift);
        System.out.println("Biner: " + Integer.toBinaryString(b) + " >> 2 = " + Integer.toBinaryString(rightShift));
        System.out.println("Penjelasan: Setiap bit digeser 2 posisi ke kanan, sama dengan membagi dengan 2² = 4 (pembagian integer)");
        
        // Unsigned Right Shift (bonus)
        int unsignedRightShift = b >>> 2;
        System.out.println("\n7. UNSIGNED RIGHT SHIFT (b >>> 2):");
        System.out.println(b + " >>> 2 = " + unsignedRightShift);
        System.out.println("Biner: " + Integer.toBinaryString(b) + " >>> 2 = " + Integer.toBinaryString(unsignedRightShift));
        
        scanner.close();
    }
}