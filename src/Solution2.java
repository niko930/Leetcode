import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int i = Solution2.lengthOfLongestSubstring(s);
        System.out.print(i);
    }

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * @param s
     * @return
     */
    private static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0,j=0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(s.charAt(j)));
            }
            map.put(s.charAt(j),j+1);
            ans = Math.max(ans,j-i+1);

        }

        return ans;
    }
}
