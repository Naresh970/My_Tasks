package My_Package;

public class User {

    private int acc_num;
    private String name;
    private int acc_balance;


    public User(int acc_num, String name, int acc_balance) {
        this.acc_num = acc_num;
        this.name = name;
        this.acc_balance = acc_balance;
    }

    public User(int acc_num, String name) {
        this.acc_num = acc_num;
        this.name = name;
        this.acc_balance=0;
    }

    public int getAcc_balance() {
        return this.acc_balance;
    }

    public void setAcc_balance(int acc_balance) {
        this.acc_balance = acc_balance;
    }


    public int getAcc_num() {
        return this.acc_num;
    }

    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
