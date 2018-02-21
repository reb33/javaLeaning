package certification2.champter5;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleIteration {

    public static void main(String[] args) {
        Locale myloc = new Locale.Builder().setLanguage("en").setRegion("UK").build();
        ResourceBundle msgs = ResourceBundle.getBundle("mymsgs", myloc);
        Enumeration<String> en = msgs.getKeys();
        while(en.hasMoreElements()){
            String key = en.nextElement();
            String val = msgs.getString(key);
            System.out.println(key+" : "+val);
        }
    }
}
