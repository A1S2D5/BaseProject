package fcu_d0578350;

import junit.framework.*;
import com.github.A1S2D5.project;
import org.junit.Assert;
//import org.junit.Test;

public class ProjectTest extends TestCase{

    public int inputmin, inputsec;
    public boolean minresult = false;
    public boolean secresult = false;

    public Project myproject;

    public void setUp(){
        myproject = new Project();
    }

    public void tardown(){
        myproject  = null;
    }

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

}
