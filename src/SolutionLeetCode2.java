import java.util.HashMap;
import java.util.Map;

public class SolutionLeetCode2 {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0,j=0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j-i+1);
            map.put(s.charAt(j), j+1);
        }

        return ans;
    }


    public static void main(String[] args) {
        String s = "asdfghgffde";
        int i = SolutionLeetCode2.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}