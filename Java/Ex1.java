class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Ex1 {
    public TreeNode inorderNext(TreeNode root, TreeNode p) {
        TreeNode next = null;
        TreeNode current = root;
        while (current != null) {
            if (p.val < current.val) {
                next = current;
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return next;
    }

    public static void main(String[] args) {
        Ex1 tree = new Ex1();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        TreeNode p = root.left; // Node with value 1

        TreeNode nextNode = tree.inorderNext(root, p);
        System.out.println(nextNode != null ? nextNode.val : "null");
    }
}
