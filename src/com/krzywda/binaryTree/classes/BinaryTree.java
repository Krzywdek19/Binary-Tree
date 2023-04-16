package com.krzywda.binaryTree.classes;

public class BinaryTree <T extends Comparable<T>> implements Tree<T>{
    private Node<T> root;

    public BinaryTree(){
        this.root = null;
    }
    public BinaryTree(Node<T> root){
        this.root = root;
    }
    @Override
    public int getCountOfNodes() {
        int countOfNodes = getCountOfNodes(this.root);

        return countOfNodes;
    }

    private int getCountOfNodes(Node <T> node) {
        if(node == null){
            return 0;
        }

        int countOfNodes = 1;
        countOfNodes += getCountOfNodes(node.getLeftChildren());
        countOfNodes += getCountOfNodes(node.getRightChildren());
        return countOfNodes;

    }


    @Override
    public int getHeightOfTree() {
        return 0;
    }

    @Override
    public boolean isBST() {
        return false;
    }

    @Override
    public void writeValuesInOrder(){
        writeValuesInOrder(root);
    }

    private void writeValuesInOrder(Node<T> node) {
        if(node == null){
            return;
        }
        writeValuesInOrder(node.getLeftChildren());
        System.out.println(node.getValue());
        writeValuesInOrder(node.getRightChildren());
    }


    private void setNode(T value, Node <T> nodeToCompare){
            if(value.compareTo(nodeToCompare.getValue()) < 0){
                if(nodeToCompare.getLeftChildren() == null){
                    nodeToCompare.setLeftChildren(new Node<T>(nodeToCompare.getLeftChildren(), value));
                }else {
                    this.setNode(value,nodeToCompare.getLeftChildren());
                }
            }else {
                if(nodeToCompare.getRightChildren() == null){
                    nodeToCompare.setRightChildren(new Node<T>(nodeToCompare.getRightChildren(), value));
                }else {
                    this.setNode(value, nodeToCompare.getRightChildren());
                }
            }
    }

    @Override
    public void addNode(T value) {

       if(this.root == null){
           this.root = new Node<T>(null,value);
       }else {
           this.setNode(value, root);
       }
    }
}
