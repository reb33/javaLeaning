package certification.champter6;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by konstantin on 15.05.2017.
 */
public class Sample2TryWithResourse {

    public static void main(String[] args) {
        try(FileInputStream f = new FileInputStream("")){
            BufferedInputStream buf = new BufferedInputStream(f);
        }catch (Exception e){}
    }
}
