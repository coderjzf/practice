package com.jzf.java8;

import java.util.Arrays;

public class Lambda {
	public static void main(String[] args) {
		Arrays.asList("a","b","c").forEach( (e) -> System.out.print("..."));
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
		new Thread(()-> System.out.print("hello thread!")).start();
	}
}

