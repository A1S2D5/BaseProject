package fcu_d0578350;


public class Server {
    private int server;
    private String inputMessage;
    private String acceptMessage;
    public int client;

    public Server() {
        inputMessage = "aaa";
        acceptMessage = "";
        server = 8888;
        client = 0;
    }

    public int setServer(int server){
        this.server = server;
        return server;
    }

    public int getServer(){
        return server;
    }

    public boolean sizeofServer(int server){
        if(server > 9999 || server < 0){
            return false;
        }
        else{
            return true;
        }
    }

    public String setInputMessage(String inputMessage){
        this.inputMessage = inputMessage;
        return inputMessage;
    }

    public String getInputMessage() {
        return inputMessage;
    }

    public boolean sizeofImputMessage(String inputMessage){
        if(inputMessage.length() > 140 || inputMessage.length() < 0){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean clientServer(int client, int server) {
        if(client == server){
            return true;
        }
        else {
            return false;
        }
    }

    public String setAcceptMessage(String inputMessage){
        this.acceptMessage = inputMessage;
        return acceptMessage;
    }

    public String getAcceptMessage() {
        return acceptMessage;
    }

   /* public static void main(String args[]) {
        new Server();
    }*/
}
