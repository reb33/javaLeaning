package com.insightfullogic.java8.myChecks.expends;

/**
 * Created by konstantin on 05.07.2017.
 */
public interface Child extends Parent {
    @Override
    default void welcome(){
        this.message("method from Child");
    }
//    void m1();
}
