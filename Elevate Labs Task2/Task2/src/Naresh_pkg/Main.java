package Naresh_pkg;

import java.util.Scanner;


public class Main {

// For updation and deletion list shouldnt be empty
    public static void main(String[] args) {
        Service service=new Service();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("For Adding student values enter -> ADD");
            System.out.println("For Updating student values enter -> UPDATE");
            System.out.println("For Deleting student values enter -> DELETE");
            System.out.println("For looking all students data enter -> VIEW");
            System.out.println("For exit enter -> EXIT");
            String op=sc.next();
            if(op.equals("ADD") || op.equals("UPDATE")){
                System.out.println("Enter student id : ");
                int id = sc.nextInt();
                System.out.println("Enter student name : ");
                String name = sc.next();
                System.out.println("Enter student marks : ");
                int marks = sc.nextInt();
                // Adding student details
                if(op.equals("ADD")){
                    service.add(id, name, marks);
                    System.out.println("Added....");
                }
                // update student details
                else {
                    if(service.update(id, name, marks)){
                        System.out.println("updated....");
                    }
                    else{
                        System.out.println("Required Id doesnt exit..");
                    }
                }
            }
            //delete student details
            else if(op.equals("DELETE")){
                System.out.println("Enter id :");
                int curr_id = sc.nextInt();
                if(service.delete(curr_id)){
                    System.out.println("Deleted....");
                }
                else{
                    System.out.println("Required Id doesnt exit..");
                }
            }
            else if(op.equals("VIEW")){
                service.view();
            }
            else {
                System.out.println("Exited.....");
                break;
            }

        }
    }




}
