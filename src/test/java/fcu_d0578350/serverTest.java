package fcu_d0578350;

import junit.framework.TestCase;
import org.junit.*;

public class serverTest extends TestCase{
    public Server myServer;
    private int server;
    private int client;
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
    @Test
    public void test4(){
        client = 8888;
        server = myServer.getServer();

        assertEquals(client, server);
    }
    @Test
    public void test5(){
        acceptMessage = myServer.setAcceptMessage(inputMessage);
        assertEquals(acceptMessage, myServer.getAcceptMessage());
    }
}
