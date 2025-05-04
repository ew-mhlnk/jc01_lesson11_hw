package com.training.jc.entity;

public class ComplexNumber {
    double realPart;
    double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
            this.realPart + other.realPart,
            this.imaginaryPart + other.imaginaryPart
        );
    }

    @Override
    public String toString() {
        if (imaginaryPart < 0) {
            return String.format("%.1f - %.1fi", realPart, -imaginaryPart);
        } else {
            return String.format("%.1f + %.1fi", realPart, imaginaryPart);
        }
    }
}
