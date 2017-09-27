package certification2.champter4.optionals;

import java.io.IOException;
import java.util.Optional;

/**
 * Created by konstantin on 15.09.2017.
 */
public class OrGetThrows {

    public static void main(String[] args) {
        Optional<Integer> o = Optional.empty();
        try {
            o.orElseThrow(IOException::new);
        } catch (IOException e) {
            e.printStackTrace();
        }
        o.orElseThrow(NullPointerException::new);
    }
}
