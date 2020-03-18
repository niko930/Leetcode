import java.util.Arrays;

public class ThreeSumClosest {

    /**
     * 16. 最接近的三数之和
     * <p>
     * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
     * <p>
     * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
     * <p>
     * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                }
                if (sum > target) {
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    return ans;
                }
            }
        }
        return ans;
    }



    /*tag 2020年3月18日20:42:41 二刷*/
}
