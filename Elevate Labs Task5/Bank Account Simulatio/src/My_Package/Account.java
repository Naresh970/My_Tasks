package My_Package;

import java.util.ArrayList;
import java.util.List;

public class Account {

    List<User> accounts=new ArrayList<>();

    // Adding accounts to Bank
    void add_account(String name,int acc_num){
        User user=new User(acc_num,name);
        user.setAcc_num(acc_num);
        user.setName(name);
        accounts.add(user);
    }

    // Checking account balance
    void acc_Balance(int acc_Num){
        for(User account:accounts){
            if(account.getAcc_num()==acc_Num){
                System.out.println("This is your balance : "+account.getAcc_balance());
                break;
            }
        }
    }

    // Adding amount to the bank
    void deposit(int acc_number,int amt){
        for(User account:accounts){
            if(account.getAcc_num()==acc_number){
                account.setAcc_balance(account.getAcc_balance()+amt);
                System.out.println("Amount is deposited...");
                break;
            }
        }
    }

    // Withdraw amt from the account
    void withdraw(int acc_number,int amt){
        for(User account:accounts){
            if(account.getAcc_num()==acc_number){
                if(account.getAcc_balance()-amt<0){
                    System.out.println("Insufficient balance to withdraw...");
                    break;
                }
                account.setAcc_balance(account.getAcc_balance()-amt);
                System.out.println("Balance Amount...");
                acc_Balance(acc_number);
                break;
            }
        }
    }

    public void view() {
        for(User user:accounts){
            System.out.println("User_Name : "+user.getName()+" User_Account_Num : "+ user.getAcc_num()+ " User_Balance : "+user.getAcc_balance());
        }
    }
}
