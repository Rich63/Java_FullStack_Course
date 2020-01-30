package org.studyeasy;

import org.studyeasy.person.Person;
import org.studyeasy.person.Vegan;

public class S10L03 {
    public static void main(String[] args) throws Exception {
        Person richard = new Vegan();
        richard.speak();
        richard.eat();
        richard.breathe();
        richard.message();

    }
}