package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class TestList {

	@Test
	public void testList1() {
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		for (Integer integer : array) {
			System.out.println(integer);
		}
	}

	@Test
	public void testList2() {
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(0, 6);
		array.add(100, 6);

		for (Integer integer : array) {
			System.out.println(integer);
		}
	}

	@Test
	public void testList3() {
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(0, 6);
		array.remove(0);
		for (Integer integer : array) {
			System.out.println(integer);
		}
	}

	@Test
	public void testList4() {
		String string = new String();
		Integer integer = new Integer(1);
		List<Object> array = new ArrayList<Object>();
		array.add(string);
		array.add(integer);
		array.remove(integer);
		for (Object object : array) {
			System.out.println(object);
		}
	}

	@Test
	public void testList5() {
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(0, 6);
		array.remove(0);
		System.out.println(array.get(0));
		System.out.println("List集合大小为：" + array.size());
	}

	@Test
	public void testList6() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Integer> it = list.iterator();
		if (it.hasNext()) {
			Integer integer = it.next();
			System.out.println(it);
		}
	}

	@Test
	public void testList7() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Object[] arr = list.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
