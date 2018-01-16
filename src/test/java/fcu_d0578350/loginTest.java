package fcu_d0578350;

import junit.framework.TestCase;
import org.junit.*;

public class loginTest extends TestCase{

    public int[] input = new int[8];
    public String[] account = new String[3];
    public String password[] = {"111", "222", "333"};
    public login mylogin;
    @Before
    public void setUp() throws Exception{
        mylogin = new login();
    }
    @After
    public void tardown() throws Exception{
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
}
