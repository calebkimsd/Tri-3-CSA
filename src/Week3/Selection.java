package src.Week3;
import java.util.*;


public class Selection {  
  
    public static void sort (ArrayList<Integer> arr) {  
      
        for (int i = 0; i < arr.size() - 1; i++)  
        {  
            int index = i;
          
            for (int j = i + 1; j < arr.size(); j++){  
                if (arr.get(j) < arr.get(index)){  
                    index = j; 
                  
                }  
            }  
          
            int SmallestNumber = arr.get(index);   
            arr.set(index, arr.get(i)); 
            arr.set(i,SmallestNumber);  
        }  
    }  
}
       