package genrlised_lists;

public class main {
	
	public static <T> void printLinkedList(Node<T> head)
    {
		Node<T> curr = head;
        while (curr != null) {
            System.out.print("->" + curr.getValue().toString());
            curr = curr.getNext();
        }
        System.out.println();
    }
	
	public static void compressSequences(Node<Character> chain)
	{
		Node<Character> curr = chain;
		Node<Character> prevLetter = chain;
		while(curr != null)
		{
			if(prevLetter.getValue() != curr.getValue())
			{
				prevLetter.setNext(curr);
				prevLetter = curr;
			}
			curr = curr.getNext();
		}
	}
	
	public static <T> void removeNode(Node<T> prevNode)
	{
		if(prevNode != null && prevNode.getNext() != null)
		{
			prevNode.setNext(prevNode.getNext().getNext());
		}
	}
	
	public static <T> boolean checkIfInList(T value, Node<T> listHead)
	{
		Node<T> curr = listHead;
		boolean isIn = false;
		while(curr != null && !isIn)
		{
			if(value == curr.getValue())
			{
				isIn = true;
			}
			curr = curr.getNext();
		}
		return isIn;
	}
	
	public static void subtractLists(Node<Integer> l1, Node<Integer> l2)
	{
		Node<Integer> dummyHead = new Node<Integer>(0, l1);
		Node<Integer> curr = l1;
		Node<Integer> prev = dummyHead;
		
		while(curr != null)
		{
			if(checkIfInList(curr.getValue(), l2))
			{
				removeNode(prev);
			}
			prev = curr;
			curr = curr.getNext();
		}
	}

	public static double sumExpressions(Node<Expression> head)
	{
		double sum = 0;
		Node<Expression> curr = head;
		while(curr != null)
		{
			sum += curr.getValue().calculate();
			curr = curr.getNext();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
	
	}

}
