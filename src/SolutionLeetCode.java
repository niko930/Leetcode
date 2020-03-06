import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionLeetCode {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 4, 1, 15};
        int target = 0;
        int[] ints = SolutionLeetCode.twoSum(nums, target);
        System.out.print(Arrays.toString(ints));
    }
}
