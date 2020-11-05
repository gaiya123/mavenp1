package com.pradeepk.mvn1;

public class MyCal {
    private int Val1;
    private int Val2;

    public MyCal(){

    }

    public MyCal(int val1, int val2) {
        Val1 = val1;
        Val2 = val2;
    }

    public int sumValue(){
        return Val1+Val2;
    }
}
