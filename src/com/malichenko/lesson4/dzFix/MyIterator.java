package com.malichenko.lesson4.dzFix;

import java.util.Iterator;

public interface MyIterator<T> extends Iterator {
    void reset();
    boolean atEnd();
    boolean atBegin();
    T deleteCurrent();
    void insertAfter(T c);
    void insertBefore(T c);
    T getCurrent();
}