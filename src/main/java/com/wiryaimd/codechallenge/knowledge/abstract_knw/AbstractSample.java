package com.wiryaimd.codechallenge.knowledge.abstract_knw;

public abstract class AbstractSample {

    private String name;
    private int a;

    public AbstractSample(String name, int a) {
        this.name = name;
        this.a = a;
    }

    public abstract String fillNameA();

    public String maName(){
        return name.repeat(a) + "-rm";
    }


}
