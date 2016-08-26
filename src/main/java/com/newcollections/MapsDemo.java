package com.newcollections;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.common.base.Function;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Multimap;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.TreeMultimap;
import com.google.common.collect.MapDifference.ValueDifference;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.primitives.Ints;

/***
 ** @Author JosonLiu
 ** @Date 2016年7月28日
 ** @Version 1.0
 ***/
public class MapsDemo {
	public static void main(String[] args) {
		test_Base();
		//test_MultiMap();
		//Maps.u
	}
	/**
	 * 基础测试
	 */
	private static void test_Base() {
		/**
		 * Maps.uniqueIndex(Iterable,Function)
		 * 通常针对的场景是：有一组对象，它们在某个属性上分别有 独一无二 的值，而我们希望能够按照这个属性值查找对象 
		 * 
		 */
		List<User> testList = Lists.newArrayListWithCapacity(5);
		for (int i = 0; i < 5; i++) {
			User eachUser = new User();
			eachUser.setUid(i+5);
			eachUser.setName("User"+i);
			testList.add(eachUser);
		}
		Map<Integer, User> testMap = Maps.uniqueIndex(testList, 
				/**
				 * Function<F,T> F:Map中 的Value 通过它来产生 对应的Key    T:Key的类型
				 */
				new Function<User,Integer>() {
					@Override
					public Integer apply(User user){
						return user.getUid();
					}
		});
		print(testMap);
		printDivision();
		/**
		 * Multimaps.index(Iterable, Function)通常针对的场景是：有一组对象，它们有共同的特定属性，我们希望按照这个属性的值查询对象，但属性值 不一定是独一无二的。
		 */
		for (int i = 0; i < 5; i++) {
			User eachUser = new User();
			eachUser.setUid(i+5);
			eachUser.setName("User-"+i);
			testList.add(eachUser);
		}
		ImmutableListMultimap<Integer,User> indexMaps = Multimaps.index(testList, new Function<User, Integer>() {
			@Override
			public Integer apply(User user){
				return user.getUid();
			}
		});
		System.out.println(ToStringBuilder.reflectionToString(indexMaps.get(5).size()));
		ImmutableMap<Integer, Collection<User>> immutableMap = indexMaps.asMap();
		print(immutableMap);
		printDivision();
		/**
		 * Maps.difference(Map, Map)用来比较两个Map以获取所有不同点。该方法返回MapDifference对象，把不同点的维恩图分解为：
		 * entriesInCommon()	两个Map中都有的映射项，包括匹配的键与值
		 * entriesDiffering() 键相同但是值是不同的映射项，返回的Map的值类型为MapDifference.ValueDifference，以表示左右两个不同的值
		 * entriesOnlyOnLeft() 键只存在于左边的Map的映射项
		 * entriesOnlyOnRight() 键只存在于右边 Map 的映射项
		 */
		Map<Integer, String> left = ImmutableMap.of(1,"a",2,"2b",3,"3c",4,"4d");
		Map<Integer, String> right = ImmutableMap.of(1,"a",3,"3b",5,"5c",7,"7d");
		MapDifference<Integer, String> diff = Maps.difference(left, right);
		Map<Integer, String> entriesInCommon = diff.entriesInCommon();
		print(entriesInCommon);
		printDivision();
		Map<Integer, ValueDifference<String>> entriesDiffering = diff.entriesDiffering();
		print(entriesDiffering);
		printDivision();
		Map<Integer, String> entriesOnlyOnLeft = diff.entriesOnlyOnLeft();
		print(entriesOnlyOnLeft);
		printDivision();
		Map<Integer, String> entriesOnlyOnRight = diff.entriesOnlyOnRight();
		print(entriesOnlyOnRight);
		printDivision();
		/**
		 * invertFrom
		 * 鉴于Multimap可以把多个键映射到同一个值（译者注：实际上这是任何map都有的特性），也可以把一个键映射到多个值，反转Multimap也会很有用。
		 * Guava 提供了invertFrom(Multimap toInvert,Multimap dest)做这个操作，并且你可以自由选择反转后的Multimap实现。
		 * 注：如果你使用的是ImmutableMultimap，考虑改用ImmutableMultimap.inverse()做反转。
		 */
		Multimap<String, Integer> multimap = ArrayListMultimap.create();
		multimap.putAll("b", Ints.asList(2,4,6));
		multimap.putAll("a", Ints.asList(4,3,1));
		multimap.putAll("c", Ints.asList(2,3,1));
		//TODO : 例子待定
	}
	/**
	 * 遍历Map
	 * @param map
	 */
	private static <K, V> void print(Map<K, V> map){
		for (Map.Entry<K, V> each : map.entrySet()) {
			System.out.println("Key:"+each.getKey()+" Value:"+each.getValue());
		}
	}
	/**
	 * 打印分割线
	 */
	private static void printDivision(){
		System.out.println("-----------------------我是分割线--------------------------");
	}
	private static void test_MultiMap(){
		Multimap<Integer, String> multimap = ArrayListMultimap.create();
		for (int i = 0; i < 5; i++) {
			multimap.put(i, String.valueOf(i));
		}
		for (int i = 0; i < 5; i++) {
			multimap.put(i, String.valueOf(i));
		}
		print(multimap.asMap());
	}
}
class User{
	private Integer uid;
	private String name ;
	public User(){}
	public User(Integer uid,String name){
		this.uid = uid;
		this.name = name;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
}
