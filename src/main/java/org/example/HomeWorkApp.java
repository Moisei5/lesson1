package org.example;
// урок 1

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    private static void printThreeWords() { //Создать метод который выводит все слова
        System.out.println(" Orange ");
        System.out.println(" Banana ");
        System.out.println(" Apple ");
    }
    private static void checkSumSign() { // Создать метод который должен проссуммировать переменные и вывести положит или отр результат
        int a = 10, b = 2, c = a + b;
        if (c >= 0) {
            System.out.println(" положительный ");
        }
        if (c < 0) {
            System.out.println(" отрицательный ");
        }
    }     // Создать метод который будет выводить текст цвета в зависимости от числа
    private static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println(" Красный ");
        }
        if (value > 0 && value <100){
        System.out.println(" желтый ");
    }
        if (value > 100) {
            System.out.println(" зеленый ");
        }
            } // Создать метод больше меньше или равно
    private static void compareNumbers() {
        int a = 30, b = 60;
        if (a >= b) {
            System.out.println("a => b");
        }
        if ( a < b) {
            System.out.println("a < b");}
        }
    }

