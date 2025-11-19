import java.util.Scanner;
public class shop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Data menu
        String[] characterMenu = {"sword Bloxer", "VoidLess", "User909", "HEXA", "wedgeMAN"};
        String[] BloxerSkinsMenu = { "Vanity", "souldrivenlove", "fresh meat"};
        int[] hargaSkinBloxer = {2000, 10000, 3000};
        String[] VoidLessSkinsMenu = { "Thin man", "slenderman", "Hero X" };
        int[] hargaSkinVoidLess = { 10000, 5000, 10000};
        String[] User909SkinsMenu = {"JX1DX1", "cosmic nirvana", "Error 404", "NOLI", "Mu(cat/rabit)", "Virtual Insanity" };
        int[] hargaSkinUser909 = { 5000, 10000, 2000, 3000, 4000, 6700};
        String[] HEXASkinsMenu = {"Neo909EXP", "AgentSmith", "Romeo (The Admin)"};
        int[] hargaSkinHEXA = { 10000, 5000, 10000 };
        String[] wedgeMANSkinsMenu = {"edgeMan", "Optimus Prime"};
        int[] hargaSkinwedgeMAN = { 5000, 10000};
        String[] info= {
            "random player from the game named On The Hight.",
            "Nothing just the VOID it self. more info on the discord server",
            "A random User known as Neo before he sucked into the game from unknown power.",
            "mysterious virus or hacker no body knows that abusing the F3X toolbox",
            "wedgeMAN is a humanoid robot that have a wedge shape head, it will transform into the wedge guardian when LMS starts.",
        };
        boolean running = true;
        
        while (running){
            System.out.println("=== Welcome to Bhutanese Skins Shop ===");
            System.out.println("-----------------------------");
            System.out.print("input amount of skins to buy: ");
            int jumlahSkins = input.nextInt();
            
            // Arrays untuk menyimpan data pembelian
            int[] kodeBeli = new int[jumlahSkins];
            int[] karakterBeli = new int[jumlahSkins];
            // Array untuk melacak skin yang sudah dipilih (format: "characterCode-skinCode")
            String[] skinTerpilih = new String[jumlahSkins];
            
            // input skins to buy
            for (int i = 0; i < jumlahSkins; i++) {
                boolean pilihCharacter = true;
                
                while (pilihCharacter) {
                    System.out.println("\n=== Bhutanese Skins Shop ===");
                    System.out.println("character Menu:");
                    System.out.println("-----------------------------");
                    System.out.println("code  | Character       | Info");
                    System.out.println("-----------------------------");
                    for (int c = 0; c < characterMenu.length; c++) {
                        System.out.printf("%-5d | %-15s | %s\n", (c + 1), characterMenu[c], info[c]);
                    }
                    System.out.println("-----------------------------");
                    System.out.print("Pick a character to view skins(insert the code): ");
                    int characterChoice = input.nextInt();
                    
                    if (characterChoice < 1 || characterChoice > characterMenu.length) {
                        System.out.println("Invalid character choice.");
                        continue;
                    }
                    
                    karakterBeli[i] = characterChoice; // Simpan pilihan karakter
                    System.out.println("-----------------------------");
                    
                    // Menampilkan skins untuk karakter yang dipilih
                    boolean pilihSkin = true;
                    while (pilihSkin) {
                        switch (characterChoice) {
                            case 1: // Bloxer
                                System.out.println("Available Skins for " + characterMenu[0] + ":");
                                System.out.println("code | Skin Name       | Price");
                                System.out.println("-----------------------------");
                                for ( int c = 0; c < BloxerSkinsMenu.length; c++) {
                                    System.out.printf("%-4d | %-18s | Dp%d\n", (c + 1), BloxerSkinsMenu[c], hargaSkinBloxer[c]);
                                }
                                break;
                            case 2: // VoidLess
                                System.out.println("Available Skins for " + characterMenu[1] + ":");
                                System.out.println("code | Skin Name       | Price");
                                System.out.println("-----------------------------");
                                for ( int c = 0; c < VoidLessSkinsMenu.length; c++) {
                                    System.out.printf("%-4d | %-18s | Dp%d\n", (c + 1), VoidLessSkinsMenu[c], hargaSkinVoidLess[c]);
                                }
                                break;
                            case 3: // User909
                                System.out.println("Available Skins for " + characterMenu[2] + ":");
                                System.out.println("code | Skin Name       | Price");
                                System.out.println("-----------------------------");
                                for ( int c = 0; c < User909SkinsMenu.length; c++) {
                                    System.out.printf("%-4d | %-18s | Dp%d\n", (c + 1), User909SkinsMenu[c], hargaSkinUser909[c]);
                                }
                                break;
                            case 4: // HEXA
                                System.out.println("Available Skins for " + characterMenu[3] + ":");
                                System.out.println("code | Skin Name       | Price");
                                System.out.println("-----------------------------");
                                for ( int c = 0; c < HEXASkinsMenu.length; c++) {
                                    System.out.printf("%-4d | %-18s | Dp%d\n", (c + 1), HEXASkinsMenu[c], hargaSkinHEXA[c]);
                                }
                                break;
                            case 5: // wedgeMAN
                                System.out.println("Available Skins for " + characterMenu[4] + ":");
                                System.out.println("code | Skin Name       | Price");
                                System.out.println("-----------------------------");
                                for (int c = 0; c < wedgeMANSkinsMenu.length; c++) {
                                    System.out.printf("%-4d | %-18s | Dp%d\n", (c + 1), wedgeMANSkinsMenu[c], hargaSkinwedgeMAN[c]);
                                }
                                break;
                        }
                        
                        System.out.println("-----------------------------");
                        System.out.printf("Enter skin code for skin %d (or 0 to go back): ", (i + 1));
                        int skinCode = input.nextInt();
                        
                        if (skinCode == 0) {
                            pilihSkin = false; // Kembali ke pemilihan character
                            break;
                        }
                        
                        // Buat identifier unik untuk skin yang dipilih
                        String skinIdentifier = characterChoice + "-" + skinCode;
                        
                        // Cek apakah skin sudah dipilih sebelumnya
                        boolean sudahDipilih = false;
                        for (int j = 0; j < i; j++) {
                            if (skinIdentifier.equals(skinTerpilih[j])) {
                                sudahDipilih = true;
                                break;
                            }
                        }
                        
                        if (sudahDipilih) {
                            System.out.println("Error: This skin has already been selected! Please choose a different skin.");
                        } else {
                            // Validasi apakah skin code valid
                            boolean skinCodeValid = false;
                            switch (characterChoice) {
                                case 1:
                                    skinCodeValid = (skinCode >= 1 && skinCode <= BloxerSkinsMenu.length);
                                    break;
                                case 2:
                                    skinCodeValid = (skinCode >= 1 && skinCode <= VoidLessSkinsMenu.length);
                                    break;
                                case 3:
                                    skinCodeValid = (skinCode >= 1 && skinCode <= User909SkinsMenu.length);
                                    break;
                                case 4:
                                    skinCodeValid = (skinCode >= 1 && skinCode <= HEXASkinsMenu.length);
                                    break;
                                case 5:
                                    skinCodeValid = (skinCode >= 1 && skinCode <= wedgeMANSkinsMenu.length);
                                    break;
                            }
                            
                            if (!skinCodeValid) {
                                System.out.println("Error: Invalid skin code! Please choose a valid skin.");
                            } else {
                                kodeBeli[i] = skinCode;
                                skinTerpilih[i] = skinIdentifier;
                                pilihSkin = false; // Keluar dari loop pilih skin
                                pilihCharacter = false; // Keluar dari loop pilih character
                            }
                        }
                    }
                }
            }
            
            // Display purchase summary
            System.out.println("\n=== Purchase Summary ===");
            int totalPrice = 0;
            for (int i = 0; i < jumlahSkins; i++){
                int skinIndex = kodeBeli[i] - 1;
                int characterChoice = karakterBeli[i]; // Ambil pilihan karakter untuk skin ini
                String skinName = "";
                int skinPrice = 0;
                String characterName = characterMenu[characterChoice - 1];
                
                switch (characterChoice) {
                    case 1:
                        if (skinIndex >= 0 && skinIndex < BloxerSkinsMenu.length) {
                            skinName = BloxerSkinsMenu[skinIndex];
                            skinPrice = hargaSkinBloxer[skinIndex];
                        }
                        break;
                    case 2:
                        if (skinIndex >= 0 && skinIndex < VoidLessSkinsMenu.length) {
                            skinName = VoidLessSkinsMenu[skinIndex];
                            skinPrice = hargaSkinVoidLess[skinIndex];
                        }
                        break;
                    case 3:
                        if (skinIndex >= 0 && skinIndex < User909SkinsMenu.length) {
                            skinName = User909SkinsMenu[skinIndex];
                            skinPrice = hargaSkinUser909[skinIndex];
                        }
                        break;
                    case 4:
                        if (skinIndex >= 0 && skinIndex < HEXASkinsMenu.length) {
                            skinName = HEXASkinsMenu[skinIndex];
                            skinPrice = hargaSkinHEXA[skinIndex];
                        }
                        break;
                    case 5:
                        if (skinIndex >= 0 && skinIndex < wedgeMANSkinsMenu.length) {
                            skinName = wedgeMANSkinsMenu[skinIndex];
                            skinPrice = hargaSkinwedgeMAN[skinIndex];
                        }
                        break;
                }
                totalPrice += skinPrice;
                System.out.printf(" %-12s - %-15s = Dp%d\n", characterName, skinName, skinPrice);
            }
            
            System.out.println("-----------------------------");
            System.out.printf("Total Price: Dp%d\n", totalPrice);
            
            //input payment
            System.out.print("Enter Dimensional Points(Dp): ");
            int payment = input.nextInt();
            if (payment < totalPrice) {
                System.out.println("Insufficient payment.");
            } else {
                int change = payment - totalPrice;
                System.out.printf("Change: Dp%d\n", change);
                System.out.println("Thank you for shopping at Bhutanese's Skins Shop!");
            }
            
            System.out.print("Do you want to make another transaction? (y/n): ");
            char again = input.next().charAt(0);
            if (again == 'n' || again == 'N') {
                running = false;
                System.out.println("Thank you for shopping!");
            }
        }
    }
}