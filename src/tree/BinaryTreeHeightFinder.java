package tree;

public class BinaryTreeHeightFinder {

    // recursive way to find height of tree
    public int binaryTreeHeightRec(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftTreeHeight = binaryTreeHeightRec(root.leftChild);
        int rightTreeHeight = binaryTreeHeightRec(root.rightChild);
        return 1 + Math.max(leftTreeHeight, rightTreeHeight);
    }

    // Iterative way to find height of tree
    


    public static void main(String[] args) {
        BinaryTreeHeightFinder binaryTreeHeightFinder = new BinaryTreeHeightFinder();
        TreeNode root = new TreeNode(5);
        root.leftChild = new TreeNode(10);
        root.rightChild = new TreeNode(15);
        root.leftChild.leftChild = new TreeNode(1);
        int height = binaryTreeHeightFinder.binaryTreeHeightRec(root);
        System.out.println("Height of binary tree recursively : " + height);
    }
}

