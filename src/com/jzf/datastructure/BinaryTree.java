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
	/* 递归遍历 */

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
	
	/*非递归遍历*/

	public void preOrder2(TreeNode treeNode) {
		if (treeNode == null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = treeNode;
		while (node != null || !stack.empty()) {
			// 将结点的左孩子依次输出并入栈
			while (node != null) {
				visit(node);
				stack.push(node);
				node = node.getLeftChild();
			}
			// 取得结点的右孩子
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
	 * 对于任一结点P，
	 * 
	 * 1)若其左孩子不为空，则将P入栈并将P的左孩子置为当前的P，然后对当前结点P再进行相同的处理；
	 * 
	 * 2)若其左孩子为空，则取栈顶元素并进行出栈操作，访问该栈顶结点，然后将当前的P置为栈顶结点的右孩子；
	 * 
	 * 3)直到P为NULL并且栈为空则遍历结束
	 */
	public void inOrder2(TreeNode treeNode) {
		if (treeNode == null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = treeNode;
		while (node != null || !stack.empty()) {
			/*将结点的左孩子依次入栈，暂不输出*/
			while (node != null) {
				stack.push(node);
				node = node.getLeftChild();
			}
			if (!stack.empty()) {
				/*将栈顶结点出栈*/
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
	 * 要保证根结点在左孩子和右孩子访问之后才能访问，因此对于任一结点P，先将其入栈。
	 * ①如果P不存在左孩子和右孩子，则可以直接访问它；
	 * ②或者P存在左孩子或者右孩子，但是其左孩子和右孩子都已被访问过了，则同样可以直接访问该结点。
	 * 若非上述两种情况，则将P的右孩子和左孩子依次入栈，这样就保证了每次取栈顶元素的时候，
	 * 左孩子在右孩子前面被访问，左孩子和右孩子都在根结点前面被访问。
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
