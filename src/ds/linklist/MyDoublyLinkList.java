package ds.linklist;

public class MyDoublyLinkList {
    ListNode head = null;
    ListNode tail = null;
    int length;

    private class ListNode {
        int data;
        ListNode next;
        ListNode previous;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public void displayFwd(){
        ListNode tmp = head;
        while (tmp!=null){
            System.out.print(tmp.data+"-->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

    public void displayBwd(){
        ListNode tmp = tail;
        while (tmp!=null){
            System.out.print(tmp.data+"-->");
            tmp = tmp.previous;
        }
        System.out.println("null");
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void insrtNodeAtFirst(int data){
        ListNode nw = new ListNode(data);
        if(isEmpty()){
            tail = nw;
        } else {
            head.previous = nw;
        }
        nw.next = head;
        head = nw;
        length++;
    }

    public void insertAtLast(int data){
        ListNode nw = new ListNode(data);

        if (isEmpty()){
            head = nw;
        } else {
            tail.next = nw;
            nw.previous = tail;
        }
        tail=nw;
        length++;
    }

    public static void main(String[] args) {
        MyDoublyLinkList dl = new MyDoublyLinkList();
        //dl.insrtNodeAtFirst(2);
        //dl.insrtNodeAtFirst(4);
        dl.insertAtLast(10);
        dl.insertAtLast(11);
        dl.displayFwd();
        dl.displayBwd();
    }
}
