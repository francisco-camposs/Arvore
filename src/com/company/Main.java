package com.company;

import com.company.node.Node;
import com.company.visitor.NodeVisitorPrint;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Node root = new Node("Raiz");
        Node child = root.addChild("Filho 1");
        root.addChild(new Node("Filho 2"));
        root.addChild(new Node("Filho 3"));
        root.addChild(new Node("Filho 4"));
        child.addChild(new Node("Neto 1"));
        root.visit(new NodeVisitorPrint());
        System.out.println(root.treeDegree());
        
    }
}
