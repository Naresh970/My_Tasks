package My_package;

public class Book {

    private int b_id;
    private String title;
    private int quantity;


    public Book(int b_id, String title, int quantity) {
        this.b_id = b_id;
        this.title = title;
        this.quantity = quantity;
    }

    public Book(int bId, String title) {
        this.b_id=bId;
        this.title=title;
    }

    public int getB_id() {
        return this.b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
