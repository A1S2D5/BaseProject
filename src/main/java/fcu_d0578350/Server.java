package fcu_d0578350;


public class Server {
    private int server;
    private String inputMessage;
    private String acceptMessage;

    public Server() {
        inputMessage = "aaa";
        acceptMessage = "";
        server = 8888;
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

    public static void main(String args[]) {
        new Server();
    }
}
