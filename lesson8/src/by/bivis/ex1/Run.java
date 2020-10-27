package by.bivis.ex1;

//Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
//последнего вхождения сивола(B).
// Вводится строка и два символа

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mainString = sc.nextLine();
        String firstSymbol = sc.next();
        String secondSymbol = sc.next();

        int firstSymbolIndex = mainString.indexOf(firstSymbol);
        int secondSymbolIndex = mainString.lastIndexOf(secondSymbol);

        String refactoredString = "";
        refactoredString += mainString.substring(0, firstSymbolIndex);
        refactoredString += mainString.substring(secondSymbolIndex + 1);

        System.out.println(refactoredString);
    }
}
