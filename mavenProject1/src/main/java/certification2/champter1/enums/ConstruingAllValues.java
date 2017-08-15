package certification2.champter1.enums;

/**
 * Created by konstantin on 15.08.2017.
 */

/* При вызове любого значения енума запускаются конструкторы всех значений*/
/* Статик инициатор вызывается в последнюю очередь т.к. перечисления так же static final*/
public class ConstruingAllValues {
    public static void main(String[] args) {
        System.out.println("1111");
        System.out.println(E2.class.getSimpleName());
        System.out.println(E2.B);
    }
}

enum E2{
    A{
        //Инициатор внутри значения вызывается после общего конструктора (E2)
        {
            System.out.println("inner initiator "+this.name()+" "+this.b);
            System.out.println();
        }
        String b;
    },B,C;
    String opt;
    static {
        System.out.println("static initiator");
    }
    {
        System.out.println("Initiator "+this.name());
    }
    E2(){
        System.out.println("It's value "+this.name());
        opt="a";
    }
}