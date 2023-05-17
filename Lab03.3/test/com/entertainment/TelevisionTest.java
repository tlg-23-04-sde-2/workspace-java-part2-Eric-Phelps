package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest
{
    //fixtures
    private Television tv1;
    private Television tv2;

    @Before
    public void setUp()
    {
        tv1 = new Television();
    }

    @Test
    public void setVolume_shouldStoreVolume_whenValidVolumeInput_upperBound()
    {
        tv1.setVolume(100);
        assertEquals(100, tv1.getVolume());
    }

    @Test
    public void setVolume_shouldStoreVolume_whenValidVolumeInput_lowerBound()
    {
        tv1.setVolume(0);
        assertEquals(0, tv1.getVolume());
    }
}