package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Stavljanje teksta u String
        String teks = "good Morning . Have a good class. Have a good visit. Have fun";
        // kreiranje TreeMap za smestaj reci, kao kljuceva i broja javljanja, kao vrednost
        Map<String, Integer> map = new TreeMap<>();
        String[] word = teks.split("[ \n\t\r.,;:!?(){");
        for (int i = 0; i<word.length;i++){
            String key = word[i].toLowerCase();
            if(key.length()>0){
                if(!map.containsKey(key)){
                    map.put(key,1);
                }
                else{
                    int value  = map.get(key);
                    value++;
                    map.put(key,value);
                }
            }
        }

    }
}
