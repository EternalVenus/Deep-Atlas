public class Main {
    public static void main(String[] args) {
        Bank MyAccount = new Bank("1231231212", 12312, "David","hello@gmail.com", "123-123-123");
        Bank HisAccount = new Bank();

        MyAccount.withdrawFund(12);
        MyAccount.depositFund(50);
        System.out.println(MyAccount.getBalance());
    }
}