

public class NodeMain
{   
    public static void printLinkedList(IntNode head)
    {
        IntNode curr = head;
        while (curr != null) {
            System.out.print( curr.getValue() + ": " + curr + " -> " );
            curr = curr.getNext();
        }
        System.out.println();
    }
    
    public static boolean isIncreasingOrder(IntNode head)
    {
        IntNode prev = head;
        IntNode curr = prev.getNext();

        while(curr != null)
        {
            if(prev.getValue() > curr.getValue())
            {
                return false;
            }
            prev = curr;
            curr = prev.getNext();
        }
        return true;
    }
    
    public static boolean isNeighboreList(IntNode head)
    {
        IntNode prev = head;
        IntNode curr = head.getNext();
        while(curr != null && curr.getNext() != null)
        {
            if(curr.getValue() != prev.getValue() + curr.getNext().getValue())
            {
                return false;
            }
            prev = curr;
            curr = prev.getNext();
        }
        return true;
    }
    
    public static boolean isSumSeries(IntNode head)
    {
        IntNode curr = head;
        int sumToCurr = 0;
        int headSum = head.getValue();
        while(curr != null && curr.getNext() != null)
        {
            curr = curr.getNext();
            headSum += curr.getValue();
        }

        curr = head;
        while(curr.getNext() != null && curr.getNext().getNext() != null)
        {
            if(curr.getValue() != headSum - curr.getValue() - sumToCurr)
            {
                return false;
            }
            sumToCurr += curr.getValue();
            curr = curr.getNext();
        }
        return true;
    }
    
    public static IntNode getWhereCombine(IntNode list1, IntNode list2)
    {
    	IntNode curr1 = list1;
    	
    	while(curr1 != null)
    	{
    		IntNode prev = list2;
    		IntNode curr2 = prev.getNext();
    		
    		while(curr2 != null)
    		{
    			if(curr1 == curr2)
    			{
    				return prev;
    			}
    			prev = curr2;
    			curr2 = curr2.getNext();
    		}
    		curr1 = curr1.getNext();
    	}
    	return null;
    }

    public static void disconnectLists(IntNode list1, IntNode list2)
    {
    	IntNode list2before = getWhereCombine(list1, list2);
    	IntNode restOfList = list2before.getNext();
    	list2before.setNext(null);
    	while(restOfList != null)
    	{
    		list2before.setNext(new IntNode(restOfList.getValue()));
    		restOfList = restOfList.getNext();
    		list2before = list2before.getNext();
    	}
    	
    	
    	
    }
    
    public static void main(String[] args)
    {
        IntNode n6 = new IntNode(1);
        IntNode n5 = new IntNode(6, n6);
        IntNode n4 = new IntNode(7, n5);
        IntNode n3 = new IntNode(14, n4);
        IntNode n2 = new IntNode(28, n3);
        IntNode n1 = new IntNode(56, n2);
        
        IntNode p2 = new IntNode(-28, n3);
        IntNode p1 = new IntNode(-56, p2);

        printLinkedList(n1);
        printLinkedList(p1);
        System.out.println("-----------");
        disconnectLists(p1, n1);
        System.out.println("-----------");
        printLinkedList(n1);
        printLinkedList(p1);
        
    }
}
