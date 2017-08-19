package com.jzf.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		list.add(new User("lbj", 32));
		list.add(new User("dw", 35));
		list.add(new User("rose", 28));

		for (User user : list) {
			System.out.println(user);
		}
		
		System.out.println("----------------------");

		Collections.sort(list, new Comparator<User>() {

			@Override
			public int compare(User user1, User user2) {
				return user2.getAge() - user1.getAge();
			}
		});

		for (User user : list) {
			System.out.println(user);
		}

	}
}
