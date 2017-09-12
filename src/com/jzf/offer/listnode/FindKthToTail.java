package com.jzf.offer.listnode;

/*题目描述
输入一个链表，输出该链表中倒数第k个结点 
倒数第k个结点，即顺数第n-(k-1)个结点
1.两个指针，都指向头节点。
2.先让一个指针移动k-1步，再让两个指针同时移动，直到第一个指针移动到尾结点，此时第二个指针移动到第n-(k-1)个结点
*/
public class FindKthToTail {
	/* 三种特殊情况：head为空，k=0和k大于链表结点总数 */
	public ListNode findKthToTail(ListNode head, int k) {
		if (head == null || k == 0) {
			return null;
		}

		ListNode node = head;
		ListNode node2 = head;

		// node先移动到从头节点开始的k结点处，即先走k-1
		for (int i = 1; i <= k - 1; i++) {
			// 第三种情况，k大于链表结点总数，直接返回null
			if (node.next == null) {
				return null;
			}
			node = node.next;
		}
		// node与node2同时遍历，当node遍历到尾结点时，node2移动到顺数第n-(k-1)个结点处，即倒数第k个结点处
		while (node.next != null) {
			node = node.next;
			node2 = node2.next;
		}
		return node2;
	}
}
