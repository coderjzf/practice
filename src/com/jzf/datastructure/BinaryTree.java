package com.jzf.datastructure;

import java.util.Stack;

public class BinaryTree {
	private TreeNode root;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public void insert(int value) {
		TreeNode newNode = new TreeNode(value);
		if (root == null) {
			root = newNode;
		} else {
			TreeNode currentNode = root;
			TreeNode parentNode;

			while (true) {
				parentNode = currentNode;
				if (newNode.compareTo(currentNode) >= 0) {
					currentNode = currentNode.getRightChild();
					if (currentNode == null) {
						parentNode.setRightChild(newNode);
						return;
					}
				} else {
					currentNode = currentNode.getLeftChild();
					if (currentNode == null) {
						parentNode.setLeftChild(newNode);
						return;
					}
				}
			}
		}
	}

	public TreeNode find(Integer value) {
		if (root == null) {
			return null;
		}

		TreeNode currentNode = root;
		TreeNode newNode = new TreeNode(value);

		while (currentNode != null) {
			int cmp = newNode.compareTo(currentNode);
			if (cmp > 0) {
				currentNode = currentNode.getRightChild();
			} else if (cmp < 0) {
				currentNode = currentNode.getLeftChild();
			} else {
				return currentNode;
			}
		}
		return null;
	}

	public boolean contains(Integer value) {
		if (find(value) != null) {
			return true;
		}
		return false;
	}
	/* �ݹ���� */

	public void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getValue() + " ");
		preOrder(root.getLeftChild());
		preOrder(root.getRightChild());
	}

	public void preOrder() {
		preOrder(root);
	}

	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.getLeftChild());
		System.out.print(root.getValue() + " ");
		inOrder(root.getRightChild());
	}

	public void inOrder() {
		inOrder(root);
	}

	public void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.getLeftChild());
		postOrder(root.getRightChild());
		System.out.print(root.getValue() + " ");
	}

	public void postOrder() {
		postOrder(root);
	}

	public void visit(TreeNode treeNode) {
		System.out.print(treeNode.getValue() + " ");
	}

	/* 
	   public void preOrder(TreeNode treeNode) {
		if (treeNode == null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(treeNode);
		while (!stack.empty()) {
			TreeNode node = stack.pop();
			visit(node);
			if (node.getRightChild() != null) {
				stack.push((node).getRightChild());
			}
			if (node.getLeftChild() != null) {
				stack.push(node.getLeftChild());
			}
		}
	}

	public void preOrder() {
		preOrder(root);
	} */
	
	/*�ǵݹ����*/
	
	public void preOrder2(TreeNode treeNode) {
		if (treeNode == null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = treeNode;
		while (node != null || !stack.empty()) {
			// ���������������������ջ
			while (node != null) {
				visit(node);
				stack.push(node);
				node = node.getLeftChild();
			}
			// ȡ�ý����Һ���
			if (!stack.empty()) {
				node = stack.pop();
				node = node.getRightChild();
			}
		}
	}

	public void preOrder2() {
		preOrder2(root);
	}

	/*
	 * ������һ���P��
	 * 
	 * 1)�������Ӳ�Ϊ�գ���P��ջ����P��������Ϊ��ǰ��P��Ȼ��Ե�ǰ���P�ٽ�����ͬ�Ĵ���
	 * 
	 * 2)��������Ϊ�գ���ȡջ��Ԫ�ز����г�ջ���������ʸ�ջ����㣬Ȼ�󽫵�ǰ��P��Ϊջ�������Һ��ӣ�
	 * 
	 * 3)ֱ��PΪNULL����ջΪ�����������
	 */
	public void inOrder2(TreeNode treeNode) {
		if (treeNode == null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = treeNode;
		while (node != null || !stack.empty()) {
			/*����������������ջ���ݲ����*/
			while (node != null) {
				stack.push(node);
				node = node.getLeftChild();
			}
			if (!stack.empty()) {
				/*��ջ������ջ*/
				node = stack.pop();
				visit(node);
				node = node.getRightChild();
			}
		}
	}

	public void inOrder2() {
		inOrder2(root);
	}

	/*
	 * Ҫ��֤����������Ӻ��Һ��ӷ���֮����ܷ��ʣ���˶�����һ���P���Ƚ�����ջ��
	 * �����P���������Ӻ��Һ��ӣ������ֱ�ӷ�������
	 * �ڻ���P�������ӻ����Һ��ӣ����������Ӻ��Һ��Ӷ��ѱ����ʹ��ˣ���ͬ������ֱ�ӷ��ʸý�㡣
	 * �������������������P���Һ��Ӻ�����������ջ�������ͱ�֤��ÿ��ȡջ��Ԫ�ص�ʱ��
	 * �������Һ���ǰ�汻���ʣ����Ӻ��Һ��Ӷ��ڸ����ǰ�汻���ʡ�
	 */
	public void postOrder2(TreeNode treeNode) {
		if (treeNode == null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = null;
		TreeNode pre = null;
		stack.push(treeNode);
		while (!stack.empty()) {
			node = stack.peek();
			if ((node.getLeftChild() == null && node.getRightChild() == null)
					|| (pre != null && (pre == node.getLeftChild() || pre == node.getRightChild()))) {
				visit(node);
				node = stack.pop();
				pre = node;
			} else {
				if (node.getRightChild() != null)
					stack.push(node.getRightChild());
				if (node.getLeftChild() != null)
					stack.push(node.getLeftChild());
			}

		}
	}

	public void postOrder2() {
		postOrder2(root);
	};

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setRoot(root);
		binaryTree.insert(5);
		binaryTree.insert(8);
		binaryTree.insert(20);
		binaryTree.insert(11);
		binaryTree.insert(22);
		binaryTree.postOrder2();
	}
}
