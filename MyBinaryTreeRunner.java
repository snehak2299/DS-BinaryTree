package com.bridglab.binarytree;

import java.util.Scanner;

import com.bridglab.linkedlist.MyNode;

public class MyBinaryTreeRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		System.out.println("how many nodes you want to add");
		int count = sc.nextInt();
		for(int i=0;i<=count-1;i++) {
		System.out.println("Enter nodes to added in binary tree");
		myBinaryTree.add(sc.nextInt());
		}
		count+=1;
		int size=myBinaryTree.getSize();
		System.out.println(size);

	}

}
