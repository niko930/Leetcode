import java.util.Stack;

public class BackspaceCompare {
    /**
     * 844. 比较含退格的字符串
     * <p>
     * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：S = "ab#c", T = "ad#c"
     * 输出：true
     * 解释：S 和 T 都会变成 “ac”。
     * <p>
     * 示例 2：
     * <p>
     * 输入：S = "ab##", T = "c#d#"
     * 输出：true
     * 解释：S 和 T 都会变成 “”。
     * <p>
     * 示例 3：
     * <p>
     * 输入：S = "a##c", T = "#a#c"
     * 输出：true
     * 解释：S 和 T 都会变成 “c”。
     * <p>
     * 示例 4：
     * <p>
     * 输入：S = "a#c", T = "b"
     * 输出：false
     * 解释：S 会变成 “c”，但 T 仍然是 “b”。
     */
    public boolean backspaceCompare(String S, String T) {
        return backSpace(S).equals(backSpace(T));
    }

    private String backSpace(String S) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            String sub = S.substring(i, i + 1);
            if ("#".equals(sub)) {
                if (!stack.empty())
                    stack.pop();
            } else {
                stack.push(sub);
            }
        }
        return stack.toString();
    }
}
