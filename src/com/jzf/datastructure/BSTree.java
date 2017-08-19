package com.jzf.datastructure;

public class BSTree<E extends Comparable> {
	/*BSNode root;

	private static class BSNode<E extends Comparable> {
		E key;
		BSNode<E> left;
		BSNode<E> right;
		BSNode<E> parent;

		public BSNode(E key, BSNode<E> left, BSNode<E> right, BSNode<E> parent) {
			super();
			this.key = key;
			this.left = left;
			this.right = right;
			this.parent = parent;
		}

		public E getKey() {
			return key;
		}

		public void setKey(E key) {
			this.key = key;
		}

		public BSNode<E> getLeft() {
			return left;
		}

		public void setLeft(BSNode<E> left) {
			this.left = left;
		}

		public BSNode<E> getRight() {
			return right;
		}

		public void setRight(BSNode<E> right) {
			this.right = right;
		}

		public BSNode<E> getParent() {
			return parent;
		}

		public void setParent(BSNode<E> parent) {
			this.parent = parent;
		}

	}
	
	public void insert(E key){
		if(key!=null){
			insert(root,key);
		}
	}
	
	public void insert(BSNode<Comparable> root,E key){
		
		if(root!=null){
			root = new BSNode<Comparable>(key, null, null, null);
		}
		
		BSNode<Comparable> x = root;
		
		if(x.key.compareTo(key)<0){
			x = x.left;
		}else if(x.key.compareTo(key)>0){
			x = x.right;
		}else{
			root = new BSNode<Comparable>(key, left, right, parent)
		}
		 
	}*/
	
}
