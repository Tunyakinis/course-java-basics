package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.practice.jcf.map.words.monitoring.TextMonitoring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TextMonitoringTest {
    @Test
    void researchTextTest() {
        TextMonitoring textMonitoring = new TextMonitoring();
        HashMap<String, Integer> mapWords = textMonitoring.researchText("run rabbit run dig that hole forget the sun run rabbit run");
        assertEquals(4, mapWords.get("run"));
    }

    @Test
    void getUniqueWordsTest() {
        TextMonitoring textMonitoring = new TextMonitoring();
        HashMap<String, Integer> mapWords = textMonitoring.researchText("run rabbit run dig that hole forget the sun run rabbit run");
        Collection<String> uniqueWords = textMonitoring.getUniqueWords(mapWords);
        assertEquals("[hole, the, that, forget, dig, rabbit, run, sun]", uniqueWords.toString());
    }

    @Test
    void getCountUniqueWordsTest() {
        TextMonitoring textMonitoring = new TextMonitoring();
        HashMap<String, Integer> mapWords = textMonitoring.researchText("run rabbit run dig that hole forget the sun run rabbit run");
        assertEquals(8, textMonitoring.getCountUniqueWords(mapWords));
    }

    @Test
    void getWordFrequencyDescTest() {
        TextMonitoring textMonitoring = new TextMonitoring();
        HashMap<String, Integer> mapWords = textMonitoring.researchText("run rabbit run dig that hole forget the sun run rabbit run");
        Map<String, Integer> sortedMap = textMonitoring.getWordFrequencyDesc(false, mapWords);
        assertEquals("{run=4, rabbit=2, hole=1, the=1, that=1, forget=1, dig=1, sun=1}", sortedMap.toString());
    }
}
