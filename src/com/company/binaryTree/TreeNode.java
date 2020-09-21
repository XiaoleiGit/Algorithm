package com.company.binaryTree;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public void insert(int value) {
        // Not inserting duplicated value
        if (data == value) {
            return;
        } else if (value < data) {
            if (left == null) {
                left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        }
    }

    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.print(data + " -> ");
        if (right != null) {
            right.traverseInOrder();
        }
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
