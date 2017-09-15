package com.jzf.offer.listnode;

/*��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣
 *���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
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
				// ���û�н���ظ� ��������
				preNode = node;
				node = node.next;
			} else {
				//����н���ظ�
				int val = node.val;
				// nextNode����һ�����ظ��Ľ��
				while (nextNode != null && nextNode.val == val) {
					node = node.next;
					nextNode = node.next;
				}
				// ���ͷ������ظ����
				if (preNode == null) {
					pHead = nextNode;
				} else {
					// preNodeָ����һ�����ظ��Ľ��
					preNode.next = nextNode;
				}
				//�����һ�����ظ��Ľ�㲻Ϊ��
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
