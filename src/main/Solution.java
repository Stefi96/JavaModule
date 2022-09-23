package main;

import java.io.*;
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

        String string = "";
        String word = "";

        File file1 = new File("C:\\Users\\stefanve\\Documents\\JavaModule\\string.txt");
        File file2 = new File("C:\\Users\\stefanve\\Documents\\JavaModule\\word.txt");
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            String st1;
            StringBuilder stringBuilder = new StringBuilder();
            while ((st1 = br1.readLine()) != null)
                    stringBuilder.append(st1);
            string = stringBuilder.toString();

            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            String st2;
            StringBuilder wordBuilder = new StringBuilder();
            while ((st2 = br2.readLine()) != null)
                wordBuilder.append(st2);
            word = wordBuilder.toString();
        } catch(FileNotFoundException e) {
            System.out.println("Fajl ne postoji");
        }
        catch (IOException e){
            System.out.println("Probelm sa učitavanjem fajlova.");
        }

        int num = numAppeared(string,word);
        String outputString = "";
        switch (num) {
            case (0):
                outputString += "U stringu: " + string + " se ne moze pronaci rec: " + word + " ukupno " + numAppeared(string, word) + " puta.";
            case (1):
                outputString += "U stringu: " + string + " se moze pronaci rec: " + word + " ukupno " + numAppeared(string, word) + " put.";
            default:
                if (num > 1) outputString += "U stringu: " + string + " se moze pronaci rec: " + word + " ukupno " + numAppeared(string, word) + " puta.";
        }

        try {
            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write(outputString);
            myWriter.close();
            System.out.println("Uspešno upisan rezultat.");
        } catch (IOException e) {
            System.out.println("Došlo je do greške prilikom upisa rezultata.");
            e.printStackTrace();
        }
    }

}
