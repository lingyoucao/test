package com.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {
	private String name;
	private Vector<TreeNode> children = new Vector<TreeNode>();
	
	public TreeNode(){
		super();
	}
	
	public TreeNode(String name){
		this.name = name;
	}
	
	public void add(TreeNode node){
		
		children.add(node);
		
	}
	
	public void remove(TreeNode node){
			
		children.remove(node);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//取得孩子节点  
    public Enumeration<TreeNode> getChildren(){  
        return children.elements();
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
    
    
}
