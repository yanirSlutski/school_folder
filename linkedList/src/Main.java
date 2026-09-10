
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
            } else if (currDiff == firstDiff) {
                prev = curr;
                curr = curr.getNext();
            } else {
                return false;
            }
        }
cs
        return true;
    }

     static void main(String[] args) {
         Node<Integer> n4 = new Node<>(12);
         Node<Integer> n3 = new Node<>(9, n4);
         Node<Integer> n2 = new Node<>(6, n3);
         Node<Integer> n1 = new Node<>(3, n2);
         System.out.println(checkGoingUp(n1));

    }
}
