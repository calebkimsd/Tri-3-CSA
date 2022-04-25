<p align="right"><a href="https://calebkimsd.github.io/Tri-3-CSA/">Home</a></p>
<p align="right"><a href="https://calebkimsd.github.io/Tri-3-CSA/notes">Notes / Key Learnings / Challenges</a></p>
<p align="right"><a href="https://calebkimsd.github.io/Tri-3-CSA/testprep">AP Test Prep</a></p>
<p align="right"><a href="https://calebkimsd.github.io/Tri-3-CSA/FRQ">FRQ</a></p>
<p align="right"><a href="https://calebkimsd.github.io/Tri-3-CSA/studyguide">Study Guide</a></p>

# Caleb Kim / Study Guide (EMPHASIS on ideas that I need to review more than other) 

- Exam Weighting:

- ![image](https://files.catbox.moe/e8hznx.jpg)
## Resources

- [Barons Textbook](https://www.mooreschools.com/cms/lib/OK01000367/Centricity/Domain/1996/book.pdf)
- [Review Video](https://www.youtube.com/watch?v=_mClihsGtjY)
- [Outsourced Study Guide](http://support.ebsco.com/LEX/AP-Computer-Science-A_Study-Guide.pdf)
- [Tips for CSA Exam](https://www.albert.io/blog/ap-computer-science-tips/)

### LINK TO DAILY VIDEOS
- [Day 1](https://www.youtube.com/watch?v=-NXby4ahlnU&t=1836s)
- [Day 2](https://www.youtube.com/watch?v=wOzceGBpZRM&t=2740s)
- [Day 3](https://www.youtube.com/watch?v=JMxBmmcFyXU)
- [Day 4](https://www.youtube.com/watch?v=D0k6tHQttzA)

## Recursion

- Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method. It makes the code compact but complex to understand.
```
class Factorial {

    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
```

## Sorts

### What is Bubble Sort?

- Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

```
package src.Week3; 
import java.util.*; 

public class Bubble {

  public static void sort (List<Integer> list) {

    Int temp;
    boolean sorta = false; 

    while (!sorta) {

      sorta = true;
      for (int i = 0; i <list.size()-1; i++) {
        if (list.get(i).compareTo(list.get(i + 1))> 0 ) {
          list.set(i, list.get(i + 1)); 
          list.set(i + 1, temp); 
          temp = list.get(i);

          sorted  = false; 
        }
      }
    }
  }
}

```
- Whole pass is then performed to ensure that the array is fully sorted, and the algorithm knows to stop.

![bubble](https://files.catbox.moe/wbsu4e.jpg)

- From my sort, I can see that bubble sort is very inconsistent in the time that it takes to finish. 

### What is Selection Sort?
- The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

```
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
```

![selection](https://files.catbox.moe/2mqw38.jpg)

 - We search for the lowest element and arrange it to the proper location. We swap the current element with the next lowest number.
- Every iteration of selection sort, an element is picked from the unsorted subarray and moved to the sorted subarray.


### What is Insertion Sort?
- The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
- In general, the Insertion sort technique compares each element with all of its previous elements and sorts the element to place it in its proper position.

```
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

```
![Insertion](https://files.catbox.moe/budh12.jpg)

- Insertion is good for small elements only because it requires more time for sorting large number of elements.
- It then traverses the unsorted partition and inserts each element in their relative correct place in the sorted array.
- Useful in sorting linked list data structures.

![Insertion2](https://files.catbox.moe/dp6cri.jpg)

### What is Merge Sort?
 It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves. The merge() function is used for merging two halves.
```
while (leftIndex < left.size() && rightIndex < right.size()) {
            if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
```

![Merge](https://files.catbox.moe/sjcv31.jpg)

- Hardest to create out of the 4 sorts as it takes the longest, but.... it is the most rewarding in terms of time. 
- Steps go like:
1) Divide the unsorted list into two sublists of about half the size
2) Sort each of the two sublists
3) Merge the two sorted sublists back into one sorted list
- Make use of the __Merge__ function in Java. 

## Vocabulary Term(s) Review

* Casting, specifically for Division: when we use division, the variable of the cast is specified in a type. Integers are truncating because they have to be whole numbers ; often they are decimals when we divide rather whole numbers.


```
double a = 1.0/2; // java assumes 2 doubles and b = 0.5
double b = 1/4.0; // java assumed 2 doubles and b = 0.25
```
* Casting, specifically for Truncating or Rounding: Rounding a fraction/decimal value to the near integer. If it is less than .9999, it will go to 0. In Java, it always rounds down. 
```
int c = 1/2; // java truncates integer division to 0
int d = 5/4 ; // java truncates integer division to 1
```

* Wrapper Classes, why wrap int, double: Integer class must be capitalized and is a wrapper class (not to be confused with the data type, int) , Can create and display objects by wrapping around statements like System.out.println. Primitive data types like int are being converted to objects.
```
public class Main {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  }
```
* Concatenation, rules on mixed type Concatenation: Another term for combining strings. We do not just add 2 different ints to create a String but rather they are being combined together. 
```
normal concatenation: 
String s="Sachin"+" Tendulkar";  
   System.out.println(s);//Sachin Tendulkar 

mixed type:
String s=50+30+"Sachin"+40+40;  
   System.out.println(s);//80Sachin4040

After a string literal, all the + will be treated as string concatenation operator.
```

```
System.out.println("Goodbye" + person + " see you later");
```

* Math class, specifically Random usage: Math class methods - already defined, returns numbers, static (part of java.lang.Math package). For random usage, we use can use the function: Math.random();
```
examples of class usage:
Math.min(5, 10);
Math.sqrt(64);
Math.abs(-4.7);
Math.random();

full class with random:
import java.lang.Math;
  
class Gfg2 {
  
    // driver code
    public static void main(String args[])
    {
        // define the range
        int max = 10;
        int min = 1;
        int range = max - min + 1;
  
        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
  
            // Output is different everytime this code is executed
            System.out.println(rand);
        }
    }
}

```

```
import java.util.Random;
```

* Compound Boolean Expression: == MEAN equal to , != MEAN not equal to , Relational operators evaluate to  || True or False , A two-way selection is written when there are two sets of statements - one to be executed when the boolean condition = true, and another set for when the boolean condition = false. Basically to check if a given statement is true or not.
```
public class TestNum
{
   public static void main(String[] args)
   {
     int score = 10; // Try -10 and 110
     if (score < 0 || score > 100)
     {
         System.out.println("Score has an illegal value.");
     }
     if (score >= 0 && score <= 100)
     {
         System.out.println("Score is in the range 0-100");
     }

   }
}
```
* Truth Tables:  mathematical table used in logic—specifically in connection with Boolean algebra, boolean functions, and propositional calculus

| A | B| A && B| A ll B | !A
| --- |:---:| ---:| -----:| -----:|
|True| False| False| True | False |
|False| True |False |True  | True  |
|False |False |False |False | True  |
|True | True | True | True | False |

* De Morgan's Law: show how to handle the negation of a complex conditional, which is a conditional statement with more than one condition joined by an and" && " , or or " || ".
```
 !(a && b) == !a || !b
```

* Comparing Numbers: When we compare numbers in Java, the return will be either a 1(true) or a 0(false). 
```
public class SimpleTesting{ 
    public static void main(String[] args) {

        Integer a = new Integer(18);
        Integer b = new Integer(18);
        if(a.equals(b)) {
            System.out.println("Both are equal");
        }else System.out.println("Not equal");
        
    }
}
```
* Comparing Strings: It is used in authentication (by equals() method), sorting (by compareTo() method), reference matching (by == operator) etc.
Correct comparsion that should be used is along the lines of 
System.out.println(a.equals(b));
```
String a = "Computer";
String b = "Phone"; 
if(a == b){
	System.out.println(“They are both working together”);
} else{
System.out.println(“They are not working together”);
}
```


* Comparing Objects: By comparing two objects, the value of those objects is not 1. Rather it is their memory addresses in the stack that are different since both objects were created using the new operator. 
```
Integer a = new Integer(1);
Integer b = new Integer(1);

assertThat(a.equals(b)).isTrue();
```
* for loop, enhanced for loop: For loops are loops that iterate a variable through a list and allow the variable to be manipulated in the loop. 3 different parts for a loop header - (initialization, Boolean expression, increment/decrement) Before the first Boolean expression is evaluated, the initialization statement is  executed. Loop control variable. Both for loops and while loops can be used interchangeably when coding. If we are repeating statements for a unknown # of time, a while loop is better because it isolates the Boolean expression. 
```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```
* while loop versus do while loop: These iteration statements change the control of the statements until a condition is met. A boolean expression is evaluated b4 each of the iterations including the 1st. If “true” the loop is created. If “false” the iteration ceases/dies. A do while loop will because run the code b4 checking the condition. 
```
class whileLoopDemo {
    public static void main(String args[])
    {
        // initialization expression
        int i = 1;
  
        // test expression
        while (i < 6) {
            System.out.println("Hello World");
  
            // update expression
            i++;
        }
    }
}
```
* nested loops: An enhanced for loop has a variable in the header , In each iteration, the variable is assigned to a copy of an element without using the element’s index. Assigning a new value doesn’t change the value stored in the array. Used with multidimensional arrays and also matrixes. 
```
for (int i = 1; i <= 5; ++i) {
  // codes

  // inner loop
  for(int j = 1; j <=2; ++j) {
    // codes
  }
..
}
```
* Big O notation (Hash map, Binary Search, Single loop, Nested Loop): Big O notation is used to compare algorithms and see how fast they each run. The function in Java is tested and compared to others. 
```
Hash map: Hashmap best and average case for Search, Insert and Delete is O(1) and worst case is O(n). Hash tables are the implementation of associative arrays
Binary Search: Search a sorted array by repeatedly dividing the search interval in half repeatedly 
Single loop: The big O of a loop is the number of iterations of the loop into number of statements within the loop.
Nested loopo: still O(n^2)

```

* Creating a Class, describe Naming Conventions
```
- The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top-level domain names, currently com, edu, gov, mil, net, org, or one of the English two-letter codes identifying countries as specified in ISO Standard 3166, 1981.
-Class names should be nouns, in mixed case with the first letter of each internal word capitalized. 
-Interface names should be capitalized like class names.
-Methods should be verbs, in mixed case with the first letter lowercase, with the first letter of each internal word capitalized.
-Except for variables, all instance, class, and class constants are in mixed case with a lowercase first letter.
-The names of variables declared class constants and of ANSI constants should be all uppercase with words separated by underscores 
```
* Constructor, describe why there is no return: Constructor needs to initialize the above instance variables, so you must set gradeLevel, name, and age. When a constructor is called, the parameters are local variables, so the variables are only defined inside that constructor. The parameter names are different from the instance variables.
```
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}
```
* Accessor methods, relationship to getter: They get variables from other places in the code. We can use keyword Private and use the Accessor methods to access them. 
```
public typeOfVar getVarName()
   {
      return varName;
   }
```

* Mutator methods, relationship to setter, describe void return type: These are setters, and they are used to set variables from elsewhere in the code. Just like getters, they can be accessed when private or public. 
```
public class CheckingAccount{
  private int balance;
  
  //A mutator method
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }
}
```
* Static variables, Class variables: static variables are used to keep track of information that relates logically to an entire class. Used for memory management. 
```
public static int i;
    public static int j = 20;
```
* Static methods, Class methods: methods in Java that can be called without creating an object of the class. It is used for the convenience side of things where we can just call by using the class name, where the method is just static.
```
public static void geek(String vocab)
    {
        work = vocab;
    }
```
* this Keyword: In a non-static method/constructor, “This” is a reference to the object - which is called by method/constructor. 
“This” can be used to pass the object as a parameter in a method. 
```
public class Main {
  int x;

  // Constructor with a parameter
  public Main(int x) {
    this.x = x;
  }

  // Call the constructor
  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println("Value of x = " + myObj.x);
  }
}
```
* main method, tester methods: Other methods, like println, carry out a sequence of actions without returning a result. Java uses the keyword void to define such methods:
```
public class Test {

static void main(String[] args){

	System.out.println("Hello World");
	
}
}
```
* Inheritance, extends: Inheritance can be used to create class hierarchy where the parent classes are called “superclasses” and the child classes are called “subclasses” The child class inherits any attributes or behaviors written into the parent class like in biology, a baby would inherit its parents features.

```
class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;
 
    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
 
    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
 
    public void speedUp(int increment)
    {
        speed += increment;
    }
 
    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}
 
// derived class
class MountainBike extends Bicycle {
 
    // the MountainBike subclass adds one more field
    public int seatHeight;
 
    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }
 
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
 
    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
```
* Subclass constructor, super Keyword: Super can be used to call a superclass's constructors and methods. Superclass method can be called in a subclass by using Super with the method name and passing appropriate parameters. 

public class Subclass extends Superclass {

    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();    
    }
}
```
* Overloading a method, same name different parameters: This essentially means when we override a method but use different parameter names/sequence).
```
add(int, int)
add(int, int, int)
```
* Overriding a method, same signature of a method: Methods essentially do the same thing but the method in the subclass will override the method in the super-class. 

class Parent {
    void show()
    {
        System.out.println("Parent's show()");
    }
}
  
// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override
    void show()
    {
        System.out.println("Child's show()");
    }
}
```
* Abstract Class, Abstract Method: An abstract class is a class that is declared abstract —it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.
```
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}
```
* Object superclass methods: toString(), compare(), clone(): Subclasses of Object often override the equals and toString methods with class-specific implementations. Accessor methods allow other clients to access an object’s data. Accessor methods must be public so they can be accessed. They can either be Getter methods or toString()
```
public String toString()
    {
        return name + " " + age + " " + college + " "
            + course + " " + address;
    }
```
* Late binding of object, referencing superclass object, ie Animal a = new Chicken(); Animal b = new Goat();

* Polymorphism: any of overloading, overriding, late binding: Utilize the Object class through inheritance. At compile time, methods in or inherited by the declared type determine the correctness of a non-static method call. When you run-time - the actual type is executed for a non-static method call.
``` 
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
```
