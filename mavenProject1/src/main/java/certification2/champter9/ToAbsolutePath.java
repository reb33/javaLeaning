package certification2.champter9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ToAbsolutePath {

    public static void main(String[] args) {
        Path path = Paths.get("C:/def/mev/gev");
        System.out.println(path.toAbsolutePath());
    }
}
