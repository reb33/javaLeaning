package certification2.champter1.overridingObject;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by konstantin on 03.08.2017.
 */
public class ToString1 {
    int i1;
    String s1;
    double d1;

    public ToString1(int i1, String s1, double d1) {
        this.i1 = i1;
        this.s1 = s1;
        this.d1 = d1;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public static void main(String[] args) {
        System.out.println(new ToString1(1,"Ice", 2.4));
    }
}
