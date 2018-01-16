package fcu_d0578350;

public class Client {
    private int client;
    private String inputMessage;
    private String acceptMessage;
    public int server;
    public Client() {
        inputMessage = "aaa";
        acceptMessage = "";
        client = 8888;
        server = 0;
    }

    public int setClient(int client){
        this.client = client;
        return client;
    }

    public int getClient() {
        return client;
    }

    public boolean sizeofClient(int client){
        if(client > 9999 || client < 0){
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
}
