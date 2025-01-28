package org.example.String;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String str= "Maharastra";
        HashMap<Character,Integer> res= new HashMap<>();
        for (char ch :str.toCharArray()){
            res.put(ch, res.getOrDefault(ch,0)+1);
        }
        char maxChar= ' ';
        int maxCount=0;
        for(Map.Entry<Character,Integer>entry :res.entrySet()){
            if (entry.getValue()>maxCount){
                maxChar=entry.getKey();
                maxCount=entry.getValue();
            }
            // System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println (maxChar+":"+maxCount);
    }
}
