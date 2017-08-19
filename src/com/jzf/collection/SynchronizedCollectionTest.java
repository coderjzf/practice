package com.jzf.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class SynchronizedCollectionTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Vector<Integer> vector = new Vector<Integer>();
        long start = System.currentTimeMillis();
        for(int i=0;i<100000;i++)
            list.add(i);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList����100000�β��������ʱ��"+(end-start)+"ms");
        start = System.currentTimeMillis();
        for(int i=0;i<100000;i++)
            vector.add(i);
        end = System.currentTimeMillis();
        System.out.println("Vector����100000�β��������ʱ��"+(end-start)+"ms");
        
    }
}
