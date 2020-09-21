package com.company.binaryTree;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public int min() {
        if (root != null) {
            return root.min();
        }
        return Integer.MIN_VALUE;
    }

    public int max() {
        if (root != null) {
            return root.max();
        }
        return Integer.MAX_VALUE;
    }


    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        // subTreeRoot is the node that we want to delete
        if (subTreeRoot == null) {
            return subTreeRoot;
        }

        if (value < subTreeRoot.getData()) {
            subTreeRoot.setLeft(delete(subTreeRoot.getLeft(), value));
        } else if (value > subTreeRoot.getData()){
            subTreeRoot.setRight(delete(subTreeRoot.getRight(), value));
        } else {
            // case 1 and 2: node to delete has 0 or 1 child
            if (subTreeRoot.getLeft() == null) {
                return subTreeRoot.getRight(); // set the node to the right child of the node that we are deleting
            } else if (subTreeRoot.getRight() == null) {
                return subTreeRoot.getLeft(); // set the node to the right child of the node that we are deleting
            }
            // case 3 : node to delete has 2 childen
            else {
                // find the minimum value of right subtree, and replace the value of the node that we are
                // deleting with that min value.
                subTreeRoot.setData(subTreeRoot.getRight().min());
                // delete the minimum value node in right subtree
                subTreeRoot.setRight(delete(subTreeRoot.getRight(), subTreeRoot.getData()));
            }
        }
        return subTreeRoot;
    }

}
