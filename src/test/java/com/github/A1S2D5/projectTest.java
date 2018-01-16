package com.github.A1S2D5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class projectTest {

    public project time;
    public boolean result = false;

   @Before
    public void setUp() throws Exception {
        time = new project();
    }

    @Test
    public void test1() throws Exception{
        assertTrue("Should Be True", true);
    }

    @Test
    public void test2() throws Exception{
       time.M = 32;
       result = true;
        assertEquals(result, time.Mover(time.M));
    }

    @Test
    public void test3() throws Exception{
       time.S = 30;
       result = true;
       assertEquals(result, time.Sover(time.S));
    }
}
