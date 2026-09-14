package in.datatype;

import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {

        BigDecimal num1 = new BigDecimal("100.50");
        BigDecimal num2 = new BigDecimal("25.25");
        BigDecimal a = new BigDecimal("1234567890987654321234567890923456789876543467876543678987654346788765434568987642345678987654345678987654345678764387654345678765434567");
        BigDecimal b = new BigDecimal("1234567890987654321234567890923456789876543467876543678987654346788765434568987642345678987654345678987654345678764387654345678765434567.1234567890987654321234567890923456789876543467876543678987654346788765434568987642345678987654345678987654345678764387654345678765434567");

        // Addition
         BigDecimal addition = num1.add(num2);
         BigDecimal subtraction1 = a.multiply(b);
//
        // Subtraction
          BigDecimal subtraction = num1.subtract(num2);
          
//
//        // Multiplication
        BigDecimal multiplication = num1.multiply(num2);
//
//        // Division//       BigDecimal division = num1.divide(num2);
//
        System.out.println("Subtraction1       : " + subtraction1);
        System.out.println("Addition       : " + addition);
        System.out.println("Subtraction    : " + subtraction);
        System.out.println("Multiplication : " + multiplication);
       // System.out.println("Division       : " + division);
    }
}