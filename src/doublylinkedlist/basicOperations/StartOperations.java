package doublylinkedlist.basicOperations;

public class StartOperations {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data; //can be any generic type
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }
    public StartOperations(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0; //or head == null
    }

    public void displayForward(){
        if(head == null)
            return;
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public static void main(String[] args) {
        StartOperations dll = new StartOperations();
        dll.insertFirst(12);
        dll.insertFirst(5);
        dll.insertFirst(8);
        dll.insertFirst(11);
        dll.displayForward();
        dll.displayBackward();
    }
}
