package src.Week2;

public class LinkedList
{
    private Object opaqueObject;
    private LinkedList prevNode;
    private LinkedList nextNode;

    public LinkedList(Object opaqueObject, LinkedList node)
    {
        this.setObject(opaqueObject);
        this.setPrevNode(node);
        this.setNextNode(null);
    }

    public LinkedList(LinkedList node)
    {
        opaqueObject = node.opaqueObject;
        prevNode = node.prevNode;
        nextNode = node.nextNode;
    }


    public void setObject(Object opaqueObject)
    {
        this.opaqueObject = opaqueObject;
    }

    
    public void setPrevNode(LinkedList node)
    {
        this.prevNode = node;
    }

    
    public void setNextNode(LinkedList node)
    {
        this.nextNode = node;
    }

    
    public Object getObject()
    {
        return opaqueObject;
    }

    
    public LinkedList getPrevious()
    {
        return prevNode;
    }

    
    public LinkedList getNext()
    {
        return nextNode;
    }

}