package com.company;

import com.company.node.Node;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Node root = new Node("Raiz");
        Node child = root.addChild("Filho 1");
        root.addChild(new Node("Filho 2"));
        root.addChild(new Node("Filho 3"));
        child.addChild(new Node("Neto 1"));
        System.out.println("Root degree: "+root.treeDegree());
        root.percorrer();
    }
}
