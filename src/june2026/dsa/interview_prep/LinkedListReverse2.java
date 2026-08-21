package june2026.dsa.interview_prep;

public class LinkedListReverse2 {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printList(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val);
            if(temp.next != null){
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node buildList(int[] values){
        if(values.length == 0) return null;

        Node head = new Node(values[0]);
        Node current = head;
        for(int i = 1; i < values.length; i++){
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        Node head1 = buildList(values);
        System.out.print("Original List:   ");
        printList(head1);

        Node reversed = reverseLinkedList(head1);
        System.out.print("Reversed List:   ");
        printList(reversed);
    }

}
