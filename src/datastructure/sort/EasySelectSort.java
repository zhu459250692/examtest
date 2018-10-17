package datastructure.sort;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class EasySelectSort {
	private Integer[] integers;

	// 选最小的，和前面的交换
	public static void EasySelectSort(Integer[] a) {
		int min;
		int j;
		Integer tmp;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (j = i; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			tmp = a[min];
			a[min] = a[i];
			a[i] = tmp;
		}
	}

	@Before
	public void init() {
		Integer[] integers = { 999, 1, 3, 9, 4, 56, 43, 23, 4, 34, 33, 2, 454, 5 };
		this.integers = integers;
	}

	@Test
	public void insertSortTest() {
		System.out.println(Arrays.toString(integers));
		BubbleSort.bubbleSort(integers);
		System.out.println(Arrays.toString(integers));
	}
}
