package certification2.champter3.collections;

import java.util.*;


/**
 * Created by konstantin on 08.09.2017.
 */
public class CheckComparator {
    static private int x;
    private static void m1(){}
    public static void main(String[] args) {
        List<C1> list = new ArrayList<>(Arrays.asList(
                new C1("AAA",1),
                new C1("ZZZ",31),
                new C1("FFF",61),
                new C1("BBB",10),
                new C1("BBB", 32)));

//        Comparator<C1> comparatorC1 = Comparator.comparing(c1 -> c1.getName());
//        comparatorC1.thenComparingInt(c1 -> c1.getId()).reversed();

        /*Нужно понять почему в цепи работает только ссылка на метод, с 2 лямбдами не работает*/
        Collections.sort(list, Comparator.comparing(C1::getName, Comparator.reverseOrder())
                .thenComparing(c2 -> c2.getId(), Comparator.reverseOrder()));

        Set<C1> set = new TreeSet<>(Comparator.comparing(C1::getName).reversed().thenComparing(C1::getId));
        set.addAll(list);

        System.out.println(list);
        System.out.println(set);
    }


    private static class C1{
        private String name;
        private int id;

        public String getName() {
            return name;
        }
        public int getId() {
            return id;
        }

        C1(String name, int id){
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "C1{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }

        private static void m2(){}
    }
}
