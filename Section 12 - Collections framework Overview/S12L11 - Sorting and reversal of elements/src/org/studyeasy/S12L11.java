package org.studyeasy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class S12L11 {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Egypt");
        countries.add("Thailand");
        countries.add("Netherlands");
        countries.add("Russia");

        new S12L11().printList(countries);

        countries.sort(null);   // Will give natural ordering
        new S12L11().printList(countries);
        Collections.reverse(countries);     // will print the list in reverse order
        new S12L11().printList(countries);
    }

    void printList(List<String> list) {

        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) {
            System.out.println("Element: "+iterator.next());
        }
        System.out.println("*************************");
    }
}