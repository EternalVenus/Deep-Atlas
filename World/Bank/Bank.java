public class Bank {
    private String bankAccount;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(){
        this("123123", 0.00, "Default Name", "Default email", "Default #");
    }
    public Bank(String bankAccount, double balance, String customerName, String email, String phoneNumber) {
        this.bankAccount = bankAccount;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFund(double amount){
        this.balance += amount;
        System.out.println("Current balance in the bank is " + this.balance);
    }

    public void withdrawFund(double amount){
        if(this.balance - amount < 0){
            System.out.println("Not Enough Fund in the bank to withdraw. Only $" + this.balance + " remaining");
        }else{
            this.balance -= amount;
            System.out.println("Current balance in the bank is " + this.balance);
        }
    }
}
