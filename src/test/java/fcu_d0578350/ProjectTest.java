package fcu_d0578350;

import junit.framework.TestCase;
import org.junit.*;

public class ProjectTest extends TestCase{

    public int inputmin, inputsec;
    public boolean minresult = false;
    public boolean secresult = false;

    public Project myproject;
    @Before
    public void setUp() throws Exception{
        myproject = new Project();
    }
    @After
    public void teardown() throws Exception{
        myproject  = null;
    }
    @Test
    public void test1(){
        inputmin = 1;
        inputsec = 7;

        myproject.setMinute(inputmin);
        myproject.setSecend(inputsec);

        minresult = true;
        secresult = true;

        assertEquals(minresult, myproject.equals_min());
        assertEquals(secresult, myproject.equals_sec());
    }
    @Test
    public void test2(){
        inputsec = 61;
        inputmin = 0;

        myproject.setMinute(inputmin);
        myproject.setSecend(inputsec);

        minresult = true;
        secresult = false;

        assertEquals(minresult, myproject.equals_min());
        assertEquals(secresult, myproject.equals_sec());
    }
    @Test
    public void test3(){
        inputmin = 61;
        inputsec = 7;

        myproject.setMinute(inputmin);
        myproject.setSecend(inputsec);

        minresult = false;
        secresult = true;

        assertEquals(minresult, myproject.equals_min());
        assertEquals(secresult, myproject.equals_sec());
    }
    @Test
    public void test4(){
        inputmin = 63;
        inputsec = 67;

        myproject.setMinute(inputmin);
        myproject.setSecend(inputsec);

        minresult = false;
        secresult = false;

        assertEquals(minresult, myproject.equals_min());
        assertEquals(secresult, myproject.equals_sec());
    }
    @Test
    public void test5(){
        myproject.getMinute();
        myproject.getSecend();

        minresult = true;
        secresult = true;

        assertEquals(minresult, myproject.equals_min());
        assertEquals(secresult, myproject.equals_sec());
    }
}
