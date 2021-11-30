package singlylinkedlist.practice;

public class RemoveDuplicatesFromSortedList {
    private ListNode head;
    private static class ListNode {
        private int data; //generic type
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void removeDuplicates() {
        if(head == null){
            return;
        }
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList sll = new RemoveDuplicatesFromSortedList();
        sll.insertFirst(3);
        sll.insertFirst(3);
        sll.insertFirst(2);
        sll.insertFirst(1);
        sll.insertFirst(1);
        sll.display();
        sll.removeDuplicates();
        sll.display();
    }
}
