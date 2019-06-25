public class Convert {
    /**
     * 二叉搜索树与双向链表
     *
     * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
     */
    TreeNode head = null;
    TreeNode tail = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertHelper(pRootOfTree);
        return head;
    }

    private void ConvertHelper(TreeNode root) {
        if(root == null){
            return;
        }
        ConvertHelper(root.left);
        if(tail == null){
            tail = root;
            head = root;
        }else{
            tail.right = root;
            root.left = tail;
            tail = root;
        }
        ConvertHelper(root.right);
    }

}
