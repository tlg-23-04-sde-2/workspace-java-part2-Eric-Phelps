/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.billing;

/**
 * European orders are taxed as follows:
 * VAT is 17% of taxable amount.
 * Luxury tax is an additional 25% on amount over $100.
 *
 * TODO: implement this algorithm.
 */
public class EuropeTax implements TaxCalculator{
    private static final double VAT = .17;
    private static final double LUXURY_TAX_RATE = .25;
    private static final double LUXURY_LIMIT = 100.00;


    @Override
    public double taxAmount(double taxable) {
        double result = 0.0;

        if (taxable > LUXURY_LIMIT){
            result = (((taxable - 100) * LUXURY_TAX_RATE) + (taxable * VAT));
        }
        else{
            result = (taxable * VAT);
        }

        return result;
    }
}