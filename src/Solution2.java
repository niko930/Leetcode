import java.util.Stack;

class Solution2 {
    public boolean isValid(String s) {

        Stack stack = new Stack();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{

                char c = (char) stack.pop();
                char match;
                if(s.charAt(i) == ')'){
                    match = '(';
                }else if(s.charAt(i) == ']'){
                    match = '[';
                }else{
                    match = '{';
                }

                if(c != match) return false;

            }

        }
        if(stack.size() != 0) return false;

        return true;
    }
    public boolean isValid2(String s){
        while(s.contains("{}") || s.contains("()") || s.contains("[]")){
            s = s.replace("{}","").replace("()","").replace("[]","");
            if("".equals(s))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "({()()({}{()})[[]]})";
        Solution2 solution2 = new Solution2();
        boolean valid = solution2.isValid2(s);
        System.out.println(valid);
    }

}
