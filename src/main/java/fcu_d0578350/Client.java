package fcu_d0578350;

public class Client {
    private int client;
    private String inputMessage;
    private String acceptMessage;
    public Server myserver;
    public int server;
    public Client() {
        inputMessage = "aaa";
        acceptMessage = "";
        client = 8888;
        server = 0;
    }

    public int getClient() {
        return client;
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

    public void showServerMessage(){
        System.out.println(myserver.getInputMessage());
    }

    public boolean clientServer(){
        if(client == myserver.getServer()){
            return true;
        }
        else {
            return true;
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
