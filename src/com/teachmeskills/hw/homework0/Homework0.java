package com.teachmeskills.hw.homework0;
/*
Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это некий стандартный номер документа в заданном формате).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это любая цифра, а y — это буква латинского алфавита (могут быть большие и маленькие).
	- Вывести на экран в одну строку два первых блока по 4 цифры.
	- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
	- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
	- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
	- Проверить содержит ли номер документа последовательность "abc" и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
	- Проверить начинается ли номер документа с последовательности 555.
	- Проверить заканчивается ли номер документа на последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах, каждая задача - в отдельном методе.
Методы на вход (входным параметром) будут принимать вводимую на вход программы строку.
 */
public class Homework0 {

    // Вывод двух первых блоков по 4 цифры (используем split)
    public static void firstTwoBlocks(String document) {
        String[] blocks = document.split("-");
        System.out.println(blocks[0] + "-" + blocks[1]);
    }

    // Вывод номера документа с заменой 3-х букв на "***" (используем charAt)
    public static void hideLettersInDocument(String document) {
        String[] blocks = document.split("-");
        String hideLetters = "***-***-" + blocks[2].charAt(0) + "-*";
        System.out.println(hideLetters);
    }

    // Вывод только букв из номера документа в формате yyy/yyy/y/y в нижнем регистре (toLowerCase)
    public static void lowerCase(String document) {
        String lowerCase = document.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(lowerCase);
    }

    // Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
    public static void upperCase(String document) {
        StringBuilder upperCase = new StringBuilder("Letters:");
        for (char c : document.toCharArray()) {
            if (Character.isLetter(c)) {
                upperCase.append(Character.toUpperCase(c));
            }
        }
        System.out.println(upperCase);
    }

    /*
     Проверить содержит ли номер документа последовательность "abc" и вывести сообщение содержит или нет
     (причем, abc и ABC считается одинаковой последовательностью).
     */
    public static void checkSubstring(String document) {
        StringBuilder lowercaseDocumentNumber = new StringBuilder(document.toLowerCase());
        if (lowercaseDocumentNumber.indexOf("abc") != -1) {
            System.out.println("The document number contains the sequence \"abc\"");
        } else {
            System.out.println("The document number does not contain a sequence \"abc\"");
        }
    }

    // Проверить начинается ли номер документа с последовательности 555.
    public static void checkStartsWithSequence(String document) {
        if (document.startsWith("555")) {
            System.out.println("The document number starts with the sequence \"555\"");
        } else {
            System.out.println("The document number does not start with the sequence \"555\"");
        }
    }

    // Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static void checkEndsWithSequence(String document) {
        if (document.endsWith("1a2b")) {
            System.out.println("The document number ends with the sequence \"1a2b\"");
        } else {
            System.out.println("The document number does not end in a sequence \"1a2b\"");
        }
    }
}
