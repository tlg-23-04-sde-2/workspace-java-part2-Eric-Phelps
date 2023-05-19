package com.javatunes.billing;

//this is an all static class, a factory for TaxCalculator instances.
public class TaxCalculatorFactory {

    //prevent outside instantiation - this is an all static class.
    private TaxCalculatorFactory(){
    }

    public static TaxCalculator getTaxCalculator(Location location){
        TaxCalculator calc = null;

        switch (location){
            case ONLINE:
                calc = new OnlineTax();
                break;
            case USA:
                calc = new USATax();
                break;
            case EUROPE:
                calc = new EuropeTax();
                break;
        }

        return  calc;
    }
}