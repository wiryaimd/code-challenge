package com.wiryaimd.codechallenge.knowledge.SOLID_principle.single_responsibility;

public class SingleResponsibility {

    public static void main(String[] args) {
        // The Single Responsibility Principle states that a class should do one thing and therefore it should have only a single reason to change.
        // jadi satu class itu yaa hanya memiliki satu tugas

        Invoice invoice = new Invoice("ds-2ddxz", 23);
//        invoice.printInvoice(); // seharsunya tidak boleh, karen tidak sesuai prinsip SRP
//        invoice.saveToFile(); // same

        InvoicePrinter printer = new InvoicePrinter(invoice);
        printer.printInvoice();;

        InvoicePersistence persistence = new InvoicePersistence(invoice);
        persistence.saveToFile();

    }

}
