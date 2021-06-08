package com.kodilla;

public class Calculator {
    int A = 40;
    int B = 15;
    public void addAToB() {
        int i = A + B;
        System.out.println("Result of adding: " + i);
    }
    public void subtractBFromA() {
        int y = A - B;
        System.out.println("Result of subtraction: " + y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addAToB();
        calculator.subtractBFromA();

    }
}

