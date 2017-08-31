package streams;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by konstantin on 29.08.2017.
 */
public class Anagram {

    static boolean isAnagram(String str1, String str2){

        Map<String, Integer> firstWord = str1.chars()
                .boxed()
                .filter(i -> !Character.isSpaceChar(i))
                .collect(Collectors.toMap(i -> String.valueOf((char)i.intValue()).toLowerCase(), i -> 1, (r, r2) -> r+1));
        Map<String, Integer> secondWord = str2.chars()
                .boxed()
                .filter(i -> !Character.isSpaceChar(i))
                .collect(Collectors.toMap(i -> String.valueOf((char)i.intValue()).toLowerCase(), i -> 1, (r, r2) -> r+1));

        return firstWord.equals(secondWord);

    }

    public static void main(String[] args) {
        String str1="яуза река";
        String str2="Я Зура кае";
        String str3="Я Зура каес";
        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram(str1, str3));
    }
}
