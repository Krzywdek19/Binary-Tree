package com.krzywda.binaryTree.classes;

public interface Tree <T extends Comparable<T>> {
    public int getCountOfNodes();
    public int getHeightOfTree();
    public boolean isBST();

    public void writeValuesInOrder();

    public void addNode(T value);
}
