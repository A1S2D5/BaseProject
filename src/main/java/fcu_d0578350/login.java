package fcu_d0578350;

class Login {
    public String account[] = {"aaa", "bbb", "ccc"};
    public String password[] = {"111", "222", "333"};
    public int temp[] = new int [8];

    public void key_in(){
        String key_id = "";
        String key_pw = "";
        String key_code = "";
        String msg = "";

        boolean flag = false;

        while (flag) {

            System.out.println("請輸入帳號:");
            java.util.Scanner s = new java.util.Scanner(System.in);
            key_id = s.next();

            System.out.println("請輸入密碼:");
            java.util.Scanner s2 = new java.util.Scanner(System.in);
            key_pw = s2.next();

            // 秀出驗證碼
            show_code();
            // 輸入驗證碼
            System.out.println("請輸入驗證碼:");
            java.util.Scanner s3 = new java.util.Scanner(System.in);
            key_code = s3.next();

            // 呼叫 check(    )
            switch (check(key_id, key_pw, key_code)) {
                case 1:
                    msg = "登入成功";
                    break;
                case 2:
                    msg = "帳號錯誤";
                    break;
                case 3:
                    msg = "密碼錯誤";
                    break;
                case 4:
                    msg = "驗證碼錯誤";
                    break;
                default:
                    msg = "系統異常";
                    break;
            }
            System.out.println(msg);
        }
    }

    public void show_code() {
        System.out.print("驗證碼為:");
        //      驗證碼
        for (int i = 0; i < 8; i++) {
            if (i < 3) {                                           //前 3 放數字
                temp[i] = (int) ((Math.random() * 10) + 48);
            } else if (i < 6) {                                           // 中間 3 位放大寫英文
                temp[i] = (int) (((Math.random() * 26) + 65));
            } else {                                           // 後 2 位放小寫英文
                temp[i] = ((int) ((Math.random() * 26) + 97));
            }

            System.out.print((char) temp[i]);
        }

        System.out.println();
    }

    public int check(String id, String pw, String code) {
        int op = 0;
        //  檢查如果正確傳回 1
        //  帳號錯傳回 2
        //  密碼錯傳回 3
        //  驗證碼錯傳回4
        for (int i = 0; i < account.length; i++) {
            String code_t = "";
            for (int j = 0; j < 8; j++) {
                code_t += (char) temp[j];
            }
            if (id.equals(account[i]) && pw.equals(password[i]) && code.equals(code_t)) {
                op = 1;
                return op;
            } else if (id.equals(account[i])) {
                if (pw.equals(password[i])) {
                    op = 4;
                    return op;
                } else {
                    op = 3;
                    return op;
                }
            } else {
                op = 2;
                return op;
            }
        }
        return op;
    }
}

public class login {

    public static void main(String[] args) {
        // 建立一個系統登入的物件
        Login s_login = new Login();
        // 開啟系統
        s_login.key_in();
    }

}
