class DeleteBST {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode delete(TreeNode root, int key) {

        if (root == null)
            return null;

        if (key < root.val)
            root.left = delete(root.left, key);

        else if (key > root.val)
            root.right = delete(root.right, key);

        else {

            if (root.left == null && root.right == null)
                return null;

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = delete(root.right, successor.val);
        }

        return root;
    }

    public static TreeNode findMin(TreeNode node) {

        while (node.left != null)
            node = node.left;

        return node;
    }

    public static void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        root = delete(root, 30);

        inorder(root);
    }
}