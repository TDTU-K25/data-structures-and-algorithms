import java.util.*;

public class Receipt {
    private int receiptId;
    private ArrayList<String> products;
    private String customerId;
    
    public Receipt(int receiptId, ArrayList<String> products, String customerId) {
        this.receiptId = receiptId;
        this.products = products;
        this.customerId = customerId;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Receipt [customerId=" + customerId + ", products=" + products.toString() + ", receiptId=" + receiptId + "]";
    }
}
