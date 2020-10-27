package ex4;

/*
        Текстовый файл содержит текст. После запуска программы в другой файл
        должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
        предложении присутствует слово-палиндром, то не имеет значения какое кол-во
        слов в предложении, оно попадает в новый файл.
        Пишем все в ООП стиле. Создаём класс TextFormater
        в котором два статических метода:
        1. Метод принимает строку и возвращает кол-во слов в строке.
        2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
        есть возвращает true, если нет false
        В main считываем файл.
        Разбиваем текст на предложения. Используя методы класса TextFormater
        определяем подходит ли нам предложение. Если подходит добавляем его в
        новый файл
 */

import by.bivis.palindrome.Palindrome;

import java.io.*;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/bivis/IdeaProjects/TMS-QA-Courses/lesson8/src/ex4/text.txt"))) {
            // чтение посимвольно
            int c;
            while ((c = br.read()) != -1) {
                sb.append((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.print(sb.toString());
        System.out.print(Arrays.toString(TextFormater.splitBySentences(sb.toString())));

        String[] sentences = TextFormater.splitBySentences(sb.toString());

        StringBuilder sb2 = new StringBuilder();

        //TODO Почему-то записывает всё предложения
        for (String sentence : sentences) {
            if (TextFormater.therePalindrome(sentence)) {
                sb2.append(sentence);
            } else if (TextFormater.wordCount(sentence) > 2 && TextFormater.wordCount(sentence) < 6) {
                sb2.append(sentence);
            }
        }

        System.out.println(sb2.toString());

        //Запись
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("/home/bivis/IdeaProjects/TMS-QA-Courses/lesson8/src/ex4/textNew.txt")))
        {
            bw.write(sb2.toString());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
