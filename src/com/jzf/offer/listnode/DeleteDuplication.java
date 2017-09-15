package com.jzf.offer.listnode;

/*在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 *例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class DeleteDuplication {
	public static ListNode deleteDuplication(ListNode pHead) {
		if (pHead == null || pHead.next == null)
			return pHead;
		ListNode preNode = null;
		ListNode node = pHead;
		while (node != null) {
			ListNode nextNode = node.next;
			boolean delete = false;
			if (nextNode != null && node.val == nextNode.val)
				delete = true;
			if (!delete) {
				// 如果没有结点重复 继续遍历
				preNode = node;
				node = node.next;
			} else {
				//如果有结点重复
				int val = node.val;
				// nextNode是下一个不重复的结点
				while (nextNode != null && nextNode.val == val) {
					node = node.next;
					nextNode = node.next;
				}
				// 如果头结点是重复结点
				if (preNode == null) {
					pHead = nextNode;
				} else {
					// preNode指向下一个不重复的结点
					preNode.next = nextNode;
				}
				//如果下一个不重复的结点不为空
				if (nextNode != null)
					node = nextNode;
			}
		}
		return pHead;
	}

	public static void main(String[] args) {
		ListNode pHead = new ListNode(1);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(2);
		ListNode fouth = new ListNode(2);
		ListNode fiveth = new ListNode(3);
		ListNode sixth = new ListNode(3);
		pHead.next = second;
		second.next = third;
		third.next = fouth;
		fouth.next = fiveth;
		fiveth.next = sixth;
		deleteDuplication(pHead);
	}
}
