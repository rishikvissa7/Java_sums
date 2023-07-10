package WTN_DATABASE;

import java.sql.*;

public class database {
    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:8081:xe","system","rishikabhi7");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from wtnstudent");
            while(rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
            }
            con.close();
        }

        catch (ClassNotFoundException e) {
            System.out.println("Error");
        }


    }
}
