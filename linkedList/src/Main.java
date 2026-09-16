
public class Main {


    public static boolean checkGoingUp(Node<Integer> head) {
        if (head == null) {
            return false;
        }
        int firstDiff = 0;
        int currDiff = 0;
        Node<Integer> prev = head;
        Node<Integer> curr = head.getNext();
        while (curr != null) {
            currDiff = curr.getValue() - prev.getValue();
            if (prev == head) {
                firstDiff = curr.getValue() - prev.getValue();
                if (firstDiff < 1) {
                    return false;
                }
                prev = curr;
                curr= curr.getNext();
            } else if (currDiff == firstDiff) {
                prev = curr;
                curr = curr.getNext();
            } else {
                return false;
            }
        }

        return true;
    }

    public static void addNodeEnd(int value, Node<Integer> head)
    {
        Node<Integer> curr = head;
        while(curr.getNext() != null)
        {
            curr = curr.getNext();
        }
        Node<Integer> newNode = new Node<>(value);
        curr.setNext(newNode);
    }

    public static Node<Integer> addNodeStart(int value, Node<Integer> head)
    {

        Node<Integer> newNode = new Node<>(value, head);
        return newNode;
    }

    public static Node<Integer> deleteHeadNode(Node<Integer> head)
    {
        Node<Integer> curr = head.getNext();
        head.setNext(null);
        return curr;
    }

    public static void deleteLastNode(Node<Integer> head)
    {
        Node<Integer> curr = head;
        while(curr.getNext() != null)
        {
            curr = curr.getNext();
        }
        curr.setNext(null);
    }

    public static int getNumFromList(Node<Integer> head)
    {
        Node<Integer> curr = head;
        int num = 0;
        while(curr != null)
        {
            num += curr.getValue();
            num *= 10;
            curr = curr.getNext();
        }

        return num/10;
    }

    public static void main(String[] args) {
        Node<Integer> n4 = new Node<>(13);
        Node<Integer> n3 = new Node<>(19, n4);
        Node<Integer> n2 = new Node<>(7, n3);
        Node<Integer> n1 = new Node<>(4, n2);
        System.out.println(checkGoingUp(n1));


    }
}
