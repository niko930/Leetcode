public class ReConstructBinaryTree {
    /**
     * 重建二叉树
     *
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     */
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length, in, 0, in.length);
        return root;
    }

    private TreeNode reConstructBinaryTree(int[] pre, int StartPre, int EndPre, int[] in, int StartIn, int EndIn) {
        if(StartPre > EndPre || StartIn > EndIn){
            return null;
        }
        TreeNode root = new TreeNode(pre[StartPre]);
        for(int i=StartIn;i<=EndIn;i++){
            if(in[i] == pre[StartPre]){
                root.left = reConstructBinaryTree(pre, StartPre+1, StartPre+i-StartIn, in, StartIn, i-1);
                root.right = reConstructBinaryTree(pre, StartPre+i-StartIn+1, EndPre, in, i+1, EndIn);
                break;
            }
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
