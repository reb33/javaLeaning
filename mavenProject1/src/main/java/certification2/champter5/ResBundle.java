package certification2.champter5;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResBundle {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("fr","CA"));
        ResourceBundle rs = ResourceBundle.getBundle("a1",new Locale("jp","JP"));
        System.out.println(rs.getString("b"));

//        Enumeration<String> en = rs.getKeys();
//        while (en.hasMoreElements()) {
//            String str = en.nextElement();
//            System.out.println(str+" - "+rs.getString(str));
//        }
    }
}
