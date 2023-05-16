package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest
{
    //fixtures
    private HourlyEmployee hemp;
    private HourlyEmployee hemp2;

    @Before
    public void setUp()
    {
        hemp =  new HourlyEmployee("Eric", Date.valueOf("2010-05-24"), 31.0, 40.0);
        hemp2 =  new HourlyEmployee("Eric", Date.valueOf("2010-05-24"), 31.0, 40.0);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_diffHireDate_sameRate_sameHours()
    {
        hemp2.setHireDate(Date.valueOf("2000-05-25"));
        assertNotEquals(hemp,hemp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_SameHireDate_diffRate_SameHours()
    {
        hemp2.setRate(25.0);
        assertNotEquals(hemp,hemp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_SameHireDate_sameRate_diffHours()
    {
        hemp2.setHours(45.0);
        assertNotEquals(hemp,hemp2);
    }

    @Test
    public void equals_shouldReturnTrue_allPropsSame()
    {
        assertEquals(hemp,hemp2);
    }

    @Test
    public void testPay()
    {
        assertEquals(1240.00,hemp.pay(), .001);
    }

    @Test
    public void testPayTaxes()
    {
        assertEquals(310.00, hemp.payTaxes(),.001);
    }
}