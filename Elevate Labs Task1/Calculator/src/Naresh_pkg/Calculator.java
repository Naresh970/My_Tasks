package Naresh_pkg;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while(true){
            // we have to take input through the user
            System.out.println("enter + for Addition");
            System.out.println("enter - for Subtraction");
            System.out.println("enter * for Multiplication");
            System.out.println("enter / for Division");
            System.out.println("enter $ to exit");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter symbol : ");
            String symbol=sc.next();
            symbol=symbol.trim();
            if(symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")){
                System.out.println("Enter Value1 : ");
                int val1=sc.nextInt();
                System.out.println("Enter Value2 : ");
                int val2=sc.nextInt();
                // switch case is better to check multiple
                switch (symbol){
                    case "+": System.out.println(val1+val2);
                              break;
                    case "-": System.out.println(val1-val2);
                              break;
                    case "*": System.out.println(val1*val2);
                              break;
                    case "/": try {
                               System.out.println(val1/val2);
                              }
                              catch (Exception e){
                               System.out.println(e.getMessage() + "cant divide with zero");
                              }
                              break;
                    default:System.out.println("try Again....");
                }
            }
            else if(symbol.equals("$")){
                break;
            }
            else{
                System.out.println("Enter valid symbol.....");
            }
        }
    }
}
