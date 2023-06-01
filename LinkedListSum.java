public class LinkedListSum {
    public static Node2 sum(Node2 n1, Node2 n2) {
        Node2 sumHead = null;
        Node2 cur1 = n1;
        Node2 cur2 = n2;
        Node2 next = null;
        // Node2 beforeLast = null;

        while(cur1 != null || cur2 != null) {
            if(cur1 == null) cur1 = new Node2(0);
            if(cur2 == null) cur2 = new Node2(0);

            int sum = cur1.data + cur2.data;
            
            if(next != null) sum += next.data;

            int remainder = sum % 10;
            int division = sum / 10;
            Node2 tempNext = new Node2(division);

            if(sumHead == null) {
                sumHead = new Node2(remainder);
                next = tempNext;
                sumHead.next = next;
            } else {
                next.data = remainder;
                next.next = tempNext;
                next = next.next;
            }

            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        System.out.printf("Last %s\n", next);

        return sumHead;
    }
    
}
