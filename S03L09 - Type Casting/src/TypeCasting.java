
public class TypeCasting {

  public static void main(String[] args) {
    // below code will work where a short can be cast to int
    // short x = 5;
    // int y = x;
    // System.out.println(y);

    // below code will NOT work where a int cannot be cast to short
    // int y = 10;
    // short x = y;
    // System.out.println(x);

    // below code will work, the int is cast to short by (short)y
    int y = 10;
    short x = (short)y;
    System.out.println(x);

    float v1 = 10.0123456f;
    double v2 = 20.0123456789d;
    double v3 = v1;
    float v4 = (float)v2;
    System.out.println(v3 + " " + v4);

    // output wil be 10.012345314025879 20.012346 so this is not what is in the code

    // String str = "10";
    // int i = (int)str; // Strings cannot be cast to number
  }

}
