package fcu_d0578350;

import junit.framework.TestCase;
import org.junit.*;

public class loginTest extends TestCase{

    public int[] input = new int[8];
    public String[] account = {"aaa", "bbb", "ccc"};
    public String[] password = {"111", "222", "333"};
    public int op = 0;
    public login mylogin;
    public String message = "登入成功";

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
        account = mylogin.setAccount(account);

        assertEquals(account, mylogin.getAccount());
    }
    @Test
    public void test3(){
        password = mylogin.setPassword(password);

        assertEquals(password, mylogin.getPassword());
    }
    @Test
    public void test4(){
        account = mylogin.setAccount(account);
        password = mylogin.setPassword(password);
        input = mylogin.setShowCode();
        op = 1;

        assertEquals(op, mylogin.check(account[0], password[0], input));
    }
    @Test
    public void test5(){

        assertEquals(message, mylogin.key_in());
    }
    @Test
    public void test6(){
        String[] temp = {"ggg","www","rrr"};
        account = mylogin.setAccount(temp);
        password = mylogin.setPassword(password);
        input = mylogin.setShowCode();
        op = 2;

        assertEquals(op, mylogin.check(temp[2], password[0], input));
    }
    @Test
    public void test7(){
        String[] temp = {"ggg","www","rrr"};
        account = mylogin.setAccount(temp);
        password = mylogin.setPassword(password);
        input = mylogin.setShowCode();
        op = 3;

        assertEquals(op, mylogin.check(temp[0], password[2], input));
    }
    @Test
    public void test8(){
        account = mylogin.setAccount(account);
        password = mylogin.setPassword(password);
        for(int i = 0; i < 8; i++){
            input[i] = i++;
        }
        op = 4;

        assertEquals(op, mylogin.check(account[0], password[0], input));
    }
}
