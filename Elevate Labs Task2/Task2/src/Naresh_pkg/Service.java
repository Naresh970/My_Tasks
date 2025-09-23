package Naresh_pkg;

import java.util.ArrayList;

public class Service {

    Student student=new Student();
    ArrayList<Student> list=new ArrayList<>();

    // Add
    public void add(int id, String name, int marks) {
        list.add(new Student(id,name,marks));
    }

    // Update
    public boolean update(int id, String name, int marks) {
        // I have to traverse all the students data to find id
        int idx=0;
        for(Student s:list){
            if(s.getId(id)==id){
                list.set(idx,new Student(id,name,marks));
                return true;
            }
            idx++;
        }
        return false;
    }

    // Delete
    public boolean delete(int id) {
        int idx=0;
        for(Student s:list){
            if(s.getId(id)==id){
                list.remove(idx);
                return true;
            }
            idx++;
        }
        return false;
    }

    // View
    public void view() {
       System.out.println(list);
    }
}
