package com.wiryaimd.codechallenge.knowledge.SOLID_principle.single_responsibility;

// tugas class ini sebagai struktur data model
// SRP: tidak boleh ada lebih dari satu tugas dalam class
public class Invoice {

//    private Book book;
    private String id;
    private int quantity;
    private double total;

    public Invoice(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.total = calculateTotal();
    }

    // fungsi savetoFile dan printInvoice harusnya tidak berada disini, tidak sesuai prinsip single responsibl
    // kalau fungsi calculateTotal... maybe can be here cuzz he just calculate total??
    public double calculateTotal(){
        return -1;
    }

    // karena merupakan fungsi yg berbeda tugasnya
    // disini terdepat pelanggaran terhadap prinsip single responsibility,
    // yaitu terdapat dua tugas di class ini yaitu sebagai struktur data model dan sebagai fungsi print data?
    public void printInvoice(){
        System.out.println("anjaeee");
    }

    // fungsi ini juga tidak boleh disini, karena ini persistance logic
    public void saveToFile(){
        //....//
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }
}
