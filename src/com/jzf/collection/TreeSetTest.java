package com.jzf.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<User> treeSet = new TreeSet<>(new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				int i = o1.getAge()-o2.getAge();
				return i>0?-1:(i==0?0:1);
			}
		});
		treeSet.add(new User("lbj",32));
		treeSet.add(new User("dw",35));
		treeSet.add(new User("rose",28));
		
		
		
		for(User u : treeSet){
			System.out.println(u);
		}
	}

}
