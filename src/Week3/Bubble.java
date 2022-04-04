package src.Week3; 
import java.util.*; 

//Bubble Sort
public class Bubble {
  public static void sort (List<Integer> list) {
    Integer temp;
    boolean sorta = false;

    //While Loop used to sort through list
    while (!sorta) {
        sorta = true;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                sorta = false;
            }
        }
    }
}
}