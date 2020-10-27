package by.bivis.palindrome;

public class Palindrome {
    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String string) {
        return reverseString(string.toLowerCase()).equals(string.toLowerCase());
    }
}
