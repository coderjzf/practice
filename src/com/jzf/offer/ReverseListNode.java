package com.jzf.offer;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

/*
 * 题目描述 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class ReverseListNode {
	public ListNode ReverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;// next指向下一个节点
			head.next = pre;// 当前节点的next指针指向前一个节点
			pre = head;// 前一个节点指向当前节点
			head = next;// head移动到下一个节点
		}
		return pre;
	}

}
