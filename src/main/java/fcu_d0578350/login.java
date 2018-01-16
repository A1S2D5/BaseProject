package fcu_d0578350;

class login {
    public String account[] = {"aaa", "bbb", "ccc"};
    public String password[] = {"111", "222", "333"};
    public int temp[] = new int [8];

    public void key_in(){
        String key_id = "";
        String key_pw = "";
        int[] key_code = null;
        String msg = "";


            System.out.println("請輸入帳號:");
            key_id = "aaa";

            System.out.println("請輸入密碼:");
            key_pw = "111";

            // 秀出驗證碼
            show_code();
            // 輸入驗證碼
            System.out.println("請輸入驗證碼:");
            key_code = getShowCode();

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

    public int[] setShowCode(){
        for (int i = 0; i < 8; i++) {
            if (i < 3) {                                           //前 3 放數字
                this.temp[i] = (int) ((Math.random() * 10) + 48);
            } else if (i < 6) {                                           // 中間 3 位放大寫英文
                this.temp[i] = (int) (((Math.random() * 26) + 65));
            } else {                                           // 後 2 位放小寫英文
                this.temp[i] = ((int) ((Math.random() * 26) + 97));
            }
        }
        return temp;
    }

    public int[] getShowCode(){
        return temp;
    }

    public String[] setAccount(){
        this.account = account;
        return account;
    }

    public String[] getAccount(){
        return account;
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

    public int check(String id, String pw, int[] code) {
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


