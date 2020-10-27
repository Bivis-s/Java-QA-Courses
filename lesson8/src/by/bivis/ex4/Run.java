package by.bivis.ex4;

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

import java.io.*;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/anton/IdeaProjects/TMS-QA-Courses/lesson8/src/by/bivis/ex4/text.txt"))) {
            // чтение посимвольно
            int c;
            while ((c = br.read()) != -1) {
                sb.append((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //Запись
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("/home/anton/IdeaProjects/TMS-QA-Courses/lesson8/src/by/bivis/ex4/textNew.txt")))
        {
            String[] sentences = TextFormater.splitBySentences(sb.toString());

            for (String sentence : sentences) {
                String trimmedSentence = sentence.trim();
                if (TextFormater.therePalindrome(trimmedSentence)) {
                    bw.write(trimmedSentence + ". ");
                } else if (TextFormater.wordCount(trimmedSentence) > 2 && TextFormater.wordCount(trimmedSentence) < 6) {
                    bw.write(trimmedSentence + ". ");
                }
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
