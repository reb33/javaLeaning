package certification.champter2;

/**
 * Created by konstantin on 01.06.2017.
 */
public class Sample11Loops {
    public static void main(String[] args) {
//        while (false){   //unreachable
//            System.out.println(1);
//        }
        for (int i=0; i<0;i++){
            System.out.println(1);
        }
//        for (;false;){  //unreachable
//            System.out.println(1);
//        }
//        for (int i=0; false;i++){  //unreachable
//            System.out.println(1);
//        }
//        while(1<1){  //unreachable
//
//        }
        int i = 1;
        while (i<1){} //ok
        final int i1 = 1;
//        while (i1<1){ //unreacheble
//
//        }
    }
}
