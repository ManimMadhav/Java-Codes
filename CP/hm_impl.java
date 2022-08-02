import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> hm = new HashMap<>();
        String inp = sc.next();
        char[] ch = inp.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (hm.containsKey(ch[i]) == false) {
                hm.put(ch[i], 1);
            } 
            else {
                hm.put(ch[i], hm.get(ch[i]) + 1);
            }
        }

        int count = 0;
        for (Integer i : hm.values()) {
            if (i == 1) {
                count += 1;
            }
        }
        System.out.println(hm);
        System.out.println(count);
        if (count%2 == 0) {
            System.out.println("CHAT WITH HER!");
        } 
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}
