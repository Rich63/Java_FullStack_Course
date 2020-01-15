/**
 * LoopsRevisited
 */
public class LoopsRevisited {

  public static void main(String[] args) {

    for(int i=1,j=1;i<10 || j<10; i++,j++) {
      j++;
      System.out.println("i="+i+" j="+j);
    }

    for(int x=0;x<2;x++) {
      for(int y=0;y<2;y++) {
        for(int z=0;z<2;z++) {
          System.out.println("╔═╗");
          System.out.println("╚═╝");
        }
      }
      System.out.println();
    }
  }
}