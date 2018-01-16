package fcu_d0578350;

import junit.framework.TestCase;
import org.junit.*;

public class clientTest extends TestCase{
    public Client myClient;
    private int server;
    private int client;
    private String inputMessage;
    private String acceptMessage;
    private boolean ans;

    @Before
    public void setUp() throws Exception{
        myClient = new Client();
    }
    @After
    public void teardown() throws Exception{
        myClient = null;
    }
    @Test
    public void test1(){
        client = 8888;

        assertEquals(client, myClient.getClient());
    }
    @Test
    public void test2(){
        inputMessage = myClient.setInputMessage(inputMessage);

        assertEquals(inputMessage, myClient.getInputMessage());
    }
    @Test
    public void test3(){
        inputMessage = "aaa";
        ans = true;

        assertEquals(ans, myClient.sizeofImputMessage(inputMessage));
    }
    @Test
    public void test4(){
        client = myClient.getClient();
        server = 8888;

        assertEquals(client, server);
    }
    @Test
    public void test5(){
        acceptMessage = myClient.setAcceptMessage(inputMessage);
        assertEquals(acceptMessage, myClient.getAcceptMessage());
    }
    @Test
    public void test6(){
        ans = true;
        client = myClient.setClient(8888);
        assertEquals(client, myClient.getClient());
    }
    @Test
    public  void test7(){
        client = myClient.getClient();
        ans = true;
        assertEquals(ans, myClient.sizeofClient(client));
    }
}
