package com.jzf.offer.tree;

public class ListNodeClone {
	public RandomListNode Clone(RandomListNode pHead) {
		if(pHead == null)
			return null;
		
		RandomListNode node = pHead;
		RandomListNode head = pHead;
		
		/*复制链表的每个结点，并插入到被复制的结点之后*/
		while (node != null) {
			/* 插入复制的节点 */
			RandomListNode cloneNode = new RandomListNode(node.label);
			cloneNode.next = node.next;
			node.next = cloneNode;
			node = cloneNode.next;
		}
		
		/*复制random引用*/
		node = head;
		while (node != null) {
			RandomListNode cloneNode = node.next;
			// 如果原始节点存在random引用不为空
			if (node.random != null) {
				cloneNode.random = node.random.next;
			}
			node = cloneNode.next;
		}
		
		/*拆分链表得到复制链表*/
		node = head;
		RandomListNode cloneHead = head.next;
		RandomListNode cloneNode = head.next;
		while (node != null) {
			node.next = cloneNode.next;
			if(cloneNode.next!=null)
				cloneNode.next = cloneNode.next.next;
			node = node.next;
			cloneNode = cloneNode.next;
		}
		return cloneHead;
	}

	public RandomListNode cloneNode(RandomListNode pHead) {
		RandomListNode node = pHead;
		RandomListNode head = pHead;
		while (node != null) {
			/* 插入复制的节点 */
			RandomListNode cloneNode = new RandomListNode(node.label);
			cloneNode.next = node.next;
			node.next = cloneNode;

			node = cloneNode.next;
		}
		return head;
	}

	public RandomListNode cloneSiblingNode(RandomListNode pHead) {
		RandomListNode node = pHead;
		while (node != null) {
			RandomListNode cloneNode = node.next;
			// 如果原始节点存在random引用不为空
			if (node.random != null) {
				cloneNode.random = node.random.next;
			}
			node = cloneNode.next;
		}
		return pHead;
	}

	public RandomListNode reconnectNode(RandomListNode pHead) {
		if (pHead == null)
			return null;

		RandomListNode node = pHead;
		RandomListNode cloneHead = pHead.next;
		RandomListNode cloneNode = pHead.next;

		while (node != null) {
			node.next = cloneNode.next;
			cloneNode.next = cloneNode.next.next;
			node = node.next;
			cloneNode.next = cloneNode.next;

		}

		return cloneHead;
	}
}

class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label) {
		this.label = label;
	}
}
