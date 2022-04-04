package src.Week3;
import java.util.*;

public class Insertion {
  public static void sort (List<Integer> list) {
    
      for (int j = 1; j < list.size(); j++) {
          Integer current = list.get(j);
          int i = j-1;
        
          while ((i > -1) && (list.get(i) > current)) {
              list.set(i+1, list.get(i));
              i--;
          }
        
          list.set(i+1, current);
      }
  }
}
