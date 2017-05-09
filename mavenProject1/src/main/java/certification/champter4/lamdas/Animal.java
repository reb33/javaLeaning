package certification.champter4.lamdas;

import java.util.function.Predicate;

/**
 * Created by Konstantin on 29.04.2017.
 */

public class Animal {

    private boolean canSwim;
    private boolean canHop;
    private String name;
    private int age;

    public Animal(String name, boolean canSwim, boolean canHop, int age) {
        this.canSwim = canSwim;
        this.canHop = canHop;
        this.name = name;
        this.age = age;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void print2(TestingEmp t){
        System.out.println(t.test());
    }

    public boolean isCanHop() {
        return canHop;
    }

    public void print(Testing t){
        if (t.test(this)){
            System.out.println(name+" can");
        }else
            System.out.println(name+" can't");
    }
    public void print(int t){
        if (t > 10){
            System.out.println(name+" > 10");
        }else
            System.out.println(name+" <= 10");
    }

    public static void print(Animal a, Testing t ){
        if (t.test(a)){
            System.out.println(a.name+" can");
        }else
            System.out.println(a.name+" can't");
    }

    public void printAnimalYears1(CalculatingAnimalsYears c){
        System.out.println("Количество лет "+c.calcAnimalsYears(this));
    }
    public void printAnimalYears2(CalculatingAnimalsYears2 c){
        System.out.println("Количество лет (2) "+c.calculatingAnimalsYears(age));
    }

    public void printPred(Predicate<Animal> p){
        System.out.println("Predicate "+p.test(this));
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Cat", true, true, 10);
        print(cat, a -> a.isCanSwim());

        cat.print(a -> a.isCanSwim());

        cat.print2(() -> true);

        cat.printAnimalYears2(i -> i*3);

        cat.printAnimalYears1(a -> a.age*4);

        cat.printPred(animal -> animal.isCanHop());

        cat.printAnimalYears2(i -> {i=3; return i*3;});

        cat.printPred(new Predicate<Animal>() {
            @Override
            public boolean test(Animal animal) {
                return animal.isCanSwim();
            }
        });
    }
}
