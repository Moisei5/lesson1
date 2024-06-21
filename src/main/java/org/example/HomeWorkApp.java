package org.example;
// урок 1

import com.sun.deploy.security.SelectableSecurityManager;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(10, 20);
        printColor(100);
        compareNumbers(30, 60);
    }
    private static void printThreeWords() { //Создать метод который выводит все слова
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSumSign(int a, int b) { // Создать метод который должен проссуммировать переменные и вывести положит или отр результат
        int c = a + b;
        if (c >= 0) {
            System.out.println("положительный");
        } else {
            System.out.println("отрицательный");
        }
    }// Создать метод который будет выводить текст цвета в зависимости от числа
    private static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        }else if (value > 0 && value < 100){
            System.out.println("желтый");
        }else {
            System.out.println("зеленый");
        }
    }// Создать метод больше меньше или равно

    private static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a => b");
        } else {
            System.out.println("a < b");
        }
    }
}

