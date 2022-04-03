package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import src.Week0.*;
import src.Week1.*;
import src.Week2.*;
import src.Week3.*;

public class DynamicMenu {

  Map<Integer, DynamicMenuRow> menu = new HashMap<>();
  public Menu(DynamicMenuRow[] rows) {
        int i = 0;
        for (DynamicMenuRow row : rows) {
            menu.put(i++, new DynamicMenuRow(row.getTitle(), row.getAction()));
        }
    }

    public DynamicMenuRow get(int i) {
        return menu.get(i);
    }

    public void print() {
        for (Map.Entry<Integer, DynamicMenuRow> pair : menu.entrySet()) {
            System.out.println(pair.getKey() + " ==> " + pair.getValue().getTitle());
        }
    }

    public static void main(String[] args) {
        Driver.main(args);
    }

}

class DynamicMenuRow {
    String title;       // menu item title
    Runnable action;    // menu item action, using Runnable


    public DynamicMenuRow(String title, Runnable action) {
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

        DynamicMenuRow[] rows = new DynamicMenuRow[]{
          new DynamicMenuRow("Exit", () -> main(null)),
          new DynamicMenuRow("Week 0", () -> Week0Menu.main(null)), 
          new DynamicMenuRow("Week 1", () -> Week1Menu.main(null)),
          new DynamicMenuRow("Week 2", () -> Week2Menu.main(null)),
          new DynamicMenuRow("Week 3", () -> Week3Menu.main(null)),

        };


        Menu menu = new Menu(rows);


        while (true) {
            System.out.println("Which Week?:");

            menu.print();


            try {
                Scanner sc = new Scanner(System.in);
                int selection = sc.nextInt();


                try {
                    DynamicMenuRow row = menu.get(selection);

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