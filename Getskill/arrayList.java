import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); 
        list.add("\nwould you dare look over your shoulder?");
        list.add("\ndo you fear what's coming around the bend?");
        list.add("\ndo you know what comes while you're growing older?");
        list.add("\nwould you  ever turn your back again?\n");
        System.out.println("Isi ArrayList: " + list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.get(0));
    }
}
