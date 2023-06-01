public class Runner {
   public static void main(String[] args) {
    Node2 node = new Node2(3);
    node.add(5);
    node.add(8);
    node.add(5);
    node.add(10);
    node.add(2);
    node.add(1);

    // System.out.println(node);
    // System.out.println(node.partition(2));

    // System.out.println(node.parse(node));

    Node2 n1 = new Node2(7);
    // n1.add(1);
    // n1.add(6);

    Node2 n2 = new Node2(5);
    n2.add(9);
    // n2.add(6);

    System.out.println(LinkedListSum.sum(n1, n2));
   } 
}
