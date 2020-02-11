package org.studyeasy;

    import java.io.*;

public class ReadObject {

  public static void main(String[] args) {

    try(FileInputStream fio = new FileInputStream("studyeasy\\vehicles.dat")) {
      try(ObjectInputStream obj = new ObjectInputStream(fio)) {
        Vehicle v1 = (Vehicle) obj.readObject();
        Vehicle v2 = (Vehicle) obj.readObject();
        Vehicle v3 = (Vehicle) obj.readObject();
        Vehicle v4 = (Vehicle) obj.readObject();
        System.out.println("Object 1: "+v1);
        System.out.println("Object 2: "+v2);
        System.out.println("Object 3: "+v3);
        System.out.println("Object 4: "+v4);
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
      System.out.println("FileNotFoundException");
    } catch (IOException e) {
      System.out.println("IOException");
    }
  }
}