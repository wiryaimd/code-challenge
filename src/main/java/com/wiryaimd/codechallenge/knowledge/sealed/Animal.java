package com.wiryaimd.codechallenge.knowledge.sealed;


// fungsinya untuk membatasi siapa saja yg boleh meng implement interface ini
// jadi keyword permits untuk memberi tahu class mana yg boleh implement
// dgn keyword sealed untuk menandakan interface ini tertutup
public sealed interface Animal permits SitDog, CatMeow{

    // jadi yg bisa implement ini method hanya class SitDog, dan CatMeow
    void eat();

}
