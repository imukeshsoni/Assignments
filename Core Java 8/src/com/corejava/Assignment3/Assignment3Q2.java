package com.corejava.Assignment3;
import java.util.*;
public class Assignment3Q2 {
    public static void main(String[] args) {


    }
    public static LinkedHashSet ordered(LinkedHashSet linkedHashSet){
        LinkedHashSet<String> lh=new LinkedHashSet();
        lh.add("A");
        lh.add("B");
        lh.add("E");
        lh.add("F");
        lh.add("C");
        lh.add("D");
        Iterator<String> i=lh.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next()); //This will print elements in maintained order
        }

        return linkedHashSet;
    }
    public static HashSet unordered(HashSet hashSet){
        HashSet<String> lh=new HashSet();
        lh.add("A");
        lh.add("B");
        lh.add("E");
        lh.add("F");
        lh.add("C");
        lh.add("D");
        Iterator<String> i=lh.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next()); //This will print elements in unmaintained order
        }
        return hashSet;
    }
}