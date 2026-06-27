package june2026;

public class DebugMystryList {
    public static void main(String[] args) {
        /*if (true) {
            throw new RuntimeException("CONGRATULATIONS! IntelliJ is actually running this code!");
        }*/
        UniqueNode head = new UniqueNode(1);
        head.next = new UniqueNode(2);
        head.next.next = new UniqueNode(3);
        head.next.next.next = new UniqueNode(4);
        head.next.next.next.next = new UniqueNode(5);
        head.next.next.next.next.next = new UniqueNode(6);
        UniqueNode tail = head.next;
        System.out.println(tail.val);

        UniqueNode middle = findMiddle(head);
        System.out.println("The middle element is: "+middle.val);
    }

    private static UniqueNode findMiddle(UniqueNode head) {
        UniqueNode slow = head;
        UniqueNode fast = head;
        UniqueNode dummy = head;
        while(fast != null && fast.next != null){
            System.out.println("Loop Tick -> Slow is at: " + slow.val + " | Fast is at: " + fast.val);
            dummy = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Loop Finished -> Slow stopped at: " + slow.val);
        return dummy;
    }
}
