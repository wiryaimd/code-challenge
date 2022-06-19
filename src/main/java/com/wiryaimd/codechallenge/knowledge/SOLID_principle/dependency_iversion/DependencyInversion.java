package com.wiryaimd.codechallenge.knowledge.SOLID_principle.dependency_iversion;

public class DependencyInversion { // DIP = dependency inversion principle

    public static void main(String[] args) {

        // The Dependency Inversion principle states that our classes should depend upon interfaces or abstract classes instead of concrete classes and functions.

        // These two principles are indeed related and we have applied this pattern before while we were discussing the Open-Closed Principle
        // We want our classes to be open to extension, so we have reorganized our dependencies to depend on interfaces instead of concrete classes. Our PersistenceManager class depends on InvoicePersistence instead of the classes that implement that interface.

        // mungkin maksudnya prinsip ini llu harus sering sering make extends, implement atau ya class satu sama lain harus dimanfaatkan sebisa mungkin dengan saling merelasikannya

    }
}
