package com.company.testNode;


import com.company.node.Node;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
	private Node node;
	@org.junit.jupiter.api.BeforeEach
	void setUp() {
		node = new Node("Novo");
	}
	
	@org.junit.jupiter.api.Test
	void setName() {
		node.setName("Mato");
		assertEquals("Mato", node.getName());
	}
	
	@org.junit.jupiter.api.Test
	void getName() {
		assertEquals("Novo", node.getName());
	}
	
	@org.junit.jupiter.api.Test
	void TestIfTheMethodAddChildIsFunctioning() {
		Random rand = new Random();
		
		Integer ints = Math.abs(rand.nextInt() % 100);
		
		for (Integer i = 0; i < ints; i++){
			node.addChild(new Node(i.toString()));
		}
		
		assertEquals(ints, node.nodeDegree());
	}
	
	@org.junit.jupiter.api.Test
	void testAddChild() {
	}
	
	@org.junit.jupiter.api.Test
	void VerifyIfANodeisALeaf() {
		assertTrue(node.isLeaf());
		Node node1 = new Node("Filho 1");
		node.addChild(node1);
		assertFalse(node.isLeaf());
	}
	
	@org.junit.jupiter.api.Test
	void nodeDegree() {
		Random rand = new Random();
		
		Integer ints = Math.abs(rand.nextInt() % 100);
		
		for (Integer i = 0; i < ints; i++){
			node.addChild(new Node(i.toString()));
		}
		
		assertEquals(ints, node.nodeDegree());
	}
	
	@org.junit.jupiter.api.Test
	void treeDegree() {
		Random aux = new Random();
		
		Node child = new Node("Filho");
		
		int count = Math.abs(aux.nextInt()) % 100;
		
		for (int i = 0; i < count; i++){
			child.addChild(new Node("" + aux.nextInt()));
		}
		
		count = Math.abs(aux.nextInt()) % 100;
		for (int i = 0; i < count; i++){
			node.addChild(new Node("" + aux.nextInt()));
		}
		node.addChild(child);
		
		int maior = 0;
		
		System.out.println("Nó do pai: "+node.nodeDegree() + "\n Nó do filho: "+child.nodeDegree());
		System.out.println("Maior Nó: "+node.treeDegree());
		
		if (node.nodeDegree() >= child.nodeDegree()){
			maior = node.nodeDegree();
		}
		else {
			maior = child.nodeDegree();
		}
		
		assertEquals(maior, node.treeDegree());
		
	}
}