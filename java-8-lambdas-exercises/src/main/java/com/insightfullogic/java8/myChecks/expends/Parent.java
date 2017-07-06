package com.insightfullogic.java8.myChecks.expends;

/**
 * Created by konstantin on 05.07.2017.
 */
public abstract interface Parent {
    int i=0;
    void message(String str);
    default void welcome(){
        message("method from Parent");
    }
    default void checkVars(){
        System.out.println(i);
        System.out.println(this.i);
    }
}
