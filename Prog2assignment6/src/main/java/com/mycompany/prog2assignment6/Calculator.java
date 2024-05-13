package com.mycompany.prog2assignment6;

import java.util.ArrayList;

public class Calculator {
    private int n;
    private ArrayList<Integer> numbers;

    public Calculator(int n) {
        this.n = n;
        this.numbers = new ArrayList<>();
    }

    public int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int sumofAllNumbers(int n) {
        if (n == 0)
            return 0;
        int sum = n + sumofAllNumbers(n - 1);
        numbers.add(n);
        return sum;
    }

    public double average() {
        if (numbers.isEmpty())
            throw new ArithmeticException("ArrayList is empty");
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }
}