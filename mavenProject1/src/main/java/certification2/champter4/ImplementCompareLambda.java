package certification2.champter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImplementCompareLambda {
    public static int diff(Person p1, Person p2){
        return p1.dob.compareTo(p2.dob);
    }
    public static int diff(Date d1, Date d2){
        return d1.compareTo(d2);
    }
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("Paul", "01012000"));
        al.add(new Person("Peter", "01011990"));
        al.add(new Person("Patrick", "01012002"));


        al.stream().sorted(ImplementCompareLambda::diff).forEach(s-> System.out.print(s+", "));
        System.out.println();
        System.out.println(al);
        Collections.sort(al, ImplementCompareLambda::diff);
        Collections.sort(al, new MySorter()::compare);
    }

}

class Person{
    String name;
    String dob;
    public Person(String name, String dob){
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", name, dob);
    }
}
class MySorter {
    public int compare(Person p1, Person p2){
        return p1.dob.compareTo(p2.dob);
    }
}