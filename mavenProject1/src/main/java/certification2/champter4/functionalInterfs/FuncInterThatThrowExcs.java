package certification2.champter4.functionalInterfs;

public class FuncInterThatThrowExcs {

    void runInter(RunnerWithExc runnerWithExc){
//        runnerWithExc.run();
    }

    private interface RunnerWithExc{
        void run () throws Exception;
    }


    public static void main(String[] args) {
        FuncInterThatThrowExcs f = new FuncInterThatThrowExcs();
        f.runInter(()->{throw new Exception();});
    }
}
