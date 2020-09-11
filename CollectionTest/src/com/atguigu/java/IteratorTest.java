package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void test() {
        ArrayList arrayList = new ArrayList();

        arrayList.add("AA");
        arrayList.add("BB");
        arrayList.add("CC");
        arrayList.add("123");
        arrayList.add(new Date());

        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
