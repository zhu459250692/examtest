package datastructure.sort;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SheelSort {
	private Integer[] integers;

	public static void shellSort(Integer[] a, int shell) {
		int j;
		Integer tmp;
		for (; shell >= 1; shell = shell >> 1) {
			// i=1和0都一样？
			for (int i = 1; i < a.length; i = i + shell) {
				// j - shell >= 0;这句不一样
				for (j = i; j - shell >= 0; j = j - shell) {
					if (a[j] < a[j - shell]) {
						tmp = a[j];
						a[j] = a[j - shell];
						a[j - shell] = tmp;
					}
				}
			}
		}
	}

	@Before
	public void init() {
		Integer[] integers = { 999, 1, 1, 2, 1, 2, 1, 3, 9, 4, 56, 43, 23, 4, 34, 33, 2, 454, 5 };
		this.integers = integers;
		// 逆序
		// [999, 454, 56, 43, 34, 33, 23, 9, 5, 4, 4, 3, 2, 1]
		// 正序
		// [1, 2, 3, 4, 4, 5, 9, 23, 33, 34, 43, 56, 454, 999]
	}

	@Test
	public void shellSort() throws Exception {
		SheelSort.shellSort(integers, 4);
		System.out.println(Arrays.toString(integers));
	}

}
