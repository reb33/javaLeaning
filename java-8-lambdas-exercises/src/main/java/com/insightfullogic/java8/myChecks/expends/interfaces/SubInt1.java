package com.insightfullogic.java8.myChecks.expends.interfaces;

/**
 * Created by konstantin on 11.07.2017.
 */
public interface SubInt1 extends ParentInt1,ParentInt2 {
    @Override
    default String m1() {
        return null;
    }
}
