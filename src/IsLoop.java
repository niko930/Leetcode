public class IsLoop {

    /**
     * 判断链表是否有环
     * @param node
     * @return
     */
    public static boolean isLoop (Node node) {
        Node walker = node;
        Node runner = node.next;
        if (walker == null || runner == null) {
            return false;
        }

        while (walker != null && runner != null) {
            if (walker == runner) {
                return true;
            }
            walker = walker.next;
            runner = runner.next.next;
        }
        return false;
    }

    public static void main(String[] args) {

        Node node1 = new Node();
        node1.val = 1;
        Node node2 = new Node();
        node2.val = 2;
        Node node3 = new Node();
        node3.val = 3;
        Node node4 = new Node();
        node4.val = 4;
        Node node5 = new Node();
        node5.val = 5;


        node1.next = node2;

        node2.next = node3;

        node3.next = node4;

        node4.next = node5;

        node5.next = null;

        boolean loop = isLoop(node1);
        System.out.println(loop);
    }

}
