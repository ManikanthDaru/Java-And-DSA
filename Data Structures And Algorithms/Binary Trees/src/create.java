public class create {
    public static class Node {
        int key;
        Node left,right;
        public Node(int item) {
            this.key=item;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        one.left=two;
        one.right=three;
        two.left=four;
    }
}