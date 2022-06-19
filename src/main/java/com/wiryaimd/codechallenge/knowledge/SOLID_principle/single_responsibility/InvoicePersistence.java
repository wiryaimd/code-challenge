package com.wiryaimd.codechallenge.knowledge.SOLID_principle.single_responsibility;

// agar memenuhi prinsip SRP
public class InvoicePersistence {

    private Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(){
        // ... //
    }
}
