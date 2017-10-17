package certification2.champter6;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by konstantin on 17.10.2017.
 */
public class ConvertingExcInMultiCatch {

    public static void main(final String[] args) throws IOException, SQLException {
        try {
            m3();
        }catch (Exception e){
//            e = new Exception();
            System.out.println(e);
            //throw e;
        }
    }


    static void m1() throws IOException, SQLException{
        throw new IOException();
    }

    //multi catch не переводит тип исключения, может только тип ссылки
    static void m2() throws IOException, SQLException{
        try {
            m1();
        }catch (IOException | SQLException e){
            System.out.println(e);
//            e = new Exception();
            throw e;
        }
    }

    //при указании типа в catch Exception java автоматически переводит тип в нужный
    //поэтому необязательно объявлять тип Exception в методе
    static void m3() throws IOException, SQLException{
        try{
            m2();
        }catch (Exception e){
            System.out.println(e);
            throw e;
        }
    }
}
