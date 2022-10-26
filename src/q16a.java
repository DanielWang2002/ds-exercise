import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q16a {

    private static int a(String[] card) {
        // 同花順

        // 檢查花色是否都相同
        for (String value : card) {
            for (String s : card) {
                if (!value.substring(0, 1).equals(s.substring(0, 1))) return 0;
            }
        }

        // 檢查是否為順子
        ArrayList<Integer> card_number = new ArrayList<>();
        for (String s : card) {
            card_number.add(Integer.parseInt(s.substring(1)));
        }
        Collections.sort(card_number);

        for (int i=0; i<card_number.size()-1; i++) {
            if (card_number.get(i) - card_number.get(i+1) != -1) return 0;
        }

        return 7;

    }
    
    private static int b(String[] card) {
        // 四條

        for (String s : card) {
            int count = 0;
            for (String ss : card) {
                if (s.substring(1).equals(ss.substring(1))) count++;
            }
            if (count == 4) return 6;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String foo = "0";
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(foo.equals("0")) {
            String[] cardA = scanner.nextLine().split(" ");
            String[] cardB = scanner.nextLine().split(" ");
            foo = scanner.nextLine();
            System.out.println(b(cardA));
            System.out.println(b(cardB));


        }
    }

}
