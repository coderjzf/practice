package com.jzf.datastructure;

public class TreeNode implements Comparable<TreeNode>{

	// 左孩子
	private TreeNode leftChiled;
	// 右孩子
	private TreeNode rightChild;
	// 数据
	private Integer value;

	private boolean isDelete;

	public TreeNode getLeftChild() {
		return leftChiled;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChiled = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public TreeNode() {
		super();
	}

	public TreeNode(Integer value) {
		this(null, null, value, false);
	}

	public TreeNode(TreeNode lefTreeNode, TreeNode rightNode, int value, boolean isDelete) {
		super();
		this.leftChiled = lefTreeNode;
		this.rightChild = rightNode;
		this.value = value;
		this.isDelete = isDelete;
	}

	@Override
	public String toString() {
		return "TreeNode [lefTreeNode=" + leftChiled + ", rightNode=" + rightChild + ", value=" + value + ", isDelete="
				+ isDelete + "]";
	}



	@Override
	public int compareTo(TreeNode o) {
		return this.value.compareTo(o.value);
	}
	
	

}
