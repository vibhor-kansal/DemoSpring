package com.demospring.processing.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashingCollections {

    public static void main(String[] args) {

        //Hashtable example
        //Result : Hashtable doesn't allow null key and value
        //Only unique non-null keys are allowed
        //Maintains reverse insertion order
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "A");
        hashtable.put(2, "B");
        hashtable.put(3, "C");
        //hashtable.put(2, null);
        //hashtable.put(null, "null");
        System.out.println(hashtable);

        //HashMap example
        //Result : HashMap allows one null key and multiple null values
        //Maintains insertion order
        Map<Integer, String> hashMap = new HashMap();
        hashMap.put(null, "null");
        hashMap.put(2, "Vibhor");
        hashMap.put(3, null);
        hashMap.put(null, null);
        System.out.println(hashMap);

        //TreeMap example
        //Result : TreeMap doesn't allow null keys but allows multiple null values
        //Maintains ascending (natural) order
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "null");
        treeMap.put(2, "Vibhor");
        treeMap.put(3, null);
        treeMap.put(1, null);
        System.out.println(treeMap);
    }
}
