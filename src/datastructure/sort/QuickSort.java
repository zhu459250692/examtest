package datastructure.sort;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class QuickSort {
	private Integer[] integers;

	public static void quickSort(Integer[] a, int from, int to) {
		if (to - from <= 0)
			return;
		int i = from;
		int j = to;
		int mid = a[from];
		while (i < j) {
			while (i < j && a[j] > mid)
				j--;
			if (i < j) {
				a[i++] = a[j];
			}
			while (i < j && a[i] < mid)
				i++;
			if (i < j) {
				a[j--] = a[i];
			}
		}
		// low==high,i==j
		a[i] = mid;
		quickSort(a, from, j - 1);
		quickSort(a, j + 1, to);
	}

	@Before
	public void init() {
		Integer[] integers = { 999, 1, 3, 9, 1, 56, 7, 77, 1, 88, 1, 4, 56, 43, 23, 4, 34, 33, 2, 454, 5 };
		this.integers = integers;
		// ÄæÐò
		// [999, 454, 56, 43, 34, 33, 23, 9, 5, 4, 4, 3, 2, 1]
		// ÕýÐò
		// [1, 2, 3, 4, 4, 5, 9, 23, 33, 34, 43, 56, 454, 999]
	}

	@Test
	public void quickSort() throws Exception {
		QuickSort.quickSort(integers, 0, integers.length - 1);
		System.out.println(Arrays.toString(integers));
	}
}
