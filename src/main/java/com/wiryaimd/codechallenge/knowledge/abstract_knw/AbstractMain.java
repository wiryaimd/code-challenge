package com.wiryaimd.codechallenge.knowledge.abstract_knw;

public class AbstractMain extends AbstractSample{

    public AbstractMain(String name, int a) {
        super(name, a);
    }

    public static void main(String[] args) {
        AbstractSample abstractSample = new AbstractSample("asdas", 2) {
            @Override
            public String fillNameA() {
                return "";
            }
        };
    }

    @Override
    public String fillNameA() {
        return null;
    }
}
