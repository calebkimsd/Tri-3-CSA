package src.Week2;

import java.util.*;

public class Stack
{
    private LinkedList lifo;  

    public Stack()
    {
        lifo = null;
    }
  
    public Object peek()
    {
        if (lifo == null)
            return null;
        else
            return lifo.getObject();
    }

    public void push(Object value)
    {
      
        lifo = new LinkedList(value, lifo);
    }

  
    public Object pop()
    {
        Object value = null;

        if (lifo != null) {
            value = lifo.getObject();
            lifo = lifo.getPrevious();
        }

        return value;
    }

    public String toString()
    {
        StringBuilder stackToString = new StringBuilder("[");

        LinkedList node = lifo;  			
        while (node != null)
        {
            stackToString.append(node.getObject()); 	
            node = node.getPrevious();    	
            if (node != null)
                stackToString.append(", ");
        }										
        stackToString.append("]");
        return stackToString.toString();
    }


}