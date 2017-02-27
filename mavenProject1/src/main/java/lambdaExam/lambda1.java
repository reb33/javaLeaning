package lambdaExam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by konstantin on 27.02.2017.
 */
public class lambda1 {
    public static void main(String[] args){
        One one = new One(Arrays.asList(
                new Two(
                        Arrays.asList(
                                new Three(Arrays.asList("one","two","three")),
                                new Three(Arrays.asList("four","five","six")))),
                new Two(
                        Arrays.asList(
                                new Three(Arrays.asList("seven","eight","nine")),
                                new Three(Arrays.asList("ten","eleven","twelve"))
                        ))));

        List<String> strings =  one.twoList.stream().
                flatMap(two -> two.threeList.stream().
                        flatMap(three -> three.stringList.stream())).
                collect(Collectors.toList());

        System.out.println(strings);
    }
}
