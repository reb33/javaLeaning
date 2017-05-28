package certification.champter6;

/**
 * Created by konstantin on 16.05.2017.
 */
public class Sample4HiddingCathException {
    public static void main(String[] args) {
        String str = "";
        try {
            try{
                str+="begin ";
                throw new RuntimeException();
            }catch (RuntimeException e){
                str += "catch ";

                    throw new Exception();

            }finally {
                str+="finally ";
                throw new RuntimeException();
            }
        }catch (RuntimeException e2){
            str+="RuntimeException ";
        }catch (Exception e1){
            str+="Exception ";
        }
        System.out.println(str);
    }
}
