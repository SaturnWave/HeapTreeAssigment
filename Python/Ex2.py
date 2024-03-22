class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def printElementAndHeight(root):
    def postorder(node):
        if not node:
            return -1  # Height of an empty tree is -1

        left_height = postorder(node.left)
        right_height = postorder(node.right)
        height = 1 + max(left_height, right_height)

        print(f"Element: {node.val}, Height: {height}")
        return height

    postorder(root)

# Define a test binary tree
root = TreeNode(3)
root.left = TreeNode(1)
root.right = TreeNode(4)
root.left.left = TreeNode(0)
root.left.right = TreeNode(2)

# Testing the function
printElementAndHeight(root)
