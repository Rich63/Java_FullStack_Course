package org.studyeasy;

import org.studyeasy.phone.Nokia;
import org.studyeasy.phone.Phone;
import org.studyeasy.phone.Samsung;

/**
 * S09L20
 */
public class S09L20 {
  public static void main(String[] args) {
    // Phone phone = new Phone("Nokia 3310");

    // System.out.println(phone.getModel());
    // phone.features();

    // SamsungNote4 note4 = new SamsungNote4("Note 4");
    // System.out.println(note4.getModel());
    // note4.features();

    // Phone nokia3310 = new Nokia("Nokia 3310");
    Phone nokia3310 = new S09L20().phone(1);
    System.out.println(nokia3310.getModel());
    nokia3310.features(); // Now the features() is not in Nokia3310, so the features() of the parent is available
    
    // Phone note4 = new Samsung("Note 4"); // Because Phone is the parent of SamsungNote4 we can use this notation!
    Phone note4 = new S09L20().phone(2);
    System.out.println(note4.getModel());
    note4.features();

  }
  
  public Phone phone(int dailyDriver) {
    switch(dailyDriver) {
    case 1: return new Nokia("3310");
    case 2: return new Samsung("Note 8");
    }
    return null;
  }
    
}