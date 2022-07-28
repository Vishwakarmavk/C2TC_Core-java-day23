package com.acharya.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		Collection list =new ArrayList();
		list.add(100);
		list.add(10);
		list.add("one");
		list.add('c');
		list.add(null);
		list.add(10);
		System.out.println("List:"+list);
		

	}

}
