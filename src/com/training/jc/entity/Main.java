package com.training.jc.entity;

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 8);
        ComplexNumber c2 = new ComplexNumber(9, -5);

        System.out.println("Первое число: " + c1);
        System.out.println("Второе число: " + c2);

        ComplexNumber result = c1.add(c2);
        System.out.println("Сумма: " + result);
    }
}
