package certification2.champter4.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 * Created by konstantin on 26.09.2017.
 */
public class PrimitivesOptional {

    void m1(){
        OptionalDouble optionalDouble = OptionalDouble.of(1);
        OptionalInt optionalInt= OptionalInt.of(1);
        OptionalLong optionalLong = OptionalLong.of(1);
        optionalDouble.getAsDouble();
    }
}
