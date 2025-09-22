class Node {

    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}
// TC - O(N)
public class ArrayToLL {
    public static void main(String[] args) {
        int[] arr = {5,1,3,8,9,10,12,34,-1,99};

        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp; // mover = mover.next
        }
//        System.out.println(head.data);
//        System.out.println(mover.data);
//        traversing the LL
        printLL(head);

        head = deleteHeadNode(head);
        printLL(head);

        head = deleteTailNode(head);
        printLL(head);

        head = deleteKthNode(head,5);
        printLL(head);

        head = deleteByValue(head,-1);
        printLL(head);

        head = insertAtHead(head,10);
        printLL(head);

        head = insertAtEnd(head,-1);
        printLL(head);

        head = insertAtKthNode(head,20,9);
        printLL(head);

        head = insertBeforeValueX(head,-22,10);
        printLL(head);
//        size of LL
        int length = getLength(head);
        System.out.println("Size of the LL: "+length);
//        searching in LL
        if(searchLL(head,8)) System.out.println("Element Found!");
        else System.out.println("Element not found!");
    }

    static void printLL(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static int getLength(Node head) {
        int length = 0;
        Node temp = head;
        while(temp!=null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    static boolean searchLL(Node head,int target) {
        Node temp = head;
        while(temp!=null) {
            if(temp.data == target) return true;
            temp = temp.next;
        }
        return false;
    }

    static Node insertAtHead(Node head,int ele) {
        Node temp = new Node(ele);
        if(head==null) return temp;
        temp.next = head;
        return temp;
    }

    static Node insertAtEnd(Node head,int ele) {
        if(head==null) return new Node(ele);
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = new Node(ele);
        return head;
    }

    static Node insertAtKthNode(Node head,int ele,int k) {
        if(head==null) return null;
        if(k<1 || k>getLength(head)+1) return head;
        if(k==1) return insertAtHead(head,ele);
        Node temp = head;
        int count = 1;
        while(count!=k-1) {
            temp = temp.next;
            count++;
        }
        Node ins = new Node(ele);
        ins.next = temp.next;
        temp.next = ins;
        return head;
    }

    static Node insertBeforeValueX(Node head,int ele,int x) {
        if(head==null) return null;
        if(head.data==x) return insertAtHead(head,ele);

        Node temp = head;
        while(temp.next.data!=x) {
            temp = temp.next;
        }
        Node ins = new Node(ele);
        ins.next = temp.next;
        temp.next = ins;
        return head;
    }

    static Node deleteHeadNode(Node head) {
        if(head==null) return head;
        head = head.next;
        return head;
    }

    static Node deleteTailNode(Node head) {
        if(head==null || head.next==null) return null;
        Node temp = head;
        while(temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node deleteKthNode(Node head,int k) {
        if(head==null) return null;
        if(k==1) return deleteHeadNode(head);
        else {
            int count = 1;
            Node temp = head, prev = null;
            while(k!=count && temp.next!=null) {
                prev = temp;
                temp = temp.next;
                count++;
            }
            if(k!=count) return head;
            prev.next = temp.next;
        }
        return head;
    }

    static Node deleteByValue(Node head,int target) {
        if(head==null) return null;
        if(head.data == target) return deleteHeadNode(head);

        Node temp = head, prev = null;
        while(target!=temp.data && temp.next!=null) {
            prev = temp;
            temp = temp.next;
        }
        if(target!=temp.data) return head;
        prev.next = temp.next;

        return head;
    }
}
