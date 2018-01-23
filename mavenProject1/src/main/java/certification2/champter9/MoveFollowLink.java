package certification2.champter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MoveFollowLink {

    public static void main(String[] args) throws IOException {
        System.out.println(Files.isSymbolicLink(Paths.get("C:\\Temp\\1\\link")));
        Files.move(Paths.get("C:\\Temp\\1\\link"), Paths.get("C:\\Temp\\2\\123.txt"));
    }
}
