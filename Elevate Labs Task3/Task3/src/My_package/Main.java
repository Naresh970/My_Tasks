package My_package;

public class Main {
    public static void main(String[] args) {
        // add books to the library
        Library lib=new Library();
        lib.add_Books(5,"The One Thing",10);
        lib.add_Books(4,"Atomic Habits",5);

        // view books
        lib.view_books();

        //issue books
        String res=lib.issue_book("The One Thing","Naresh",563);
             System.out.println(res);

             lib.view_users();

        // return book
        lib.return_book(563,"Naresh");
    }
}
