public class CustomLinkedList {

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo(1);
        // list.add(1);
        // list.add(1);
        // list.add(1);
        // list.add(1);
        // list.add(1);

        list.add(2);
        list.add(3);
        list.add(5);
        // list.add(2);
        // list.add(6);
        // list.add(2);
        // list.add(3);
        // list.add(3);
        // list.add(7);
        // list.add(10);
        // list.add(3);
        // list.add(2);
        // list.add(2);


        // System.out.println("Before: ");
        System.out.println(list);
        list.deleteNodeFromMiddle(1);
        System.out.println(list);

        // list.removeDups();
        // System.out.println("--------------------");
        // System.out.println("After: ");
        // System.out.println(list);
    }


    
}
