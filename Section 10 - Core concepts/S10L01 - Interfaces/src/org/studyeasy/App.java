package org.studyeasy;

import org.studyeasy.phone.Iphone8;
import org.studyeasy.phone.OnePlus5;
import org.studyeasy.phone.Phone;

public class App {
    public static void main(String[] args) throws Exception {
        // OnePlus5 phone = new OnePlus5();
        // int processor = phone.processor();
        // System.out.println("Processor : "+processor);

        Phone onePlus5 = new OnePlus5();  // Polymorphism, object of Phone interface but on a class that implements Phone
        Phone iPhone8 = new Iphone8();

        System.out.println(onePlus5);
        System.out.println(iPhone8);
    }
}