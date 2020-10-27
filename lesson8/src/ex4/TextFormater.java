package ex4;

import by.bivis.palindrome.Palindrome;

import java.util.Arrays;

public class TextFormater {
    public static int wordCount(String sentence) {
        return (sentence.split("\\s")).length;
    }

    public static boolean therePalindrome(String sentence) {
        String[] words = sentence.replaceAll("\\,|\\!|\\?|\\.|;|\\)|\\(|\\{|\\}|\\[|\\]|\\<|\\>|\\%|\\#|\\№|\\@", "").split("\\s+");

        for (String word : words) {
            if (Palindrome.isPalindrome(word)) {
                return true;
            }
        }
        return false;
    }

    public static String[] splitBySentences(String string) {
        return string.split("\\.|\\!|\\?");
    }
}
