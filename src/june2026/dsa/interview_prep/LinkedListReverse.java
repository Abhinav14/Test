package june2026.dsa.interview_prep;

public class LinkedListReverse {
    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next; //store next node
            current.next = prev; //reverse the link
            prev = current; //move prev forward
            current = next;
        }
        return prev;
    }

    public static Node buildList(int[] values){
        if(values.length == 0) return null;
        Node head = new Node(values[0]);
        Node current = head;
        for(int i = 1; i < values.length; i++){
            current.next = new Node(values[i]);
        }
    return head;
    }

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5};
        Node head1 = buildList(values);
        System.out.println(reverse(head1).val);
    }
}
