import java.util.Stack;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // check if root is null
        if (root == null) {
            return false;
        }

        // keeps track of all the values for nodes on a path
        Stack<TreeNode> nodeStack = new Stack();

        // keeps track of the sums for different paths
        Stack<Integer> sumStack = new Stack();

        // add root to node stack
        nodeStack.add(root);

        // decrement the sum stack by the root value
        sumStack.add(targetSum - root.val);

        // this will not be null due to us adding the root earlier
        while (!nodeStack.isEmpty()) {

            TreeNode currentNode = nodeStack.pop();
            int currentSum = sumStack.pop();

            // if both are null, we are at a leaf node
            // returning true means we did find a path
            if (currentNode.left == null && currentNode.right == null && currentSum == 0) {
                return true;
            }

            if (currentNode.left != null) {
                nodeStack.add(currentNode.left);
                sumStack.add(currentSum - currentNode.left.val);
            }

            if (currentNode.right != null) {
                nodeStack.add(currentNode.right);
                sumStack.add(currentSum - currentNode.right.val);
            }
        }

        // if we reach here, return false
        return false;
    }
}
