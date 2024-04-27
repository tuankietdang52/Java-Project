package DTO;

import Interface.IList;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Receipt implements IList<ReceiptDetail> {
    private String receiptCode;
    private String employeeCode;
    private String supplierCode;
    private LocalDateTime dateCreated;
    private double total;

    private ArrayList<ReceiptDetail> receiptDetails;

    public Receipt(){
        receiptDetails = new ArrayList<>();
    }

    public Receipt(String receiptCode, String employeeCode, String supplierCode){
        this.receiptCode = receiptCode;
        this.employeeCode = employeeCode;
        this.supplierCode = supplierCode;

        receiptDetails = new ArrayList<>();
    }

    public void setReceiptCode(String receiptCode) {
        this.receiptCode = receiptCode;
    }

    public String getReceiptCode() {
        return receiptCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setReceiptDetails(ArrayList<ReceiptDetail> receiptDetails) {
        this.receiptDetails = receiptDetails;
    }

    public ArrayList<ReceiptDetail> getReceiptDetails() {
        return receiptDetails;
    }

    public void add(ReceiptDetail detail){
        this.receiptDetails.add(detail);
        calculateTotal();
    }

    public void remove(ReceiptDetail detail){
        this.receiptDetails.remove(detail);
        calculateTotal();
    }

    public void calculateTotal(){
        this.total = 0;
        for (var detail : this.receiptDetails){
            this.total += detail.getTotal();
        }
    }
}
