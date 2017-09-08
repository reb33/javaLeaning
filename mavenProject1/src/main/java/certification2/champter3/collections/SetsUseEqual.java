package certification2.champter3.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by konstantin on 06.09.2017.
 */

/*HashSet использует equals для установление равенства, с помощью hashCode этот процесс облегчается*/
public class SetsUseEqual {

    public static void main(String[] args) {
        Set<Tip> tips = new HashSet<>();
        tips.add(new Tip(12, "Nan"));
        tips.add(new Tip(12, "Axe"));
        tips.add(new Tip(12, "Axe"));

        System.out.println(tips.size());
        System.out.println(tips);

    }
}


class Tip{
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tip tip = (Tip) o;

        if (age != tip.age) return false;
        return name != null ? name.equals(tip.name) : tip.name == null;
    }

    @Override
    public int hashCode() {
        return age;
    }

    Tip(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tip{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hashCode = "+this.hashCode()+"}";
    }
}
