package org.studyeasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class S12L09 {
    public static void main(String[] args) {

//        LinkedList<String> countries = new LinkedList<>();
//        List<String> countries = new LinkedList<>();    // this is a better handling then the line above
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Egypt");
        countries.add("Thailand");
        countries.add("Netherlands");
        countries.add("Russia");

        new S12L09().printList(countries);

//        ArrayList<String> demo = new ArrayList<>();
//        List<String> demo = new ArrayList<>();
        List<String> demo = new LinkedList<>();
        demo.add("One");
        demo.add("Two");
        demo.add("Three");
        demo.add("Four");
        demo.add("Five");

        // Using the same printList method as above, this is the advantage of using List interface in methods
        new S12L09().printList(demo);
    }

    void printList(List<String> list) {
        for(String element: list) {
            System.out.println("Country: "+element);
        }
        System.out.println("*************************");
    }
}