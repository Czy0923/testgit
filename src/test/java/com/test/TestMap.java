package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class TestMap {
	@Test
	public void testList1() {
		Student student = new Student("churui", 99);
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("churui", student);
		Student s = map.get("churui");
		System.out.println(s == student);
		System.out.println(s.score);
	}

	@Test
	public void testList2() {
		Student student = new Student("churui", 99);
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("churui", student);
		if (map.containsKey("churui")) {
			System.out.println(map.get("churui").score);
		}
	}

	@Test
	public void testList3() {
		Student student1 = new Student("churui1", 1);
		Student student2 = new Student("churui2", 2);
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("churui1", student1);
		map.put("churui2", student2);

		for (String string : map.keySet()) {
			Student student = map.get(string);
			System.out.println(student.score);
		}

	}

	@Test
	public void testList4() {
		Student student1 = new Student("churui1", 1);
		Student student2 = new Student("churui2", 2);
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("churui1", student1);
		map.put("churui2", student2);

		for (Entry<String, Student> entry : map.entrySet()) {
			System.out.println("key的数值是：" + entry.getKey() + ":value的数值是：" + entry.getValue().score);
		}

	}
}
