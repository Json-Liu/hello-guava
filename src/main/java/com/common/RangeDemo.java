package com.common;

import static org.junit.Assert.*;

import com.google.common.collect.Range;

/*** 范围
 ** @Author JosonLiu
 ** @Date 2016年9月7日
 ** @Version 1.0
 **/
public class RangeDemo {
	public static void main(String[] args) {
		range_Demo();
	}
	private static void range_Demo(){
		Range<Integer> open = Range.open(1, 5);
		Range<Integer> closed = Range.closed(1, 5);
		Range<Integer> openClosed = Range.openClosed(1, 5);
		Range<Integer> closedOpen = Range.closedOpen(1, 5);
		/**
		 * 不包含两端
		 */
		assertFalse(open.contains(1));
		assertTrue(open.contains(3));
		assertFalse(open.contains(5));
		/**
		 * 包含两端
		 */
		assertTrue(closed.contains(1));
		assertTrue(closed.contains(3));
		assertTrue(closed.contains(5));
		/**
		 * 包含右端 不包含左端
		 */
		assertFalse(openClosed.contains(1));
		assertTrue(openClosed.contains(3));
		assertTrue(openClosed.contains(5));
		/**
		 * 包含左端不包含右端
		 */
		assertTrue(closedOpen.contains(1));
		assertTrue(closedOpen.contains(3));
		assertFalse(closedOpen.contains(5));
	}
}

