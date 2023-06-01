public class Node {

    Integer value;
    Node next;

    public Node(Integer value) {
        this.value = value;
    }

    public void setNext(Node node) {
        this.next = node;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Node{ " + value + " }";
    }
}