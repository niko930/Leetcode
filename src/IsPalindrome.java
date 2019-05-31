public class IsPalindrome {
    /**
     * 125. 验证回文串
     * <p>
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * <p>
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     * <p>
     * 示例 1:
     * <p>
     * 输入: "A man, a plan, a canal: Panama"
     * 输出: true
     * 示例 2:
     * <p>
     * 输入: "race a car"
     * 输出: false
     */
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for(char c :s.toCharArray()){
            if((c >= '0' && c <='9') || (c >= 'a' && c <= 'z'))
                sb.append(c);
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
