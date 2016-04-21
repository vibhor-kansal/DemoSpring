package com.demospring.processing.collections;


import com.demospring.processing.dto.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class TestSort {
    public static void main(String args[]){

        ArrayList al=new ArrayList();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));
        System.out.println(al);
        Collections.sort(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            //System.out.println(st.rollno+""+st.name+""+st.age);
        }
    }
}  