package org.studyeasy;

import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws SQLException {
        String url="jdbc:postgresql://localhost:5432/Telusko";
        String uname="postgres";
        String password="naresh123";
        //  creating connection
        Connection con=DriverManager.getConnection(url,uname,password);
        System.out.println("connection established");
        // creating a statement
        Statement st=con.createStatement();

        // CRUD OPERATIONS USING DATABASE

        // view query
        String query="select * from student";
        ResultSet rs=st.executeQuery(query);
//        rs.next();
//        String name=rs.getString("sname");
        while(rs.next()){
            System.out.print(rs.getInt(1)+" : ");
            System.out.print(rs.getString(2)+" : ");
            System.out.println(rs.getInt(3));
        }

       //insert query
        String insert_query="insert into student (rollno,name,marks) values (?,?,?)";
        PreparedStatement ps=con.prepareStatement(insert_query);

        ps.setInt(1,579);
        ps.setString(2,"Ravi");
        ps.setInt(3,79);

        int rows=ps.executeUpdate();
        System.out.println("No of rows affected : "+rows);



        // update query
        String update_query="update student set marks = ? WHERE rollno = ?";
        PreparedStatement ps1=con.prepareStatement(update_query);

        ps1.setInt(1,79);
        ps1.setInt(2,577);

        ps.executeUpdate();


        //Delete query
        String delete_query="delete from student where rollno=?";
        PreparedStatement ps2=con.prepareStatement(delete_query);

        ps2.setInt(1,579);

        ps2.executeUpdate();



        ps.close();
        con.close();
        System.out.println("connection closed");

    }
}
