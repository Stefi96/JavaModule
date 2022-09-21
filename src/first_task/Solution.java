package first_task;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int numAppeared(String s, String word){

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            String key = "" + word.charAt(i);

            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key,1);
            }
        }

        int max = Integer.MAX_VALUE; //2147483647

        for (Map.Entry<String,Integer> set : map.entrySet()){
            if ((count_letter(s, set.getKey())/set.getValue()) < max){
                max = count_letter(s, set.getKey());
            }
        }

        return max;

    }

    public static int count_letter(String string, String character){
        return string.length() - string.replace(character, "").length();
    }

    public static void main(String[] args) {
        System.out.println(numAppeared("BAONXXOLL","BALLON"));
    }

}
