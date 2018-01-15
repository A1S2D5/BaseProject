package fcu_d0578350;

import junit.framework.TestCase;
import org.junit.*;

public class loginTest extends TestCase{
    public int input[] = new int[8];
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
    public void Test1() {
        char x = 'a';
        for (int i = 0; i < 3; i++) {
            input[i] = i;
        }
        for (int i = 3; i < 6; i++) {
            input[i] = x;
            x++;
        }
        for (int i = 6; i < 8; i++) {
            input[i] = i;
        }

        assertEquals(input, mylogin.getShowCode());
    }
    @Test
    public void Test2(){
        String account[] = {"aaa", "bbb", "ccc"};

        assertEquals(account, mylogin.getAccount());
    }
}
