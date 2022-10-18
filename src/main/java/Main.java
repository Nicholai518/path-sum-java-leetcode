public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();

        TreeNode two = new TreeNode(2);
        TreeNode seven = new TreeNode(7);
        TreeNode eleven = new TreeNode(11, seven, two);
        TreeNode fourLeft = new TreeNode(4, eleven, null);


        TreeNode one = new TreeNode(1);
        TreeNode fourRight = new TreeNode(4, null, one);
        TreeNode thirteen = new TreeNode(13);
        TreeNode eight = new TreeNode(8, thirteen, fourRight);

        TreeNode root = new TreeNode(5, fourLeft, eight);

        System.out.println("Example One : " + solution.hasPathSum(root, 22));
    }
}
