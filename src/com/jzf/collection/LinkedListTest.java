package com.jzf.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListTest {
	/*˫��ѭ������List*/
	public static List<Integer> removeDuplicate(List<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = list.size() - 1; j > i; j--) {
				if (list.get(j).equals(list.get(i))) {
					list.remove(j);
				}
			}
		}
		return list;
	}
	
	/*ͨ��HashSetȥ��*/
	public static List<Integer> removeDuplicateWithHashSet(List<Integer> list) {
		HashSet<Integer> h = new HashSet<Integer>(list);//��List�е�Ԫ��ȫ����ӵ�HashSet��
		list.clear();//���ԭList
		list.addAll(h);//��HashSet�е�Ԫ��ȫ����ӵ�List��
		return list;
	}
	
	/*ͨ��List��contains����ȥ��*/
	public static List<Integer> removeDuplicateWithContains(List<Integer> list){
		List<Integer> newList = new ArrayList<>();
		for(Integer next:list){
			if(!newList.contains(next)){
				newList.add(next);
			}
		}
		list.clear();
		list.addAll(newList);
		return list;
	}
	
	/*ȥ�أ�������Ԫ��ԭ����˳��*/
	public static List<Integer> removeDuplicateKeepOrder(List<Integer> list) {
		List<Integer> newList = new ArrayList<>();
		Set<Integer> set = new HashSet<>();

		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer next = iterator.next();
			if (set.add(next)) {//�������set�����Ԫ�أ�˵�����ظ�
				newList.add(next);//������ظ�����Ԫ����ӵ��µ�list��
			}
		}
		list.clear();
		list.addAll(newList);
		return list;
	}

	public static void main(String[] args) {
		System.out.println(8>>>3);
	}
}
