public class LongestPalindrome {
    /**
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     *
     * 示例 1：
     *
     * 输入: "babad"
     * 输出: "bab"
     * 注意: "aba" 也是一个有效答案。
     * @param s
     * @return
     */
    private static String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for(int i=0;i<s.length();i++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    private static int expandAroundCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left -1;
    }

    public static void main(String[] args) {
        String s = "asdfgfdsw";
        String str = LongestPalindrome.longestPalindrome(s);
        System.out.print(str);
    }
}
