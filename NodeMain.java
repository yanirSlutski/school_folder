

public class NodeMain
{   
    public static void printLinkedList(IntNode head)
    {
        IntNode curr = head;
        while (curr != null) {
            System.out.println( curr.getValue() );
            curr = curr.getNext();
        }
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
    
    public static void main(String[] args)
    {
        IntNode n6 = new IntNode(1);
        IntNode n5 = new IntNode(6, n6);
        IntNode n4 = new IntNode(7, n5);
        IntNode n3 = new IntNode(14, n4);
        IntNode n2 = new IntNode(28, n3);
        IntNode n1 = new IntNode(56, n2);

        System.out.println(isSumSeries(n1));
        
    }
}
