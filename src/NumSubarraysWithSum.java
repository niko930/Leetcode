public class NumSubarraysWithSum {
    /**
     * 在由若干 0 和 1  组成的数组 A 中，有多少个和为 S 的非空子数组。
     * <p>
     * <p>
     * 示例：
     * <p>
     * 输入：A = [1,0,1,0,1], S = 2
     * 输出：4
     * 解释：
     * 如下面黑体所示，有 4 个满足题目要求的子数组：
     * [1,0,1,0,1]              A[0]-A[2]
     * [1,0,1,0,1]              A[0]-A[3]
     * [1,0,1,0,1]              A[1]-A[4]
     * [1,0,1,0,1]              A[2]-A[4]
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1. A.length <= 30000
     * 2. 0 <= S <= A.length
     * 3. A[i] 为 0 或 1
     */
    public int numSubarraysWithSum(int[] A, int S) {
        int count = 0;

        out:for (int i = 0; i < A.length; i++) {
            int remp = A[i];

            if (A[i] > S) {
                continue out;
            } else if (A[i] == S) {
                count++;
            } else {

            }

        }

        return count;
    }
}
