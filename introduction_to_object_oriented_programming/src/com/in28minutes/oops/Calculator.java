package com.in28minutes.oops;

import java.math.BigDecimal;

public class Calculator {

    BigDecimal principal;
    BigDecimal interest;

    public Calculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {

        BigDecimal bigDecimalNoOfYears = new BigDecimal(noOfYears);

        BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(bigDecimalNoOfYears));
        return totalValue;
    }

}
