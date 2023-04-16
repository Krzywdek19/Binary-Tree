package com.krzywda.binaryTree;

import com.krzywda.binaryTree.classes.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> numbers = new BinaryTree<>();

        numbers.addNode(5);
        numbers.addNode(15);
        numbers.addNode(52);
        numbers.addNode(-5);
        numbers.addNode(35);
        numbers.addNode(52);
        numbers.addNode(125);

        numbers.writeValuesInOrder();
        System.out.println(numbers.getCountOfNodes());
    }
}