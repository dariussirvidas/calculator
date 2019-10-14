package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num1, num2;
        double res;
        String op;

        do {
            System.out.println("Įveskite operacijos ženklą");
            op = s.next();

            switch (op) {
                case "+":
                    System.out.println("Įveskite sveiką skaičių");
                    num1 = s.nextInt();
                    System.out.println("Įveskite antrą sveiką skaičių");
                    num2 = s.nextInt();
                    res = sudeti(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + res);
                    break;
                case "-":
                    spausdinti(atimti());
                    break;
                case "*":
                    System.out.println("Įveskite sveiką skaičių");
                    num1 = s.nextInt();
                    System.out.println("Įveskite antrą sveiką skaičių");
                    num2 = s.nextInt();
                    dauginti(num1, num2);
                    break;
                case "/":
                    dalinti();
                    break;
                default:
                    System.out.println("Operacija negalima");
                    break;
            }

            System.out.println("Ar norite tęsti? (y/n)");
        } while (s.next().equals("y"));
    }

    /**
     * Asks the user to input two numbers and subtracts them
     * @return the subtraction result
     */
    public static double atimti() {
        Scanner s = new Scanner(System.in);
        double num1, num2;
        System.out.println("Įveskite pirmą skaičių");
        num1 = s.nextDouble();
        System.out.println("Įveskite antrą skaičių");
        num2 = s.nextDouble();
        System.out.print(num1 + " - " + num2 + " = ");
        return num1 - num2;
    }

    /**
     * Adds two numbers passed to the function and returns the result
     * @param sk1 first number to be added
     * @param sk2 second number to be added
     * @return the result of adding sk1 and sk2
     */
    public static double sudeti(int sk1, int sk2) {
        double res = sk1 + sk2;
        return res;
    }

    /**
     * Asks the user to input two numbers, divides them and prints the result.
     */
    public static void dalinti() {
        Scanner s = new Scanner(System.in);
        double num1, num2, res;
        System.out.println("Įveskite pirmą skaičių");
        num1 = s.nextDouble();
        System.out.println("Įveskite antrą skaičių");
        num2 = s.nextDouble();
        if (num2 == 0) spausdinti();
        else {
            res = num1 / num2;
            spausdinti(num1, num2, res);
        }
    }

    /**
     * Multiplies two numbers passed to the function and prints the result
     * @param sk1 first number to be multiplied
     * @param sk2 second number to be multiplied
     */
    public static void dauginti(int sk1, int sk2) {
        System.out.println(sk1 + " * " + sk2 + " = " + sk1 * sk2);
    }

    /**
     * Prints an error message
     */
    public static void spausdinti() {
        System.out.println("Dalyba iš nulio negalima");
    }

    /**
     * prints the number passed to the function
     * @param sk the number to be printed
     */
    public static void spausdinti(double sk) {
        System.out.println(sk);
    }

    /**
     * Prints sk1 / sk2 = sk3
     * @param sk1 first number to be printed
     * @param sk2 second number to be printed
     * @param sk3 third number to be printed
     */
    public static void spausdinti(double sk1, double sk2, double sk3) {
        System.out.println(sk1 + " / " + sk2 + " = " + sk3);
    }

}
