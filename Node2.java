public class Node2 {
    public Integer data;
    public Node2 next;

    public Node2(Integer data) {
        this.data = data;
    }

    public void add(Integer value) {
        Node2 currentNode = this;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = new Node2(value);
    }

    public Node2 partition(Integer partition) {
        Node2 head = null;
        Node2 current = this;

        while(current != null) {
            if(head == null) {
                head = new Node2(current.data);
            } else {
                if (current.data < partition) {
                    Node2 leftmost = new Node2(current.data);
                    leftmost.next = head;
                    head = leftmost;
                } else {
                    head.add(current.data);
                }
            }

            current = current.next;
        }
        
        return head;
    }

    public String parse(Node2 node) {
        if(node == null) return "";

        return node.data + " " + parse(node.next);
    }




    @Override
    public String toString() {

        Node2 currentNode = this;

        StringBuilder output = new StringBuilder("[");

        while(currentNode != null) {
           output.append(currentNode.data + ", ");
           currentNode = currentNode.next; 
        }

        output.append( "]" );

        return output.toString();
    }
    
}
