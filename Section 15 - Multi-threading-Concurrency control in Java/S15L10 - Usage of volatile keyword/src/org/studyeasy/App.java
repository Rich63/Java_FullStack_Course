package org.studyeasy;

public class App {
  volatile public static int flag = 0;  // volatile makes sure that the variable is not cached!

  public static void main(String[] args) {

    new Thread(new Runnable() {
      @Override
      public void run() {
        while(true){
          if(flag == 0) {
            System.out.println("Running, flag value is still 0.");
          } else {
            break;
          }
        }
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        flag=1;
        System.out.println("Flag value has updated to 1!");
      }
    }).start();
  }
}