package com.jzf.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListTest {
	/*双重循环遍历List*/
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
	
	/*通过HashSet去重*/
	public static List<Integer> removeDuplicateWithHashSet(List<Integer> list) {
		HashSet<Integer> h = new HashSet<Integer>(list);//将List中的元素全部添加到HashSet中
		list.clear();//清空原List
		list.addAll(h);//将HashSet中的元素全部添加到List中
		return list;
	}
	
	/*通过List的contains方法去重*/
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
	
	/*去重，并保持元素原来的顺序*/
	public static List<Integer> removeDuplicateKeepOrder(List<Integer> list) {
		List<Integer> newList = new ArrayList<>();
		Set<Integer> set = new HashSet<>();

		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer next = iterator.next();
			if (set.add(next)) {//如果能向set中添加元素，说明无重复
				newList.add(next);//如果无重复，则将元素添加到新的list中
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
