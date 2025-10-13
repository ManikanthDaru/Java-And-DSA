class NodeInDLL {
    int data;
    NodeInDLL prev;
    NodeInDLL next;

    public NodeInDLL(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class ArrayToDLL {
    public static void main(String[] args) {
        int[] arr = {1,2,32,24,15,-99};
        NodeInDLL head = new NodeInDLL(arr[0]);
        NodeInDLL back = head;
        for(int i=1;i<5;i++) {
            NodeInDLL temp = new NodeInDLL(arr[i]);
            temp.prev = back;
            back.next = temp;
            back = temp;
        }
        printLL(head);
        head = deleteHead(head);
        printLL(head);
        head = deleteTail(head);
        printLL(head);
        head = deleteKthNode(head,2);
        printLL(head);
        deleteNode(head.next);
        printLL(head);
        head = insertHead(head,15);
        printLL(head);
        head = insertTail(head, 100);
        printLL(head);
        head = insertAtkthNode(head, 2, 37);
        printLL(head);
        insertNode(head.next.next, 55);
        printLL(head);
//        printLLReverse(back);
    }

    static void printLL(NodeInDLL head) {
        NodeInDLL temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    static void printLLReverse(NodeInDLL back) {
        NodeInDLL temp = back;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.prev;
        }
        System.out.println();
    }

    static NodeInDLL insertHead(NodeInDLL head,int val) {
        if(head==null) {
            return new NodeInDLL(val);
        }
        NodeInDLL newHead = new NodeInDLL(val);
        newHead.next = head;
        head.prev = newHead;
        return newHead;
    }

    static NodeInDLL insertTail(NodeInDLL head,int val) {
        if(head==null) {
            return new NodeInDLL(val);
        }
        if(head.next==null) {
            head = insertHead(head,val);
            return head;
        }
        NodeInDLL tail = head;
        while(tail.next!=null) {
            tail = tail.next;
        }
        NodeInDLL back = tail.prev;
        NodeInDLL newNode = new NodeInDLL(val);
        newNode.prev = back;
        newNode.next = tail;
        back.next = newNode;
        tail.prev = newNode;
        return head;
    }

    static NodeInDLL insertAtkthNode(NodeInDLL head,int k,int val) {
        if(k==1) {
            head = insertHead(head,val);
            return head;
        }
        NodeInDLL temp = head;
        int cnt = 0;
        while(temp.next!=null) {
            cnt++;
            if(cnt==k) break;
            temp = temp.next;
        }
        NodeInDLL back = temp.prev;
        NodeInDLL newNode = new NodeInDLL(val);
        newNode.prev = back;
        newNode.next = temp;
        back.next = newNode;
        temp.prev = newNode;
        return head;
    }

    static void insertNode(NodeInDLL node,int val) {
        NodeInDLL back = node.prev;
        NodeInDLL newNode = new NodeInDLL(val);
        newNode.next = node;
        newNode.prev = back;
        back.next = newNode;
        node.prev = newNode;
    }

    static NodeInDLL deleteHead(NodeInDLL head) {
        if(head==null || head.next==null) {
            return null;
        }
        NodeInDLL prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }

    static NodeInDLL deleteTail(NodeInDLL head) {
        if(head==null || head.next==null) {
            return null;
        }
        NodeInDLL temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        NodeInDLL back = temp.prev;
        temp.prev = null;
        back.next = null;
        return head;
    }

    static NodeInDLL deleteKthNode(NodeInDLL head,int k) {
        NodeInDLL temp = head;
        int cnt = 0;
        while(temp!=null) {
            cnt++;
            if(cnt==k) break;
            temp = temp.next;
        }
        NodeInDLL back = temp.prev, front = temp.next;
        if(back==null && front==null) { // DLL has a single node
            return null;
        }
        else if(back==null) {
            head = deleteHead(head);
            return head;
        }
        else if(front==null) {
            head = deleteTail(head);
            return head;
        }
        back.next = front;
        front.prev = back;
        temp.next = null;
        temp.prev = null;
        return head;
    }

    static void deleteNode(NodeInDLL temp) {
        NodeInDLL back = temp.prev,front = temp.next;
        if(front==null) {
            temp.prev = null;
            back.next = null;
            return;
        }
        back.next = front;
        front.prev = back;
        temp.prev = null;
        temp.next = null;
        return;
    }
}