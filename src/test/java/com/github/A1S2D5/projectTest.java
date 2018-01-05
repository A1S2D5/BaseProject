package com.github.A1S2D5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class projectTest {

    project time;

   @Before
    public void setUp() throws Exception {
time = new project();
    }

    @Test
    public void mover01() {
       assertEquals(time.Mover(61),false);
    }

    @Test
    public void sover01() {
       assertEquals( time.Sover(60),false);
      ;
    }
}
