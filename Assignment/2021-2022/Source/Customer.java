public class Customer {
    private String customerId;
    private String customerFullName;
    private String gender;

    public Customer(){
        this.customerId = "";
        this.customerFullName = "";
        this.gender = "";
    }

    public Customer(String customerId, String customerFullName, String gender) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.gender = gender;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer [customerFullName=" + customerFullName + ", customerId=" + customerId + ", gender=" + gender
                + "]";
    }    
}
