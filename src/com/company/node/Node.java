package com.company.node;

import com.company.visitor.NodeVisitor;

import java.util.ArrayList;

public class Node {

    private ArrayList<Node> children;
    private String name;
    private Node parent;



    public Node(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
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

    public Integer treeDegree(){
        Integer Int = this.nodeDegree();
        for (Node node: children){
            node.treeDegree(Int);
        }
        return Int;
    }

    private void treeDegree(Integer Int){
        if (Int < this.nodeDegree()){
            Int = nodeDegree();
        }
        for (Node node: children){
            node.treeDegree(Int);
        }
    }

    public boolean isLeaf(){
        return children.isEmpty();
    }

    public void visit(NodeVisitor visitor){
            visitor.visit(this);
            for (Node node: children){
            node.visit(visitor);
        }
    }

    public int nodeDegree(){
        return children.size();
    }

    public boolean isSibling(Node other){
        if (other == null){
            return false;
        }
        return this.parent == other.parent;
    }

}





