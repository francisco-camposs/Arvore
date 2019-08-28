package com.company.node;

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

    public boolean isLeaf(){
        return children.isEmpty();
    }

    public int nodeDegree(){
        return children.size();
    }

    public int treeDegree(){
        // TODO calcular o grau de todos os nós filhos
        Integer num = 0;
        return threeDegree(num,this);
    }
    
    private int threeDegree(Integer num, Node node){
        return num;
    }
    
    public void percorrer(){
        System.out.println(this.name);
        run(this);
    }
    
    private void run(Node node) {
        for(var value: node.children){
            System.out.println(value.name);
            run(value);
        }
    }

    public boolean isSibling(Node other){
        if (other == null){
            return false;
        }
        return this.parent == other.parent;
    }

}





