/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author chamathw
 */
public class TestStack {
    
    public static void main(String[] args) {
        
        
        Stack<String> s = new Stack<>();
        s.add("Chamath");
        s.add("Shashika");
        s.add("Weerarathne");
        s.pop();
        System.out.println(s.toString());
        
        
        Iterator<String> i = s.iterator();
        
        while (i.hasNext()) {
            String next = i.next();
            System.out.println(next);
        }
        
        System.out.println("---------------------------------------------------");
        
        List<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(3);
        c.add(2);
        c.add(2);
        
        
        System.out.println(c.toString());

        
        System.out.println("---------------------------------------------------");
        
        
        Set<Integer> set  = new HashSet<>();
        
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(1);
        set.add(7);
         
        System.out.println(set.toString());
        
        
        Set<Integer> ts = new TreeSet<>();
        ts.add(9);
        ts.add(19);
        ts.add(2);
        ts.add(4);
        ts.add(5);
        ts.add(7);
        ts.add(5);
        ts.add(7);
        
        System.out.println(ts.toString());
        
        
        
    }
    
}
