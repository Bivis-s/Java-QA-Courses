package by.bivis.ex4;

import by.bivis.palindrome.Palindrome;

public class TextFormater {
    public static int wordCount(String sentence) {
        String[] count = sentence.split("\\s");
        return count.length;
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
