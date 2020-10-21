package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

public class StringUtilTest {
    private static StringUtil stringUtil;

    @BeforeAll
    static void init() {
        stringUtil = new StringUtil();
    }

    @Test
    void getConcatTest() {
        Assertions.assertEquals("qwerty QWERTY", stringUtil.getConcat("qwerty", "QWERTY"));
        Assertions.assertEquals("Hello  World ", stringUtil.getConcat("Hello ", "World "));
        Assertions.assertEquals("Hey Joe Where you going with that gun in your hand", stringUtil.getConcat("Hey Joe", "Where you going with that gun in your hand"));
    }

    @Test
    void getSymbolIndexTest() {
        Assertions.assertEquals(4, stringUtil.getSymbolIndex("qwerty", 't'));
        Assertions.assertEquals(-1, stringUtil.getSymbolIndex("Hello ", 'x'));
        Assertions.assertEquals(3, stringUtil.getSymbolIndex("Hey Joe", ' '));
        Assertions.assertEquals(-1, stringUtil.getSymbolIndex("Where you going with that gun in your hand", 'I'));
    }

    @Test
    void IsStringEqualsTest() {
        Assertions.assertEquals(true, stringUtil.IsStringEquals("qwerty", "qwerty"));
        Assertions.assertEquals(false, stringUtil.IsStringEquals("Hello ", "World"));
        Assertions.assertEquals(true, stringUtil.IsStringEquals("Hey Joe", "Hey Joe"));
        Assertions.assertEquals(false, stringUtil.IsStringEquals("Where you going with that gun in your hand", "where you going with that gun in your hand"));
    }

    @Test
    void getUpperCaseTrimTest() {
        Assertions.assertEquals("QWERTY", stringUtil.getUpperCaseTrim(" qwerty "));
        Assertions.assertEquals("HELLO WORLD", stringUtil.getUpperCaseTrim("Hello World "));
        Assertions.assertEquals("HEY JOE", stringUtil.getUpperCaseTrim(" hey joe"));
    }

    @Test
    void getSubstringTest() {
        Assertions.assertEquals("ere you going with that", stringUtil.getSubstring("Hey Joe Where you going with that gun in your hand"));
        Assertions.assertEquals("error", stringUtil.getSubstring("Hey Joe"));
        Assertions.assertEquals(" is Slim Shady", stringUtil.getSubstring("Hi My name is Slim Shady"));
    }

    @Test
    void getSmileReplaceTest() {
        Assertions.assertEquals(" qwerty  :)", stringUtil.getSmileReplace(" qwerty  :("));
        Assertions.assertEquals("HELLO:) WORLD", stringUtil.getSmileReplace("HELLO:( WORLD"));
        Assertions.assertEquals("H:)EY JO:)E", stringUtil.getSmileReplace("H:(EY JO:(E"));
    }

    @Test
    void IsStringStartsEndsWithTest() {
        Assertions.assertEquals(false, stringUtil.IsStringStartsEndsWith("qwerty", "QWERTY"));
        Assertions.assertEquals(false, stringUtil.IsStringStartsEndsWith("Hello World", "World"));
        Assertions.assertEquals(false, stringUtil.IsStringStartsEndsWith("World Hello", "World"));
        Assertions.assertEquals(false, stringUtil.IsStringStartsEndsWith("Hey Joe Where you going with that gun in your hand, Hey Joe", "Joe"));
        Assertions.assertEquals(true, stringUtil.IsStringStartsEndsWith("Joe Where you going with that gun in your hand, Hey Joe", "Joe"));
    }

    @Test
    void getNumberOfVowelsTest() {
        Assertions.assertEquals(19, stringUtil.getNumberOfVowels("Hey Joe Where you going with that gun in your hand"));
        Assertions.assertEquals(4, stringUtil.getNumberOfVowels("hEy JoE"));
        Assertions.assertEquals(6, stringUtil.getNumberOfVowels("I LOVE BELARUS"));
    }

    @Test
    void getNumberOfSymbolsTest() {
        Assertions.assertEquals(4, stringUtil.getNumberOfSymbols("Hey Joe, Where you going with that gun in your hand!!!"));
        Assertions.assertEquals(9, stringUtil.getNumberOfSymbols("Hi,,, My name is... Slim Shady!!!"));
        Assertions.assertEquals(12, stringUtil.getNumberOfSymbols(",.!Hello.,!!! World,.!!"));
    }

    @Test
    void IsPalindromeTest() {
        Assertions.assertEquals(true, stringUtil.isPalindrome("ABBA"));
        Assertions.assertEquals(true, stringUtil.isPalindrome("ABBa"));
        Assertions.assertEquals(true, stringUtil.isPalindrome("I did, did I?"));
        Assertions.assertEquals(true, stringUtil.isPalindrome("SteP oN no peTs!"));
        Assertions.assertEquals(false, stringUtil.isPalindrome("Hello"));
    }

    @Test
    void splitIntoPartsTest() {
        Assertions.assertArrayEquals(new String[]{"He", "y ", "Jo", "e "}, stringUtil.splitIntoParts("Hey Joe ", 2));
        Assertions.assertArrayEquals(new String[]{"12345", "67890"}, stringUtil.splitIntoParts("1234567890", 5));
    }

    @Test
    void getNumbersOfWordsTest() {
        Assertions.assertEquals(11, stringUtil.getNumbersOfWords("Hey Joe, Where you going with that gun in your hand"));
        Assertions.assertEquals(11, stringUtil.getNumbersOfWords("Hey Joe,     Where you going with   that gun in    your hand"));
        Assertions.assertEquals(6, stringUtil.getNumbersOfWords("       Hi!!! My    name       is?? Slim    Shady"));
    }

    @Test
    void getFullNameTest() {
        Assertions.assertArrayEquals(new String[]{"T.", "T.", "A"}, stringUtil.getFullName("Tunyakina Tatsiana Anatolievna"));
        Assertions.assertArrayEquals(new String[]{"L.", "M.", "A"}, stringUtil.getFullName("lopachyk miKHali aleksandrovich"));
    }

    @Test
    void getStringNumbersTest() {
        Assertions.assertEquals("1234", stringUtil.getStringNumbers("Hey1 Joe2, Where3 you4 going with that gun in your hand"));
        Assertions.assertEquals("1235678", stringUtil.getStringNumbers("H1ey Jo2e, Where yo3u going w56ith that gun78 in your hand"));
        Assertions.assertEquals("1234589", stringUtil.getStringNumbers("1Hey Jo23e, Where you going wi4th that gun in you5r hand89"));
    }

    @Test
    void getNoRepeatLettersTest() {
        Assertions.assertEquals("p c i n f m", stringUtil.getNoRepeatLetters("proc", "inform"));
        Assertions.assertEquals("р и в е т а ш а", stringUtil.getNoRepeatLetters("привет", "паша"));
    }
}