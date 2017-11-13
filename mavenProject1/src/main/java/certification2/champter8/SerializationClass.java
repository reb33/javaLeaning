package certification2.champter8;

import java.io.Serializable;

public class SerializationClass implements Serializable {

    private static final long serialVersionUID = 2L;

    transient int x=1;
    transient String y="2";
    static char z;
    int w;
    static {
        System.out.println("SerializationClass static initiator");
        z='A';
    }

    {
        System.out.println("SerializationClass def initiator");
    }

    public SerializationClass(int x, String y, char z, int w) {
        System.out.println("Constructor 4 params");
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public SerializationClass() {
        System.out.println("Constructor 0 params");
    }

    @Override
    public String toString() {
        return "SerializationClass{" +
                "x=" + x +
                ", y='" + y + '\'' +
                ", z="+z+"" +
                ", w="+w+"}";
    }
}
