
package com.github.A1S2D5;

public class project {

        int M;
        int S;


    public boolean Mover(int M){
        if(M <= 60 && M >= 0)
         return true;
        else
        return false;
    }
    public boolean Sover(int S){
        if((S >= 0) && (S < 60 ))
         return true;
        else
            return false;
    }



}
