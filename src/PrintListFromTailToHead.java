import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
    /**
     * 从尾到头打印链表
     *
     * 题目描述
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
