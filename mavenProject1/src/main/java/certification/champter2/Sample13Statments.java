package certification.champter2;

/**
 * Created by Konstantin on 26.06.2017.
 */
public class Sample13Statments {
    public static void main(String[] args) {
        switch (3){
//            System.out.println(3);
        }
        for(;;)break;

        if(true);
        else ;
        while(true)break;
        do {
            break;
        }while(true);
        int i=1;
    }
    void m1(boolean b){
        if(b){}
        System.out.println(b);
        while (b){}
        System.out.println(b);
        for(;b;){}
        System.out.println(b);
    }
}
