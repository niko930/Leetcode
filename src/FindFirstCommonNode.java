import java.util.HashMap;

public class FindFirstCommonNode {
    /**
     * 两个链表的第一个公共结点
     *
     * 输入两个链表，找出它们的第一个公共结点。
     */
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        HashMap<ListNode, Integer> map = new HashMap<>();
        while(current1 != null){
            map.put(current1, null);
            current1 = current1.next;
        }
        while (current2 != null) {
            if (map.containsKey(current2)) {
                return current2;
            }
            current2 = current2.next;
        }
        return null;
    }
}
