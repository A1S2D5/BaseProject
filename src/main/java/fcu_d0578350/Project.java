package fcu_d0578350;

public class Project {
    public int secend = 0;
    public int minute = 0;

    public Project(){
        this.minute = 0;
        this.secend = 0;
    }

    public Project(int minute, int secend){
        this.minute = minute;
        this.secend = secend;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecend(int secend) {
        this.secend = secend;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecend() {
        return secend;
    }

    public boolean equals_min(){
        if(minute > 60 || minute < 0){
            return false;
        }

        else{
            return true;
        }
    }

    public boolean equals_sec(){
        if(secend > 60 || secend < 0){
            return false;
        }
        else{
            return true;
        }
    }

}
