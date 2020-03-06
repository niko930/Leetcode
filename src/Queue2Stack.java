import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列表示栈
 */
public class Queue2Stack {

    Queue queue1 = new LinkedList();
    Queue queue2 = new LinkedList();

    public void add(Object o){
        queue1.add(o);
    }

    public Object poll(){
        Object o = null;

        while(queue1.size() > 1){
            queue2.add(queue1.poll());
        }
        if(queue1.size() == 1){
            o = queue1.poll();
            while(queue2.size() > 0){
                queue1.add(queue2.poll());
            }
        }
        return o;
    }

    public int length(){
        return  queue1.size();
    }

    public static void main(String[] args) {
        Queue2Stack q = new Queue2Stack();
        q.add(1);
        q.add(2);
        System.out.println(q.length());
        System.out.println(q.poll());
        System.out.println(q.length());
        System.out.println(q.poll());
        System.out.println(q.length());

    }
}
