package src.Week3;
import java.util.*;

public class Insertion {
  public static void sort (List<Integer> list) {
    
      for (int i = 1; i < list.size(); i++) {
          Integer current = list.get(i);
          int j = i-1;
        
          while ((j > -1) && (list.get(j) > current)) {
              list.set(j+1, list.get(j));
              j--;
          }
        
          list.set(j+1, current);
      }
  }
}
