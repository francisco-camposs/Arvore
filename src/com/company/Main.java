package com.company;

import com.company.node.Node;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Node root = new Node("Raiz");
        Node child = root.addChild("Filho 1");
        root.addChild(new Node("Filho 2"));

        child.addChild(new Node("Neto 1"));
    }
}
