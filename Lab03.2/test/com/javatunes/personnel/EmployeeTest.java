package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest
{
    //fixtures
    private Employee emp1;
    private Employee emp2;

    @Before
    public void setUp()
    {
       emp1 = new SalariedEmployee("John", Date.valueOf("2000-01-01"));
       emp2 = new SalariedEmployee("John", Date.valueOf("2000-01-01"));
    }

    @Test
    public void equals_shouldReturnFalse_diffName_sameHireDate()
    {
        emp2.setName("Eric");
        assertNotEquals(emp1,emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate()
    {
        emp2.setHireDate(Date.valueOf("2001-10-10"));
        assertNotEquals(emp1,emp2);
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame()
    {
        assertEquals(emp1,emp2); // this does an equals() check for objects
        //assertTrue(emp1.equals(emp2));
    }
}