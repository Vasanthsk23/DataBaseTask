import java.io.*;
import java.sql.*;

public class DataBaseManagement {
    public static void main(String[] args) throws Exception
    {
        String url
                = "jdbc:mysql://localhost:3306/question2"; // table details
        String username = "root"; // MySQL credentials
        String password = "Vasanthsk231708@";
        String query
                = "INSERT into Empl(empcode,empname,empage,esalary) values "; // query to be run
        query = query + "(101,'Jenny',25,10000),";
        query = query + "(102,'Jacky',30,20000),";
        query = query + "(103,'Joe',20,40000),";
        query = query + "(104,'John',40,80000),";
        query = query + "(105,'Shameer',25,90000);";
        Class.forName(
                "com.mysql.cj.jdbc.Driver"); // Driver name
        Connection con = DriverManager.getConnection(
                url, username, password);
        System.out.println(
                "Connection Established successfully");
        Statement st = con.createStatement();
        int result = st.executeUpdate(query);
        System.out.println(result + " Rows Inserted Successfully ");
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");
    }
}

