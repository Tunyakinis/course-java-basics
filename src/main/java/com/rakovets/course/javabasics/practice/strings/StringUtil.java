package com.rakovets.course.javabasics.practice.strings;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    public String getConcat(String string, String string2) {
        return String.join(" ", string, string2);
    }

    public int getSymbolIndex(String string, char x) {
        return string.indexOf(x);
    }

    public boolean IsStringEquals(String string, String string2) {
        return string.equals(string2);
    }

    public String getUpperCaseTrim(String string) {
        return string.trim().toUpperCase();
    }

    public String getSubstring(String string) {
        if (string.length() < 10) {
            return "error";
        }
        String string2 = string.substring(10);
        if (string2.length() > 23) {
            return string2.substring(0, 23);
        }
        return string2;
    }

    public String getSmileReplace(String string) {
        return string.replace(":(", ":)");
    }

    public boolean IsStringStartsEndsWith(String string, String word) {
        return string.startsWith(word) && string.endsWith(word);
    }

    public int getNumberOfVowels(String string) {
        int vocalCounter = 0;
        char[] array = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        for (char variable : string.toLowerCase().toCharArray()) {
            for (char vowel : array) {
                if (variable == vowel) {
                    vocalCounter++;
                    break;
                }
            }
        }
        return vocalCounter;
    }

    public int getNumberOfSymbols(String string) {
        int symbolCounter = 0;
        char[] array = new char[]{'.', ',', '!'};
        for (char variable : string.toCharArray()) {
            for (char symbol : array) {
                if (symbol == variable) {
                    symbolCounter++;
                    break;
                }
            }
        }
        return symbolCounter;
    }

    public boolean isPalindrome(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        for (int i = 0; i < stringBuffer.length(); i++) {
            char symbol = stringBuffer.charAt(i);
            if (symbol == '.' || symbol == ',' || symbol == '?' || symbol == '!' || symbol == ' ')
                stringBuffer.deleteCharAt(i);
        }
        return (stringBuffer.toString().equalsIgnoreCase(stringBuffer.reverse().toString()));
    }

    String[] splitIntoParts(String string, int n) {
        int substring = string.length() / n;
        if (string.length() % n != 0) {
            substring++;
        }
        String[] array = new String[substring];
        for (int i = 0; i < substring; i++) {
            array[i] = string.substring(i * n, Math.min((i + 1) * n, string.length()));
        }
        return array;
    }

    public int getNumbersOfWords(String string) {
        int count = 0;
        String[] words = string.trim().replaceAll(" +", " ").split(" +");
        for (String word : words) {
            count++;
        }
        return count;
    }

    public String[] getFullName(String str) {
        String[] fullName = str.toUpperCase().split(" ");
        for (int i = 0; i < fullName.length; i++) {
            if (i != fullName.length - 1) {
                fullName[i] = fullName[i].charAt(0) + ".";
            } else fullName[i] = String.valueOf(fullName[i].charAt(0));
        }
        return fullName;

    }

    public String getStringNumbers(String string) {
        String numbers = string.replaceAll("[^0-9]", "");
        return numbers;
    }

    public static String getNoRepeatLetters(String string, String string1) {
        String string3 = "";
        for (int i = 0; i < string.length(); i++) {
            if (!(string1.contains("" + string.charAt(i))))
                string3 += string.charAt(i) + " ";
        }

        for (int i = 0; i < string1.length(); i++) {
            if (!(string.contains("" + string1.charAt(i))))
                string3 += string1.charAt(i) + " ";
        }
        return string3.trim();
    }
}





