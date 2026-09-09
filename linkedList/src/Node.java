public class Node<T> {
    private T value;
    private Node<T> next;

    // Constructor
    public Node(T data) {
        this.value = data;
        this.next = null;
    }

    // Getters and Setters
    public T getValue() { return value; }
    public void setValue(T value) { this.value = value; }

    public Node<T> getNext() { return next; }
    public void setNext(Node<T> next) { this.next = next; }
}
