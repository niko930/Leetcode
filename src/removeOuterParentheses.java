public class removeOuterParentheses {

    public static String removeOuterParentheses(String S) {
        int index = 0;
        int low = 0;
        int high = 0;
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<S.length();i++){

            if(S.charAt(i) == '('){
                index++;
            }else{
                index--;
            }

            if(S.charAt(i) == '(' && index == 1){
                low = i;
            }
            if(S.charAt(i) == ')' && index == 0){
                high = i;
            }

            if(index == 0){
                String substring = S.substring(low+1, high);
                sb.append(substring);
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String s = removeOuterParentheses.removeOuterParentheses("(()())(())");
        System.out.println(s);
    }

}
