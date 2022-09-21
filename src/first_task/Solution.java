package first_task;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int numAppeared(String s, String word){

        if(s.length() == 0 || word.length() == 0)
            return 0;

        s = s.toUpperCase();
        word = word.toUpperCase();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            String key = "" + word.charAt(i); //convert to string

            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key,1);
            }
        }

        int max = Integer.MAX_VALUE; //2147483647

        for (Map.Entry<String,Integer> set : map.entrySet()){
            if ((count_letter(s, set.getKey())/set.getValue()) < max){
                max = count_letter(s, set.getKey())/set.getValue();
            }
        }

        return max;

    }

    public static int count_letter(String string, String character){
        return string.length() - string.replace(character, "").length();
    }

    public static void main(String[] args) {
        String string = "BAONXXOLL";
        String word = "BALLON";
        int num = numAppeared(string,word);
        switch (num) {
            case (0):
                System.out.println("U stringu: " + string + " se ne moze pronaci rec: " + word + " ukupno " + numAppeared(string, word) + " puta.");
            case (1):
                System.out.println("U stringu: " + string + " se moze pronaci rec: " + word + " ukupno " + numAppeared(string, word) + " put.");
            default:
                if (num > 1) System.out.println("U stringu: " + string + " se moze pronaci rec: " + word + " ukupno " + numAppeared(string, word) + " puta.");
        }
    }

}
