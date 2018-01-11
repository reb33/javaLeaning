package certification2.champter10;

import java.sql.*;

public class ExampleForCheckTry {


    void m1(){
        try(
                Connection conn = DriverManager.getConnection("");
                ) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //после try фигурные скобки обязательны
//    void m2() throws SQLException{
//
//        try(Connection conn = DriverManager.getConnection("");
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(""));
//
//
//    }
}
