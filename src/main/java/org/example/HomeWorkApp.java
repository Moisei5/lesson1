package org.example;

/** урок 1
 * Hello world!
 */
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    private static void printThreeWords() {
        System.out.println(" Orange ");
        System.out.println(" Banana ");
        System.out.println(" Apple ");
    }
    private static void checkSumSign() {
        int a = 10, b = 2, c = a + b;
        if (c >= 0) {
            System.out.println(" положительный ");
        }
        if (c < 0) {
            System.out.println(" отрицательный ");
        }
    }
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
            }
    private static void compareNumbers() {
        int a = 30, b = 60;
        if (a >= b) {
            System.out.println("a => b");
        }
        if ( a < b) {
            System.out.println("a < b");}
        }
    }

