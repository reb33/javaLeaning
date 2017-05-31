package certification.champter4;

/**
 * Created by konstantin on 03.05.2017.
 */
public class Sample5Final {

    final int var1;
    static final int var2;
//    final boolean bool1;  //final должен быть инициирован
    boolean bool2;
    static {
        var2=1;
    }

    public Sample5Final(int var1) {
        this.var1 = var1;
    }

    Sample5Final(){
        this(1);
    } //если добавляется конструктор, то в каждом нужно инициализировать final переменные или ссылку на тот в котором есть

    Sample5Final(String s){
        this();
    }

    public static void main(String[] args) {
        Sample5Final s = new Sample5Final(1);
        System.out.println(s.var1);
        System.out.println(s.bool2);

        final int x2;
        x2=5;
        final int x3;
    }
}
