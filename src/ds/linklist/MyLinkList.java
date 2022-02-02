package ds.linklist;

public class MyLinkList {
    public ListNode head;

    public static class ListNode<T> {
        private T data;
        private ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public <T> void insertAtFirst(T data) {
        ListNode<T> nwNode = new ListNode(data);
        if (head == null) {
            head = nwNode;
        } else {
            nwNode.next = head;
            head = nwNode;
        }
    }

    public <T> void insrtLast(T data) {
        ListNode<T> nwNode = new ListNode<>(data);
        if (head == null) {
            head = nwNode;
        } else {
            ListNode<T> current = head;
            ListNode<T> prevouse = null;
            while (current != null) {
                prevouse = current;
                current = current.next;
            }
            prevouse.next = nwNode;
        }
    }

    public void printLinkList(ListNode l) {
        ListNode current = l;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("");
    }

    public <T> void insertAtPosition(int position, T data) {
        ListNode<T> nwNode = new ListNode<>(data);
        if (position == 1) {
            nwNode.next = head;
            head = nwNode;
        } else {
            // 2-->4-->6-->3-->null
            // 2-->4-->5-->6-->3-->null
            ListNode pre = head;
            int count = 1;
            while (count < position - 1) {
                pre = pre.next;
                count++;
            }
            ListNode curr = pre.next;
            nwNode.next = curr;
            pre.next = nwNode;
        }
    }

    public static void main(String[] args) {
        MyLinkList m = new MyLinkList();
        m.head = new ListNode(2);
        ListNode sec = new ListNode(3);
        m.head.next = sec;
        m.insertAtFirst(2);
        m.insertAtFirst(4);
        m.insrtLast(8);
       // m.printLinkList(m.head);
        //m.insertAtPosition(1,3);
        //m.printLinkList(m.head);
        /*m.dltFist();
        m.printLinkList();
        m.dltFist();
        m.printLinkList();*/
        //m.dltLast();
        m.printLinkList(m.head);
        //m.dltLast();
        //ListNode d =m.dltAtPosition(3);
        //System.out.print(d.data);
        //ListNode r =m.reverse();
        //m.printLinkList(r);
        ListNode mid = m.findMiddleNode();
        System.out.println(mid.data);

    }

    public ListNode dltFist() {
        ListNode temp = null;
        if (head == null){
            return head;
        } else {
            temp = head;
            head = head.next;
            temp = null;
        }
        return temp;
    }

    public ListNode dltLast(){
        ListNode prev = null;
        ListNode current  = head;
        if (head == null || head.next==null) {
            System.out.println("in if"+head.data);
            return head;
        } else {
            while (current.next!= null) {
                System.out.println("in else"+current.data);
                prev = current;
                current = current.next;
            }
            prev.next = null;
            return current;
        }
    }
    public  ListNode dltAtPosition(int position){
        if(position == 1){
            ListNode current = head;
            head = head.next;
            current = null;
            return current;
        }
        int count = 1;
        ListNode prev  = head;
        while (count<position-1){
            prev = prev.next;
            count++;
        }
        ListNode current = prev.next;
        prev.next = current.next;
        return current;
    }
    public ListNode reverse() {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode current = head;
            ListNode prev = null;
            ListNode next = null;
            while (current != null) {
                next = current.next;
               current.next = prev;
               prev = current;
               current = next;
            }
            return prev;
        }
    }

    public ListNode findMiddleNode(){
            ListNode p = head;
            ListNode fp = head;
            while (fp!= null && fp.next!= null){
                p=p.next;
                fp= fp.next.next;
            }
            return p;
    }
}
