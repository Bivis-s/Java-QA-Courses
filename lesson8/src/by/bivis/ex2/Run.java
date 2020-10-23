package by.bivis.ex2;

//Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
//позиции 0

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mainString = sc.nextLine();
        char oldChar = mainString.charAt(0);
        char newChar = mainString.charAt(3);

        StringBuilder sb = new StringBuilder();
        char[] mainStringCharArray = mainString.toCharArray();
        for (char c : mainStringCharArray) {
            if (c == newChar) {
                sb.append(oldChar);
            } else {
                sb.append(c);
            }
        }
        String refactoredString = sb.toString();

        System.out.println(refactoredString);
    }
}
