/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author chamathw
 */
public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<>();
        l.add("chamath");
        l.add("Shashika");
        l.add("Weerarathne");
        l.add("Weerarathne");

        System.out.println(l.toString());

        Iterator<String> i = l.iterator();

        while (i.hasNext()) {
            String next = i.next();
            System.out.println(next);
        }
        
        System.out.println("-----------------------------------");
        
        for(int j = 0; j < l.size(); j++){
        
            System.out.println(l.get(j));
        
        }
        
        
        
        System.out.println("-----------------------------------");
        
        
        for (String s : l) {
            System.out.println(s);
        }
        
        
         System.out.println("-----------------------------------");
        
        for (Iterator iterator = l.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            
            System.out.println(next);
            
        }

    }

}
