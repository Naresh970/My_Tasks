package My_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Library {
    public User user;
    public Book book;

    // Library has list of books
    List<Book> books=new ArrayList<>();

    //Library has registered users
    List<User> reg_users=new ArrayList<>();

    // Adding Books into the Library
    void add_Books(int b_id,String title,int quantity){
        books.add((new Book(b_id,title,quantity)));
    }

    // view all books in the library
    void view_books(){
        for(Book b: books){
            System.out.println(b.getB_id()+ " " + b.getTitle() +" "+b.getQuantity());
        }
    }

    // view books available
    boolean available(String title_book){
        for(Book b:books){
            if((b.getTitle()).equals(title_book)){
                return true;
            }
        }
        return false;
    }

        // issuse the books to the user
    String issue_book(String title,String U_name,int u_id){
        // check is there book available in the library
        if(available(title)){
            // quantity of the book doesnt be empty
            for(Book b:books){
                if((b.getTitle()).equals(title) && b.getQuantity()!=0){

                    // we to have to issue the book
                    b.setQuantity(b.getQuantity()-1);

                    User user=new User(u_id,U_name,new ArrayList<>(Arrays.asList(new Book(b.getB_id(),title))));
                    // we have to register the user
                    reg_users.add(user);
                    return "book is issused......";
                }
            }
        }
        return "book is not_available.....";
    }

    // view registered users
    void view_users(){
        for(User u:reg_users){
            System.out.println("user id: "+u.getU_id()+" use name: "+u.getName()+" barrowed: "+u.getBarrowed().get(0).getTitle());
        }
    }

    // returning the barrowed books
    void return_book(int u_id, String u_name){
        User toRemove = null;
        for(User u : reg_users){
            if(u.getU_id() == u_id){
                int book_id = u.getBarrowed().get(0).getB_id(); // only first book handled
                toRemove = u;
                // increase book quantity back
                for(Book b: books){
                    if(b.getB_id() == book_id){
                        b.setQuantity(b.getQuantity()+1);
                    }
                }
                break;
            }
        }
        if(toRemove != null){
            reg_users.remove(toRemove);
            System.out.println("Book is successfully returned to the library");
        }
    }

}
