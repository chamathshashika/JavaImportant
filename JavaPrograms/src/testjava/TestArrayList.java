package testjava;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<String> ar = new ArrayList<>();
        ar.add("Chamath");
        ar.add("Shashika");
        ar.add("Weerarathne");
        ar.add("Nuwan");
        ar.add("Pradeep");
        ar.add("Pradeep");

        System.out.println(ar.toString());

        Iterator i = ar.iterator();

        while (i.hasNext()) {
            
            System.out.println(i.next());

        }

    }

}
