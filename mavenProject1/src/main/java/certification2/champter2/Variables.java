package certification2.champter2;

public class Variables {
    private int level=1;
    class Deep {
        private int level = 2;
        class Deeper {
            private int level = 5;
            public void printReality() {
                System.out.print(level);
                System.out.print(" "+Variables.Deep.this.level);
                System.out.print(" "+Deep.this.level);
                System.out.print(" "+Variables.this.level);
            }
        }
    }
    public static void main(String[] bots) {
        Variables.Deep.Deeper simulation = new Variables().new Deep().new Deeper();
        simulation.printReality();
    }
}
