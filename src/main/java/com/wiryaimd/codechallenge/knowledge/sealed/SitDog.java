package com.wiryaimd.codechallenge.knowledge.sealed;

// atau bisa non-sealed diganti jadi final
// butuh penanda non-sealed/final agar bisa meng implement sealed interface
public non-sealed class SitDog implements Animal{

    @Override
    public void eat() {
        System.out.println("eat dog");
    }
}
