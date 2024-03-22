class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def inorderNext(root, p):
    def leftmost(node):
        while node.left:
            node = node.left
        return node

    # Case 1: right child exists
    if p.right:
        return leftmost(p.right)

    # Case 2: no right child, find the first ancestor for which p is in the left subtree
    ancestor, current = None, root
    while current != p:
        if p.val < current.val:
            ancestor, current = current, current.left
        else:
            current = current.right
    return ancestor

# Example binary tree and test node
root = TreeNode(3)
root.left = TreeNode(1)
root.right = TreeNode(4)
p = root.left  # Node with value 1

print(inorderNext(root, p).val if inorderNext(root, p) else "null")
