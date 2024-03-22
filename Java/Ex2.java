class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Ex2 {
    private int postorder(TreeNode node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = postorder(node.left);
        int rightHeight = postorder(node.right);
        int height = 1 + Math.max(leftHeight, rightHeight);

        System.out.println("Element: " + node.val + ", Height: " + height);
        return height;
    }

    public void printElementAndHeight(TreeNode root) {
        postorder(root);
    }

    public static void main(String[] args) {
        Ex2 tree = new Ex2();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        tree.printElementAndHeight(root);
    }
}
