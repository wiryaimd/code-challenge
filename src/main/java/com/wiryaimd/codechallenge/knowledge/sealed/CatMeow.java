package com.wiryaimd.codechallenge.knowledge.sealed;

// atau key final bisa juga pakai non-sealed
public final class CatMeow implements Animal{
    // jika class CatMeow tidak di permits oleh interface animal..
    // maka tidak akan bisa di implement

    @Override
    public void eat() {
        System.out.println("meow kyun kyun");
    }
}
