
package com.github.A1S2D5;

public class project {

        int M;
        int S;


    public boolean Mover(int M){
        if(M >= 61)
            return false;
        else
            return true;
    }
    public boolean Sover(int S){
        if((S >= 61) || (S < 0))
            return false;
        else
            return true;
    }



}
