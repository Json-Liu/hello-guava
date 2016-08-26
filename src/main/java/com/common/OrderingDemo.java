package com.common;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.mchange.lang.ObjectUtils;


/***
 ** @Author JosonLiu
 ** @Date 2016年7月28日
 ** @Version 1.0
 ***/
public class OrderingDemo<T> {
	public static void main(String[] args) {
		//test();
		test_userorder();
	}

	private static void test() {
		List<Integer> testList1 = Lists.newArrayList(1,3,2,5,4,6,4,5,8);
		Ordering<Comparable> natural = Ordering.natural();
		Collections.sort(testList1,Ordering.natural());//自然排序
		for (Integer each : testList1) {
			System.out.print(each+",");
		}
		System.out.println();
		List<String> testList2 = Lists.newArrayList("b","c","af","ae","g","f");
		Collections.sort(testList2,Ordering.usingToString());//按字典排序
		for (String each : testList2) {
			System.out.print(each+",");
		}
		System.out.println();
		List<Integer> testList3 = Lists.newArrayList(1,3,2,5,4,6,4,5,8);
		Collections.sort(testList3,Ordering.from( new Comparator<Integer>() {//从给定 Comparator转化为排序器
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);//降序
			}
			
		}));//自然排序
		for (Integer each : testList3) {
			System.out.print(each+",");
		}
		System.out.println();
		List<Integer> testList4 = Lists.newArrayList(1,3,2,5,4,6,4,5,8);
		Collections.sort(testList4,Ordering.from( new Comparator<Integer>() {//从给定 Comparator转化为排序器
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);//降序
			}
			/**
			 * reverse() 获取相反的排序器
			 */
		}).reverse());
		for (Integer each : testList4) {
			System.out.print(each+",");
		}
		System.out.println();
		/**
		 * nullsFirst() 使用当前排序器，但额外把null值排到最前面。
		 */
		List<Integer> testList5 = Lists.newArrayList(1,3,2,null);
		Collections.sort(testList5,Ordering.natural().nullsFirst());
		for (Integer each : testList5) {
			System.out.print(each+",");
		}
		System.out.println();
		/**
		 * nullsFirst() 使用当前排序器，但额外把null值排到最前面。
		 */
		List<Integer> testList6 = Lists.newArrayList(1,3,2,null);
		Collections.sort(testList6,Ordering.natural().nullsLast());
		for (Integer each : testList6) {
			System.out.print(each+",");
		}
		System.out.println();
	}
	static void test_userorder(){
		List<User> list = Lists.newArrayList(User.newInstance().setName("User1").setAge(100),
				User.newInstance().setName("User2").setAge(23),
				User.newInstance().setName("User3").setAge(46),
				User.newInstance().setName("User4"));
		Collections.sort(list,Ordering.from(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				Optional<Integer> age1 = Optional.fromNullable(o1.getAge());
				Optional<Integer> age2 = Optional.fromNullable(o2.getAge());
				return -age1.or(0).compareTo(age2.or(0));
			}
		}));
		for (User user : list) {
			System.out.println(user);
		}
	}
	static class User{
		private String name;
		private Integer age ;
		public String getName() {
			return name;
		}
		public User setName(String name) {
			this.name = name;
			return this ;
		}
		public Integer getAge() {
			return age;
		}
		public User setAge(Integer age) {
			this.age = age;
			return this ;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		User(){}
		public static User newInstance(){
			return new User();
		}
	}
}

