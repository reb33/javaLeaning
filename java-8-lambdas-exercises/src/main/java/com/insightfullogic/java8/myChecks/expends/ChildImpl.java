package com.insightfullogic.java8.myChecks.expends;

/**
 * Created by konstantin on 06.07.2017.
 */
public class ChildImpl extends AnotherClass implements Child {
    @Override
    public void message(String str) {

    }

    @Override
    public void welcome(){

    }

    public static void main(String[] args) {
        Child c = new ChildImpl();
        c.welcome();
    }
}
