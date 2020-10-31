package com.rakovets.course.javabasics.practice.jcf.map.words.monitoring;

import java.util.*;

public class TextMonitoring {
    public HashMap<String, Integer> researchText(String text) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] stringArray = text.split(" ");
        for (String word : stringArray) {
            if (map.containsKey(word)) {
                int value = map.get(word);
                value++;
                map.put(word, value);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    public Map<String, Integer> getWordFrequencyDesc(boolean isAscendingFrequency, HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        if (isAscendingFrequency) {
            list.sort(Map.Entry.comparingByValue());
        } else {
            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        }
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public int getCountUniqueWords(HashMap<String, Integer> map) {
        return map.size();
    }

    public Set<String> getUniqueWords(HashMap<String, Integer> map) {
        return map.keySet();
    }

    public int get(HashMap<String, Integer> map, String word) {
        return map.get(word);
    }
}
