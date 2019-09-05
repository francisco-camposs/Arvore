package com.company.visitor;

import com.company.node.Node;

public class NodeVisitorPrint implements NodeVisitor{
    @Override
    public void visit(Node n) {
        System.out.println(n.getName());
    }
}
