package fcu_d0578350;

import junit.framework.TestCase;
import org.junit.*;

public class loginTest extends TestCase{

    public int[] input = new int[8];
    public String[] account = new String[3];
    public String[] password = {"111", "222", "333"};
    public int op = 0;
    public login mylogin;

    @Before
    public void setUp() throws Exception{
        mylogin = new login();
    }
    @After
    public void teardown() throws Exception{
        mylogin = null;
    }
    @Test
    public void test1() {
        input = mylogin.setShowCode();

        assertEquals(input, mylogin.getShowCode());
    }
    @Test
    public void test2(){
        account = mylogin.setAccount();

        assertEquals(account, mylogin.getAccount());
    }
    @Test
    public void test3(){
        password = mylogin.setPassword();

        assertEquals(password, mylogin.getPassword());
    }
    @Test
    public void test4(){
        account = mylogin.setAccount();
        password = mylogin.setPassword();
        input = mylogin.setShowCode();
        op = 4;

        assertEquals(op, mylogin.check(account[0], password[0], input));
    }
    @Test
    public void test5(){
        input = mylogin.setShowCode();

        assertEquals(input, mylogin.setShowCode());
    }
    @Test
    public void test6(){
        account = mylogin.setAccount();

        assertEquals(account, mylogin.setAccount());
    }
    @Test
    public void test7(){
        password = mylogin.setPassword();

        assertEquals(password, mylogin.setPassword());
    }
}
