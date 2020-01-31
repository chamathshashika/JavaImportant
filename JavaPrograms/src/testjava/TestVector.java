/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author chamathw
 */
public class TestVector {
    
    public static void main(String[] args) {
        
        Vector<String> v = new Vector<>();
        v.add("Chamath");
        v.add("Shashika");
        v.add("Weerarathne");
        
        Iterator<String> i = v.iterator();
        
        while (i.hasNext()) {
            String next = i.next();
            System.out.println(next);
        }
        
    }
    
}
