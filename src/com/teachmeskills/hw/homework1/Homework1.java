package com.teachmeskills.hw.homework1;

import java.util.Scanner;

public class Homework1 {

    // Ввод произвольной строки
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");
        String inputString = scanner.nextLine();

        // Ячейки результатов
        String shortestWord = shortestWordInString(inputString);
        String longestWord = longestWordInString(inputString);

        // Вывод результата
        System.out.println("Shortest word in string: " + shortestWord);
        System.out.println("longest word in string: " + longestWord);
    }

    // Реализация метода поиска самого короткого слова в строке
    public static String shortestWordInString(String inputString) {
        String[] words = inputString.split("\\s+");
        String shortestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }
        return shortestWord;
    }

    // Реализация метода поиска самого длинного слова в строке
    public static String longestWordInString(String inputString) {
        String[] words = inputString.split("\\s");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }
}

