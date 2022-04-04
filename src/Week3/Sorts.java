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
    int TIMES = 12;
    int SIZE = 5000;
    int sum = 0;
    int time = 0;
    for(int i=0; i< TIMES; i++) {
        Data s = new Data(SIZE, method);
        for(int j = 0; j<s.getData().size(); j++) {
            sum += s.getData().get(j);
        }
      
        System.out.println("Average random: " + sum / ((i+1)*SIZE));
        System.out.println("Nanoseconds: " + s.getTimeElapsed()+"\n");
        time += s.getTimeElapsed();
        allTwelve.add(s.getTimeElapsed());
    }

    Collections.sort(allTwelve);
    
    System.out.println("Analysis for "+ method+" sort");
    System.out.println("Total in Nanoseconds: " + time );
    System.out.println("Total in Seconds: " + time /1000000000.0);
    System.out.println("All 12 times in Nanoseconds: " + allTwelve);
    System.out.println("Average of 12 times in seconds "+"(with high and low): "+ time/12/1000000000.0);

    
    Integer allTen = 0;
    System.out.println("HIGH (in nanoseconds): "+allTwelve.remove(0)); 
    System.out.println("LOW (in nanoseconds): "+allTwelve.remove(allTwelve.size()-1)); 
    for(Integer d : allTwelve) {
      allTen += d;
    }
    
    System.out.println("Average of 12 times in seconds " + "(Without the High and Low "+ allTen/10/1000000000.0);

   
  
  
    
  }
}
