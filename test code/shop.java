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
            System.out.println("=== Welcome to Neo's Skins Shop ===");
            System.out.println("-----------------------------");
            System.out.print("input amount of skins to buy: ");
            int jumlahSkins = input.nextInt();
            
            // input skins to buy
            for (int i = 0; i < jumlahSkins; i++) {
                System.out.println("=== Neo's Skins Shop ===");
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
                int[] kodeBeli = new int[jumlahSkins];
                
                if (characterChoice < 1 || characterChoice > characterMenu.length) {
                System.out.println("Invalid character choice.");
                continue;
            }
            switch (characterChoice) {
                case 1: // Bloxer
                    System.out.println("Available Skins for " + characterMenu[0] + ":");
                    for ( int c = 0; c < BloxerSkinsMenu.length; c++) {
                        System.out.printf("%d. %s - Rp%d\n", (c + 1), BloxerSkinsMenu[c], hargaSkinBloxer[c]);
                    }
                    break;
                case 2: // VoidLess
                    System.out.println("Available Skins for " + characterMenu[1] + ":");
                    for ( int c = 0; c < VoidLessSkinsMenu.length; c++) {
                        System.out.printf("%d. %s - Rp%d\n", (c + 1), VoidLessSkinsMenu[c], hargaSkinVoidLess[c]);
                    }
                    break;
                case 3: // User909
                    System.out.println("Available Skins for " + characterMenu[2] + ":");
                    for ( int c = 0; c < User909SkinsMenu.length; c++) {
                        System.out.printf("%d. %s - Rp%d\n", (c + 1), User909SkinsMenu[c], hargaSkinUser909[c]);
                    }
                    break;
                case 4: // HEXA
                    System.out.println("Available Skins for " + characterMenu[3] + ":");
                    for ( int c = 0; c < HEXASkinsMenu.length; c++) {
                        System.out.printf("%d. %s - Rp%d\n", (c + 1), HEXASkinsMenu[c], hargaSkinHEXA[c]);
                    }
                    break;
                case 5: // wedgeMAN
                    System.out.println("Available Skins for " + characterMenu[4] + ":");
                    for (int c = 0; c < wedgeMANSkinsMenu.length; c++) {
                        System.out.printf("%d. %s - Rp%d\n", (c + 1), wedgeMANSkinsMenu[c], hargaSkinwedgeMAN[c]);
                    }
                    break;
                default:
                    System.out.println("Invalid character choice.");
                    continue;
                
                }
                input.nextLine(); // consume newline
                System.out.printf("Enter skin code for skin %d: ", (i + 1));
                kodeBeli[i] = input.nextInt();
            }
            
            
            
            

        }
        
    }
}
