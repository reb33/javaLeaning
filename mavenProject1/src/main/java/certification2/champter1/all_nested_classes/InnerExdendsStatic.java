package certification2.champter1.all_nested_classes;

public class InnerExdendsStatic {

    class A{}

    //static не может быть наследован от не static
//    static class B extends A{}

    static class C{}

    //не static может быть наследован от статик
    class D extends C{}
}
