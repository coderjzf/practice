package com.jzf.offer.listnode;

/*��Ŀ����
���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������*/
public class MergeListNode {
	public static ListNode Merge(ListNode list1, ListNode list2) {
		ListNode mergeNode = null;
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		if (list1.val <= list2.val) {
			mergeNode = list1;
			mergeNode.next = Merge(list1.next, list2);
		} else {
			mergeNode = list2;
			mergeNode.next = Merge(list1, list2.next);
		}
		return mergeNode;
	}
}
