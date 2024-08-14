

class MaximumDepth {
    // Method to calculate the maximum depth of a binary tree
    public int maxDepth(TreeNode root) {
        // Base case: if the current node is null, the depth is 0
        if (root == null) {
            return 0;
        }

        // Recursively find the maximum depth of the left subtree
        int leftDepth = maxDepth(root.left);

        // Recursively find the maximum depth of the right subtree
        int rightDepth = maxDepth(root.right);

        // Return the greater of the two depths plus one for the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
    
    class TreeNode {
        int val; // Value of the node
        TreeNode left; // Reference to the left child
        TreeNode right; // Reference to the right child
    
        // Constructor to initialize the node with a value
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
    
}
