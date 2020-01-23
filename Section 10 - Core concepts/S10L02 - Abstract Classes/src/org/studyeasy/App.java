package org.studyeasy;

import org.studyeasy.person.NonVegan;
import org.studyeasy.person.Person;
import org.studyeasy.person.Vegan;

public class App {
    public static void main(String[] args) throws Exception {
        Person richard = new Vegan();
        richard.speak();
        richard.eat();
        System.out.println("**********************");
        Person debbie = new NonVegan();
        debbie.speak();
        debbie.eat();
    }
}