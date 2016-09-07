package com.common;

import static org.junit.Assert.*;

import java.util.Map;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

/***Guava 中提供的散列函数
 ** @Author JosonLiu
 ** @Date 2016年9月7日
 ** @Version 1.0
 **/
public class HashDemo {
	public static void main(String[] args) {
		testEqual();
		testHashCode();
		test_getHashCode();
	}
	private static void test_getHashCode(){
		User user1 = new User();
		user1.setUid(50075120L);
		user1.setName("JosonLiu");
		user1.setAge(24);
		
		User user2 = new User();
		user2.setUid(50075120L);
		System.out.println(getHashCode(user1));
		System.out.println(getHashCode(user2));
	}
	private static Integer getHashCode(User user){
		HashFunction hashFunction = Hashing.sha256();
		HashCode hashCode = hashFunction.newHasher()
										.putString(user.getName() == null ? "" : user.getName(), Charsets.UTF_8)
										.putLong(user.getUid() == null ? 0L : user.getUid())
										.putInt(user.getAge() == null ? 0 : user.getAge())
										.hash();
		return hashCode.asInt();//或 hashCode.asLong()返回64位的值
		
	}
	private static void testHashCode(){
		Map<User, String> map = Maps.newHashMap();
		User user1 = new User();
		user1.setUid(50075120L);
		user1.setName("JosonLiu");
		user1.setAge(24);
		map.put(user1, user1.getName());
		User user2 = new User();
		user2.setUid(50075120L);
		assertTrue(map.containsKey(user2));//PS:如果没有重写 hashCode()函数  则会失败  所以重写了 equals 方法后一定要记得重写 hashCode 方法
		System.out.println(map.get(user2));
	}
	private static void testEqual(){
		User user1 = new User();
		User user2 = new User();
		user2.setUid(50075120L);
		user2.setName("user2");
		User user3 = new User();
		user3.setUid(50075120L);
		user3.setName("user3");
		assertFalse(user1.equals(user2));
		assertTrue(user2.equals(user3));
		System.out.println("success");
	}
	private static class User{
		private Long uid ;//用户UID
		private String name ;//用户姓名 
		private Integer age ;//用户年龄 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getUid() {
			return uid;
		}
		public void setUid(Long uid) {
			this.uid = uid;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		@Override
		public int hashCode() {
			return uid.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			if( this == obj ) return true ;
			if(  null == obj || getClass() != obj.getClass() ) return false ;
			User comparer = (User) obj;
			return comparer.getUid().equals( uid ) ;
		}
		
	}
}

