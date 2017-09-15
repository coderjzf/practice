package com.jzf.offer.listnode;

public class ListNodeClone {
	public RandomListNode Clone(RandomListNode pHead) {
		if(pHead == null)
			return null;
		
		RandomListNode node = pHead;
		RandomListNode head = pHead;
		
		/*���������ÿ����㣬�����뵽�����ƵĽ��֮��*/
		while (node != null) {
			/* ���븴�ƵĽڵ� */
			RandomListNode cloneNode = new RandomListNode(node.label);
			cloneNode.next = node.next;
			node.next = cloneNode;
			node = cloneNode.next;
		}
		
		/*����random����*/
		node = head;
		while (node != null) {
			RandomListNode cloneNode = node.next;
			// ���ԭʼ�ڵ����random���ò�Ϊ��
			if (node.random != null) {
				cloneNode.random = node.random.next;
			}
			node = cloneNode.next;
		}
		
		/*�������õ���������*/
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
			/* ���븴�ƵĽڵ� */
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
			// ���ԭʼ�ڵ����random���ò�Ϊ��
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
