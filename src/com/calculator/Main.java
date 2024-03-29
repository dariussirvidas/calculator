package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double a, b, c = 0;
        String op;
        int error = 0;
        boolean repeat = true;

        while (repeat) {

            System.out.println("Įveskite du skaičius ir operacijos ženklą atskirtus tarpais (pvz. 2 + 2)");
            a = s.nextDouble();
            op = s.next();
            b = s.nextDouble();

            switch (op) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "*":
                    c = a * b;
                    break;
                case "/":
                    if (b == 0) error = 2;
                    else c = a / b;
                    break;
                case "?":
                    for (int i = 9; i <= 99; i++) {
                        c = (b + a) / i - (a - b);

                        System.out.print("(" + b + " + " + a + ") / " + i + " - (" + a + " - " + b + ") = " + c);
                        if (c > 0.25) System.out.println(" > 0.25");
                        else if (c < 0.25) System.out.println(" < 0.25");
                        else System.out.println(" == 0.25");
                    }
                    error = -1;
                    break;
                default:
                    error = 1;
                    break;
            }

            if (error == 1) System.out.println("Operacija negalima");
            else if (error == 2) System.out.println("Dalyba iš nulio negalima");
            else if (error == 0) System.out.println(a + " " + op + " " + b + " = " + c);

            error = 0;

            System.out.println("Ar norite tęsti? (y/n)");
            if (!s.next().equals("y")) repeat = false;
        }
    }
}
