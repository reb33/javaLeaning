package certification.champter2;

/**
 * Created by konstantin on 14.06.2017.
 */
public class Samples12Lables {
    public static void main(String args[]){
        int i = 0;
        loop :         // 1
        {
            System.out.println("Loop Lable line");
            try{
                for (  ;  true ;  i++ ){
                    if( i >5) break loop;       // 2
                }
            }
            catch(Exception e){
                System.out.println("Exception in loop.");
            }
            finally{
                System.out.println("In Finally");      // 3
            }
        }
    }

    void m1(){
        label:if(true);
        int i=1;
        label:i=2;
        label1:i++;
        int x=2;
        label:
        try {
            break label;
        }finally {
        }

        label:{
            System.out.println(1);
            break label;
//            System.out.println(2); unreachablre
        }
        metka:{
            break metka;
        }
        label: m2();
        label:
        System.out.println(2);

        if1: if(true){
            break if1;
        }lab:System.out.println();


    }
    void m2(){}
}
