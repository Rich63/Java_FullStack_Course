/**
 * DecisionMakingWithOperator3
 */
public class DecisionMakingWithOperator3 {

  public static void main(String[] args) {
    boolean x = true;
    boolean y = false;

    if(x && y) {
      System.out.println("Condition if(x && y) is TRUE!");
    } else {
      System.out.println("Condition if(x && y) is FALSE!");
    }

    if(x || y) {
      System.out.println("Condition if(x || y) is TRUE!");
    } else {
      System.out.println("Condition if(x || y) is FALSE!");
    }

    int ageOfBoy = 20;
    int ageOfGirl = 18;

    if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) {
      System.out.println("They can marry!");
    } else {
      System.out.println("They cannot marry!");
    }
  }
}