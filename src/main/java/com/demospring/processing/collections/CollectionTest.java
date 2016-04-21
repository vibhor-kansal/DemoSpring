package com.demospring.processing.collections;

import com.google.common.collect.ImmutableSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionTest {

    public static void main(String[] args) {

        //Creating a arraylist
        List<String> list = new ArrayList();
        list.add("Vibhor");
        list.add("Vibhor");
        list.add("null");
        list.add("null");
        list.add("");
        list.add("");
        list.add(null);
        list.add(null);
        list.add("Kansal");list.add("Kansal");list.add("Kansal");list.add("Kansal");list.add("Kansal");
        System.out.println(list);

        //Different ways of removing all null values from arraylist
        System.out.println(list.removeAll(Collections.singleton(null)));
        System.out.println(list.removeAll(Arrays.asList(null, "", "null")));
        System.out.println(list);

        //Different ways of removing duplicate values from arraylist
        Set<String> set = new HashSet();
        set.addAll(list);
        System.out.println(set);
        list.clear();
        list.addAll(set);
        System.out.println(list);

        List list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(ImmutableSet.copyOf(list));

        //Treeset example
        Set<String> al=new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.add("Vijay");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //HashMap example
        Map<Integer, String> map = new HashMap();
        map.put(null, "null");
        map.put(2, "Vibhor");
        map.put(3, "Vibhor");
        map.put(null, "bru");
        Map<Integer, String> map1 = Collections.synchronizedMap(map);
        for(Map.Entry m:map1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
