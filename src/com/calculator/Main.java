package com.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num1, num2;
        String op;

        while (true) {
            while (true) {
                System.out.println("Įveskite pirmą skaičių: ");
                Scanner s = new Scanner(System.in);
                try {
                    num1 = s.nextDouble();
                    break;
                }
                catch (InputMismatchException e) {
                    System.out.println("Neteisingai įvestas skaičius! Bandykite dar kartą");
                }
            }
            while (true) {
                System.out.println("Įveskite operacijos ženklą: ");
                Scanner s = new Scanner(System.in);
                try {
                    op = s.next();
                    if(op.length() != 1) throw new Exception("Neteisingai įvestas operacijos ženklas!");
                    break;
                }
                catch (Exception e) {
                    System.out.println(e.getMessage() + " Bandykite dar kartą");
                }
            }
            while (true) {
                System.out.println("Įveskite antrą skaičių: ");
                Scanner s = new Scanner(System.in);
                try {
                    num2 = s.nextDouble();
                    break;
                }
                catch (InputMismatchException e) {
                    System.out.println("Neteisingai įvestas skaičius! Bandykite dar kartą");
                }
            }

            try {
                System.out.println(String.format("%.2f %s %.2f = %.2f", num1, op, num2, calculate(num1, op, num2)));
            }
            catch (ArithmeticException e) {
                System.out.println("Dalyba iš nulio negalima!");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Ar norite tęsti? (y/n)");
            Scanner s = new Scanner(System.in);
            if (!s.next().equals("y")) break;
        }
    }
    private static double calculate(double n1, String o, double n2) throws Exception {
        switch (o) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if(n2 == 0) throw new ArithmeticException("Dalyba iš nulio negallima");
                return n1 / n2;
            default:
                throw new Exception("Operacija negalima!");
        }
    }
}
