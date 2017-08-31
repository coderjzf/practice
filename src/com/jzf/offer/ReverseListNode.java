package com.jzf.offer;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

/*
 * ��Ŀ���� ����һ��������ת�����������������Ԫ�ء�
 */
public class ReverseListNode {
	public ListNode ReverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;// nextָ����һ���ڵ�
			head.next = pre;// ��ǰ�ڵ��nextָ��ָ��ǰһ���ڵ�
			pre = head;// ǰһ���ڵ�ָ��ǰ�ڵ�
			head = next;// head�ƶ�����һ���ڵ�
		}
		return pre;
	}

}
