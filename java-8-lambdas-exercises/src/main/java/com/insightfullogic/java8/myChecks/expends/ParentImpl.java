package com.insightfullogic.java8.myChecks.expends;

/**
 * Created by konstantin on 05.07.2017.
 */
public class ParentImpl implements Parent {
    static int i=5;
    @Override
    public void message(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        ParentImpl p = new ParentImpl();
//        p.checkVars();
        p.welcome();
    }
}
