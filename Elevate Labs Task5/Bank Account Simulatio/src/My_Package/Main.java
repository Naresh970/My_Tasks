package My_Package;

public class Main {

    public static void main(String[] args) {
        Account account=new Account();
        account.add_account("Naresh",1234);
        account.deposit(1234,100);
        account.withdraw(1234,50);

        account.add_account("Anji",98171985);
        account.deposit(98171985,5000);
        account.acc_Balance(98171985);

        // view accounts
        account.view();
    }
}
