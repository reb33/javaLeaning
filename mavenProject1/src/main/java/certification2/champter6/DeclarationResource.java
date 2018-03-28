package certification2.champter6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeclarationResource {

    public static void main(String[] args) throws SQLException {
        Statement stmt;
        Connection conn = DriverManager.getConnection("");

        //Декларация ресурсов должна быть в try
//        try(stmt = conn.createStatement()){
//
//        }
    }
}
