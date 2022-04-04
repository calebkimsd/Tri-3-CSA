package src.Week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import src.Week0.*;
import src.Week1.*;
import src.Week2.*;

public class Week2Menu {

  Map<Integer, Week2MenuRow> menu = new HashMap<>();
  public Week2Menu(Week2MenuRow[] rows) {
        int i = 0;
        for (Week2MenuRow row : rows) {
            menu.put(i++, new Week2MenuRow(row.getTitle(), row.getAction()));
        }
    }

    public Week2MenuRow get(int i) {
        return menu.get(i);
    }

    public void print() {
        for (Map.Entry<Integer, Week2MenuRow> pair : menu.entrySet()) {
            System.out.println(pair.getKey() + " ==> " + pair.getValue().getTitle());
        }
    }

    public static void main(String[] args) {
        Driver.main(args);
    }

}

class Week2MenuRow {
    String title;       // menu item title
    Runnable action;    // menu item action, using Runnable


    public Week2MenuRow(String title, Runnable action) {
        this.title = title;
        this.action = action;
    }

  
    public String getTitle() {
        return this.title;
    }
    public Runnable getAction() {
        return this.action;
    }


    public void run() {
        action.run();
    }
}


class Driver {

    public static void main(String[] args) {
        Week2MenuRow[] rows = new Week2MenuRow[]{
          new Week2MenuRow("Exit", () -> main(null)),
          new Week2MenuRow("Calculator & Input/Output", () -> Calculator.main(null)),
          new Week2MenuRow("Square Root", () -> CalculatorSqrt.main(null)), 

        };


        Week2Menu menu = new Week2Menu(rows);


        while (true) {
            System.out.println("Which Week?:");

            menu.print();


            try {
                Scanner sc = new Scanner(System.in);
                int selection = sc.nextInt();


                try {
                    Week2MenuRow row = menu.get(selection);

                    if (row.getTitle().equals("Exit"))
                        return;

                    row.run();
                } catch (Exception e) {
                    System.out.printf("Invalid selection %d\n", selection);
                }
            } catch (Exception e) {
                System.out.println("Not a number");
            }
        }
    }
}