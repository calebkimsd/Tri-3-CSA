package src.Week3; 

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;  


public class Sorts {

  public static void main(String[] args) {
    
    System.out.println("Selection Sort");
    analyze("selection");
    System.out.println();
    
    System.out.println("Bubble Sort");
    analyze("bubble");
    System.out.println();
    
    System.out.println("Insertion Sort");
    analyze("insertion");
    System.out.println();

    System.out.println("Merge Sort");
    analyze("merge");
    System.out.println();
  }
  public static void analyze(String method) {
    ArrayList<Integer> allTwelve = new ArrayList<Integer>();
    //Print 12 different random sorts for each
    int TIMES = 12;
    //5000 elements
    int SIZE = 5000;
    int sum = 0;
    int time = 0;

    //retrieve from Data 
    for(int i=0; i< TIMES; i++) {
        Data s = new Data(SIZE, method);
        for(int j = 0; j<s.getData().size(); j++) {
            sum += s.getData().get(j);
        }

      //print 12 lines for both --> each sort
        System.out.println("Average random: " + sum / ((i+1)*SIZE));
        System.out.println("Nanoseconds: " + s.getTimeElapsed()+"\n");
        time += s.getTimeElapsed();
        allTwelve.add(s.getTimeElapsed());
    }

    Collections.sort(allTwelve);

    //if statments in Data.java that differentiate sorts
    System.out.println("Analysis for "+ method+" sort");
    //First analyzed through the nanoseconds
    System.out.println("Total in Nanoseconds: " + time );
    // added /1000000000.0
    System.out.println("Total in Seconds: " + time /1000000000.0);
    System.out.println("All 12 times in Nanoseconds: " + allTwelve);
    
    Integer allTen = 0;
    System.out.println("High: "+allTwelve.remove(0)); 
    System.out.println("Low: "+allTwelve.remove(allTwelve.size()-1)); 
    for(Integer d : allTwelve) {
      allTen += d;
    }
    
    System.out.println("Average of 12 times in seconds " + "(Without the High and Low "+ allTen/10/1000000000.0);
    
if (method.equals("merge")) {
      System.out.println("");
      System.out.println("CONCLUSION: Merge Sort is the fastest out of all 4 Sorts Why? --> Because it has O(nlog(n)) where N is mulitpled to log(n) which will produce a smaller time than O(n)^2 and O(n). Bubble Sort is also super duper slow sometimes --> not efficent!");
    }
  }
}
