public class IsBalanced_Solution {
    /**
     * 平衡二叉树
     *
     * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
     */
    public boolean IsBalanced_Solution(TreeNode root) {
        return IsBalanced(root) != -1;
    }

    public int IsBalanced(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = IsBalanced(root.left);
        if(left == -1){
            return -1;
        }
        int right = IsBalanced(root.right);
        if(right == -1){
            return -1;
        }
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }
}
