package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Node root = new Node("Raiz");
//        Node child = root.addChild("Filho 1");
//        root.addChild(new Node("Filho 2"));
//        root.addChild(new Node("Filho 3"));
//        root.addChild(new Node("Filho 4"));
//        child.addChild(new Node("Neto 1"));
//        root.visit(new NodeVisitorPrint());
//        System.out.println(root.treeDegree());
//        System.out.println(child);
    
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        Integer novo = new Integer(3);
        
        numeros.add(novo);
        System.out.println(numeros.size());
        numeros.add(novo);
        System.out.println(numeros.size());
        
    }
}
