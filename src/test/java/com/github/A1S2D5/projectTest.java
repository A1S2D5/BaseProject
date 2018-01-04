package com.github.A1S2D5;

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
    public void mover() {
time.Mover(61);
    }

    @Test
    public void sover() {
       time.Sover(61);
    }
}
