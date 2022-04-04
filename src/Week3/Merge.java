package src.Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Merge {
 
    private ArrayList<String> strList;
 
    public static void sort (ArrayList<Integer> whole) {
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int center;

            center = whole.size()/2;
            for (int i=0; i<center; i++) {
                    left.add(whole.get(i));
            }
 
            for (int i=center; i<whole.size(); i++) {
                    right.add(whole.get(i));
            }
 
            left  = mergeSort(left);
            right = mergeSort(right);
 
            merge(left, right, whole);
      

}

      public static ArrayList<Integer>mergeSort(ArrayList<Integer> whole) {
        
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int center;

        if (whole.size() == 1) {    
        return whole;
    } else {
          center = whole.size()/2;

            for (int i=0; i<center; i++) {
                    left.add(whole.get(i));
            }
 
            for (int i=center; i<whole.size(); i++) {
                    right.add(whole.get(i));
            }
 
            left  = mergeSort(left);
            right = mergeSort(right);
 
            merge(left, right, whole);
      
            return whole;
    }
            
}
 
    public static void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;
 
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }
 
        ArrayList<Integer> rest;
        int restIndex;
      
        if (leftIndex >= left.size()) {
            rest = right;
            restIndex = rightIndex;
        } else {
            rest = left;
            restIndex = leftIndex;
        }
 
        for (int i=restIndex; i<rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }
 
    public void show() {
        System.out.println("Sorted:");
        for (int i=0; i< strList.size();i++) {
            System.out.println(strList.get(i));
        }
    }
}