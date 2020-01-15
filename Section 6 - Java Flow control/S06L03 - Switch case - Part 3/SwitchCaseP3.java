/**
 * SwitchCaseP3
 */
public class SwitchCaseP3 {
  public static void main(String[] args) {
    String name = "AUTHOR";

    switch(name.toLowerCase()) {
      case "author": 
        System.out.println("Richard");
        break;
      case "team":
        System.out.println("Team StudyEasy");
        break;
      case "editor":
        System.out.println("Shabaz & Salim");
        break;
      default:
        System.out.println("Invalid entry");
        break;
    }

  }

}