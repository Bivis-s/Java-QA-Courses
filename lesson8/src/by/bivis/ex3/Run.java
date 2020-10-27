package by.bivis.ex3;

//В исходном файле находятся слова, каждое слово на новой стороке. После
//запуска программы должен создать файл, который будет содержать в себе
//только полиндромы

import java.io.*;
import java.util.ArrayList;
import by.bivis.palindrome.Palindrome;

public class Run {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        //Чтение
        try (BufferedReader br = new BufferedReader(new FileReader("/home/bivis/IdeaProjects/TMS-QA-Courses/lesson8/src/by/bivis/ex3/text.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                if (Palindrome.isPalindrome(s)) {
                    arrayList.add(s);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //Запись
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("/home/bivis/IdeaProjects/TMS-QA-Courses/lesson8/src/by/bivis/ex3/textNew.txt")))
        {
            for (String item : arrayList) {
                bw.write(item + "\n");
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

