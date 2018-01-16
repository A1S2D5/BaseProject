package fcu_d0578350;

import junit.framework.TestCase;
import org.junit.*;

public class serverTest extends TestCase{
    public Server myServer;
    private int server;
    private String inputMessage;
    private String acceptMessage;
    private boolean ans;

    @Before
    public void setUp() throws Exception{
        myServer = new Server();
    }
    @After
    public void teardown() throws Exception{
        myServer = null;
    }

    @Test
    public void test1(){
        server = 8888;

        assertEquals(server, myServer.getServer());
    }
    @Test
    public void test2(){
        inputMessage = myServer.setInputMessage(inputMessage);

        assertEquals(inputMessage, myServer.getInputMessage());
    }
    @Test
    public void test3(){
        inputMessage = "aaa";
        ans = true;

        assertEquals(ans, myServer.sizeofImputMessage(inputMessage));
    }
}
