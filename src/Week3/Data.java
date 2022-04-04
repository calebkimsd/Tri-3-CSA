package src.Week3;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

public class Data {

  private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

public Data(int size, String method) {
        Instant start = Instant.now(); 

        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }

  if (method.equals("selection"))  {
    Selection.sort(data);
    System.out.println(); 
  }
  if (method.equals("bubble")) {
    Bubble.sort(data);
    System.out.println(); 
  }
  if (method.equals("insertion")) {
    Insertion.sort(data);
    System.out.println(); 
  }
  if (method.equals("merge")) {
    Merge.sort(data);
    System.out.println(); 
  }

  Instant end = Instant.now();    
        this.timeElapsed = Duration.between(start, end);
      
    }
      public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
      //retrieves the Nano Time
        return timeElapsed.getNano();
    }
}