package com.in28minutes.oops;

import java.math.BigDecimal;

public class CalculatorRunner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator("5500.00", "5.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
    }

}
