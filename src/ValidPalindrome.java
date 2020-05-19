public class ValidPalindrome {


    /**
     * 680. 验证回文字符串 Ⅱ
     *
     * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
     *
     * 示例 1:
     *
     * 输入: "aba"
     * 输出: True
     * 示例 2:
     *
     * 输入: "abca"
     * 输出: True
     * 解释: 你可以删除c字符。
     *
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        return valid(s, 0, s.length() - 1, false);
    }

    public boolean valid(String s, int i, int j, boolean isDeep) {
        while (i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (a != b) {
                if (isDeep)
                    return false;
                return valid(s, i, j-1, true) || valid(s, i+1, j, true);
            }
            i++;
            j--;
        }
        return true;
    }

}
