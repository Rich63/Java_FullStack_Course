package org.studyeasy;

public class S10L25 {
    public static void main(String[] args) {
        int x = 0, y = 5;
        try {
            x = (y=10*10)/0;    // the part (y=10*10) will execute because it's a complete assignment

        } catch(ArithmeticException e) {
            System.out.println("Inside ArithmeticException catch block");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException catch block");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Inside Exception catch block");
        }
        System.out.println("**************\nValue of y is "+y);
    }
}