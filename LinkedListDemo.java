public class LinkedListDemo {
    private Node head;

    public LinkedListDemo(Integer value) {
        this.head = new Node(value);
    }

    public void add(Integer value) {
        
        Node currentNode = this.head;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = new Node(value);

    }

    public void deleteNodeFrom(Node node, Integer value) {

        Node curr = node;
        while(curr != null && curr.next != null) {
            if(curr.next.value == value) {
                curr.next = curr.next.next;
            }

            curr = curr.next;
        }

    }

    public void forwardNode(Node node, Integer value) {
        Node curr = node;
        Node end = node.next;
        while(end != null && end.value == value) {
            end = end.next;
        }

        curr.next = end;
    }

    public Node moveForwardByNumber(Node node, Integer number) {
        Node current = node;
        Integer counter = 0;

        if(node != null) counter++;

        while(counter < number && current != null) {
            current = current.next;
            ++counter;
        }

        return current;
    }

    public Integer getLength() {
        Integer counter = 0;

        Node current = this.head;

        while(current != null) {
            current = current.next;
            counter++;
        }

        return counter;
    }


    public Node kthFromLast(Integer k) {
        Integer length = getLength();
        System.out.printf("Length: %s; K: %s\n", length, k);

        if(length < k) return null;

        Node firstPointer = this.head;
        Node secondPointer = moveForwardByNumber(this.head, k);

        System.out.printf("Second: %s\n", secondPointer);
        System.out.printf("First: %s\n", firstPointer);
        System.out.println();
        
        while(secondPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;

            System.out.printf("F: %s; S: %s\n", firstPointer, secondPointer);
        }

        return firstPointer;
    }

    public void deleteNodeFromMiddle(Integer value) {
        Node current = this.head;

        while(current != null && current.next != null) {
            if(current.next.value == value && current.next.next != null) {
                current.next = current.next.next;
                break;
            }

            current = current.next;
        }
    }

    public void removeDups() {
        boolean[] flags = new boolean[11];

        Node prevNode = this.head;
        Node nextNode = this.head.next;

        while(prevNode != null && prevNode.next != null) {
            if(flags[prevNode.value]) {
                forwardNode(prevNode, prevNode.value);
                System.out.printf("After Prev rm: %s\n", toString());
            }
            flags[prevNode.value] = true;

            prevNode = prevNode.next;
            // nextNode = nextNode.next;
        }
        
    }

    public Integer getIndex(Integer index) {
        int counter = 0;

        Node currentNode = this.head;

        while(currentNode != null && counter != index) {
            currentNode = currentNode.next;
            counter++;
        }

        if(currentNode == null) return null;

        return currentNode.value;

    }


    @Override
    public String toString() {

        Node currentNode = this.head;

        StringBuilder output = new StringBuilder("[");

        while(currentNode != null) {
           output.append(currentNode.value + ", ");
           currentNode = currentNode.next; 
        }

        output.append( "]" );

        return output.toString();
    }

}
