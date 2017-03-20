package exams;


import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * Created by konstantin on 01.03.2017.
 */
public class CCC {

    public void aaa(Integer[] mass){

        Integer[] mass1 = Arrays.copyOf(mass, mass.length);
        List<Integer> res = new ArrayList<>();
//        if (mass.length% 2==0){
//            mass1 = Arrays.copyOfRange(mass,0,Integer.valueOf(mass.length/2));


            Arrays.sort(mass1, 0, Integer.valueOf(mass.length / 2), Comparator.reverseOrder());
            Arrays.sort(mass1,mass.length-Integer.valueOf(mass.length/2),mass.length,Comparator.reverseOrder());

            for (int i=0;i<mass1.length;i++){
                res.add(mass[i]-mass1[i]);
            }
            System.out.println(res);
//        }else {
//            mass1 = Arrays.copyOfRange(mass,0,mass.length%2);
//            mass2 = new int[]{mass[mass.length%2+1]};
//            mass3 = Arrays.copyOfRange(mass,mass.length%2+2,mass.length);
//        }

    }

    public static void main(String[] args){
        new CCC().aaa(new Integer[]{1,2,3,4,5,6});
    }


}
