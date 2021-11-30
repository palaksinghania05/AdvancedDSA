package singlylinkedlist.basicOperations;

public class BeginningOperation {
    private ListNode head;
    private static class ListNode {
        private int data; //generic type
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public int length(){
        if(head==null)
            return 0;
        int count = 0;
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }

    //insert a node at the beginning of a linked list
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //delete the first node of  singly linked list
    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        BeginningOperation sll = new BeginningOperation();
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.insertFirst(10);
        sll.display();
        System.out.println(sll.deleteFirst().data);
        System.out.println(sll.deleteFirst().data);
        sll.display();
    }
}
