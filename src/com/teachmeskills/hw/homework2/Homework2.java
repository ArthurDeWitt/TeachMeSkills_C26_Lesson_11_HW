package com.teachmeskills.hw.homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        // Ввод произвольной строки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write something: ");
        String inputString = scanner.nextLine();

        // Ячейка хранения результата
        String duplicatedString = duplicateString(inputString);

        // Вывод результата
        System.out.println("New string: " + duplicatedString);
    }

    // Реализация метода удвоения с помощью StringBuilder
    public static String duplicateString(String inputString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            sb.append(c).append(c);
        }
        return sb.toString();
    }
}
