package com.company.node;

import java.util.ArrayList;

public class Node {

    private ArrayList<Node> children;
    private String name;
    private Node parent;

    public String getName() {
        return name;
    }

    public Node(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public Node addChild(String s) {
        Node node = new Node(s);
        return this.addChild(node);
    }

    public Node addChild(Node node) {
        children.add(node);
        node.parent = this;
        return node;
    }

    public boolean isLeaf(){
        return children.isEmpty();
    }

    public int nodeDegree(){
        return children.size();
    }

    public int treeDegree(){
        // TODO calcular o grau de todos os nós filhos
        return nodeDegree();
    }

    public boolean isSibling(Node other){
        return this.parent == other.parent;
    }

}





