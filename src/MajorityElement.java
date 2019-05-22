public class MajorityElement {
    /**
     * 169. 求众数
     * <p>
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     * <p>
     * 你可以假设数组是非空的，并且给定的数组总是存在众数。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [3,2,3]
     * 输出: 3
     * 示例 2:
     * <p>
     * 输入: [2,2,1,1,1,2,2]
     * 输出: 2
     */
    public int majorityElement(int[] nums) {
        int result = 0;     //当前判断的元素
        int count = 0;      //计算当前的数字出现的次数
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {   //当次数为0时，则换下一判断元素
                result = nums[i];
                count = 1;
            }else if (nums[i] == result) {
                count++;    //当前元素等于判断元素,次数加一
            } else {
                count--;    //当前元素不等于判断元素,次数减一
            }
        }
        return result;
    }
}
