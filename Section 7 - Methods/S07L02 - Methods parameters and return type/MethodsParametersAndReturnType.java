/**
 * MethodsParametersAndReturnType
 */
public class MethodsParametersAndReturnType {

  public static void main(String[] args) {
    System.out.println("Area of rectangle with length of 5.4 and width of 3.2 = "+areaRectangle(15.4, 3.2));
    
  }

  // this method has no returnvalue because it is a void method
  // public static void areaRectangle(double length, double width) {
  //   System.out.println(length * width);
  // }

  // this method has a double as returnvalue because it is a double method and now we have to return a double
  public static double areaRectangle(double length, double width) {
    return length * width;
  }
}