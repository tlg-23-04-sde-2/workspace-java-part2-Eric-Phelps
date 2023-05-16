package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest
{
    //fixtures
    private SalariedEmployee semp;
    private SalariedEmployee semp2;

    @Before
    public void setUp()
    {
        semp = new SalariedEmployee("Eric", Date.valueOf("1994-05-24"),1200.00 );
        semp2 = new SalariedEmployee("Eric", Date.valueOf("1994-05-24"),1200.00 );

    }

    @Test
    public void equals_shouldReturnFalse_diffName_sameHireDate_sameSalary()
    {
        semp2.setName("Kohn");
        assertNotEquals(semp,semp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_diffHireDate_sameSalary()
    {
        semp2.setHireDate(Date.valueOf("1994-06-24"));
        assertNotEquals(semp,semp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_sameHireDate_diffSalary()
    {
        semp2.setSalary(1500.00);
        assertNotEquals(semp,semp2);
    }

    @Test
    public void equals_shouldReturnTrue_allPropsSame()
    {
        assertEquals(semp,semp2);
    }

    @Test
    public void testPay()
    {
        assertEquals(1200.00, semp.pay(), .001);
    }

    @Test
    public void testPayTaxes()
    {
        assertEquals(360.00, semp.payTaxes(), .001);
    }


}