package fcu_d0578350;

public class Begin {

    public static void main(String[] args) {
        // 建立一個系統登入的物件
        login s_login = new login();
        // 開啟系統
        s_login.key_in();

        Client myclient = new Client();
        myclient.setClient(8888);
        myclient.getAcceptMessage();
        myclient.getInputMessage();

        Server myserver = new Server();
        myserver.setServer(8888);
        myserver.getAcceptMessage();
        myserver.getInputMessage();

        Project myproject = new Project();
        myproject.setSecend(10);
        myproject.setMinute(10);
        myproject.equals_min();
        myproject.equals_sec();
    }

}
