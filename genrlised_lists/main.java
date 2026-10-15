package genrlised_lists;

public class main {
	
	public static <T> void printLinkedList(Node<T> head)
    {
		Node<T> curr = head;
        while (curr != null) {
            System.out.print("->" + curr.getValue());
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

	public static void main(String[] args) {
		Node<Integer> n8 = new Node<Integer>(9);
		Node<Integer> n7 = new Node<Integer>(8, n8);
		Node<Integer> n6 = new Node<Integer>(7, n7);
		Node<Integer> n5 = new Node<Integer>(6, n6);
		Node<Integer> n4 = new Node<Integer>(5, n5);
		Node<Integer> n3 = new Node<Integer>(4, n4);
		Node<Integer> n2 = new Node<Integer>(3, n3);
		Node<Integer> n1 = new Node<Integer>(2, n2);
		
		Node<Integer> p8 = new Node<Integer>(16);
		Node<Integer> p7 = new Node<Integer>(14, p8);
		Node<Integer> p6 = new Node<Integer>(12, p7);
		Node<Integer> p5 = new Node<Integer>(10, p6);
		Node<Integer> p4 = new Node<Integer>(8, p5);
		Node<Integer> p3 = new Node<Integer>(6, p4);
		Node<Integer> p2 = new Node<Integer>(4, p3);
		Node<Integer> p1 = new Node<Integer>(2, p2);
		
		printLinkedList(n1);
		printLinkedList(p1);
		System.out.println("");
		subtractLists(n1, p1);
		printLinkedList(n1);

	}

}
