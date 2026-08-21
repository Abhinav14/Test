package june2026.dsa.interview_prep;

public class DetectCycle {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(Node head){
        if(head == null){return false;}

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static Node findTail(Node head){
        if(head == null){return null;}

        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        return current;
    }

    public static Node buildList(int[] values){
        if(values.length == 0){return null;}
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
        Node tail1 = findTail(head1);
        //tail1.next = head1;

        System.out.println(hasCycle(head1));
    }
}
