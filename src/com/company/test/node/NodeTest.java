package com.company.test.node;


import com.company.node.Node;
import org.junit.jupiter.api.Test;

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
			Random rand = new Random();

			Integer Int = Math.abs(rand.nextInt()) % 100;
			Node pai = new Node("Papai");
			Node filho1 = new Node("Filho 1");
			Node filho2 = new Node("Filho 2");
			
	}
}