package com.jzf.offer.listnode;

/*��Ŀ����
����һ����������������е�����k����� 
������k����㣬��˳����n-(k-1)�����
1.����ָ�룬��ָ��ͷ�ڵ㡣
2.����һ��ָ���ƶ�k-1������������ָ��ͬʱ�ƶ���ֱ����һ��ָ���ƶ���β��㣬��ʱ�ڶ���ָ���ƶ�����n-(k-1)�����
*/
public class FindKthToTail {
	/* �������������headΪ�գ�k=0��k�������������� */
	public ListNode findKthToTail(ListNode head, int k) {
		if (head == null || k == 0) {
			return null;
		}

		ListNode node = head;
		ListNode node2 = head;

		// node���ƶ�����ͷ�ڵ㿪ʼ��k��㴦��������k-1
		for (int i = 1; i <= k - 1; i++) {
			// �����������k����������������ֱ�ӷ���null
			if (node.next == null) {
				return null;
			}
			node = node.next;
		}
		// node��node2ͬʱ��������node������β���ʱ��node2�ƶ���˳����n-(k-1)����㴦����������k����㴦
		while (node.next != null) {
			node = node.next;
			node2 = node2.next;
		}
		return node2;
	}
}
