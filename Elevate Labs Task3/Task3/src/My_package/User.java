package My_package;

import java.util.List;

public class User {

    private int u_id;
    private String name;
    private List<Book> barrowed;

    public User(int u_id, String name, List<Book> barrowed) {
        this.u_id = u_id;
        this.name = name;
        this.barrowed = barrowed;
    }

    public int getU_id() {
        return this.u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBarrowed() {
        return this.barrowed;
    }

    public void setBarrowed(List<Book> barrowed) {
        this.barrowed = barrowed;
    }
}
