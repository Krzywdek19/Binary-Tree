package com.krzywda.binaryTree.classes;

public class Node <T extends Comparable<T>>{
    private Node<T> parent;
    private Node<T> leftChildren;
    private Node<T> rightChildren;

    private T value;


    public Node(Node<T> parentNode, T value){
        this.parent = parentNode;
        this.value = value;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public Node<T> getLeftChildren() {
        return leftChildren;
    }

    public void setLeftChildren(Node<T> leftChildren) {
        this.leftChildren = leftChildren;
    }

    public Node<T> getRightChildren() {
        return rightChildren;
    }

    public void setRightChildren(Node<T> rightChildren) {
        this.rightChildren = rightChildren;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
