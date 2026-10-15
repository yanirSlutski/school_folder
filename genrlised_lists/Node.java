package genrlised_lists;

public class Node<T> {
	private T value;
	private Node<T> next;
	
	public Node(T value, Node<T> next)
	{
		this.value = value;
		this.next = next;
	}
	
	public Node(T value)
	{
		this.value = value;
		this.next = null;
	}
	
	public Node<T> getNext()
	{
		return this.next;
	}
	
	public T getValue()
	{
		return this.value;
	}
	
	public void setNext(Node<T> newNode)
	{
		this.next = newNode;
	}
	
	public void setValue(T newValue)
	{
		this.value = newValue;
	}
	
	

}
