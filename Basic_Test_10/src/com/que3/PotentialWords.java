package com.que3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PotentialWords {
    public static void main(String[] args) {
        Map<String, Integer> potentialMap = new HashMap<>();

        String sentence = "THE SKY IS THE LIMIT.";

        String[] words = sentence.split("\\s+");
        for (String word : words) {
            int potential = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toUpperCase(word.charAt(i));
                if (ch >= 'A' && ch <= 'Z') {
                    potential += ch - 'A' + 1;
                }
            }
            potentialMap.put(word.toUpperCase(), potential);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(potentialMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.print("Output: ");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.print(entry.getKey() + " ");
        }
        System.out.println();
    }
}