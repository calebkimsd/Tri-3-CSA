package src.Week3; 
import java.util.*; 

public class Bubble {

  public static void sort(List<Integer> list) {

    Int temp;
    boolean sorta = false; 

    while (!sorta) {

      sorta = true;
      for (int i = 0; i <list.size()-1; i++) {
        if (list.get(i).compareTo(list.get(i + 1))> 0 ) {
          list.set(i, list.get(i + 1)); 
          list.set(i + 1, temp); 
          temp = list.get(i);

          sorted  = false; 
        }
      }
    }
  }
}