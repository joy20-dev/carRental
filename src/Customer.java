public class Customer {
    private String name;
    private int custId;
    private String email;
    private String phoneNumber;
    


    public Customer(String name, String email, String phoneNumber,int custId ) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
}