package certification2.champter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsSameF {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("./objects.data");
        Path p2 = Paths.get("./data/../././././objects.data");
        System.out.println(Files.isSameFile(p1,p2));
//        System.out.println(Files.exists(Paths.get("./objects.data")));
    }
}
