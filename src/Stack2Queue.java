import java.util.Stack;

/**
 * 用栈表示队列
 */
public class Stack2Queue {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void add(Object o) {
        stack1.push(o);
    }

    public Object poll() {
        Object o = null;

        if (stack2.isEmpty()) {

            while (stack1.size() > 1) {
                stack2.push(stack1.pop());

            }
            if (stack1.size() == 1) {
                o = stack1.pop();
            }
        } else {
            o = stack2.pop();
        }
        return o;
    }

    public int length(){
        return stack1.size()+stack2.size();
    }


    public static void main(String[] args) {
        Stack2Queue s = new Stack2Queue();
        s.add(111);
        s.add(222);
        System.out.println(s);
        System.out.println(s.length() + "," + s.poll());
        System.out.println(s.length() + "," + s.poll());
        System.out.println(s.length());

    }

}
