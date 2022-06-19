package com.wiryaimd.codechallenge.knowledge.SOLID_principle.single_responsibility;

// dengan membuat class baru untuk tugas tertentu maka itu akan membuat kita menggunakan SRP / single resp principle
public class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){
        System.out.println("anjaeee: " + invoice.getId());
    }
}
