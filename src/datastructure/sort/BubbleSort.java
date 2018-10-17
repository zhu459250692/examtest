package datastructure.sort;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class BubbleSort {
	private Integer[] integers;

	// ����Ӧ���ǵ����ģ����ݼ���ʱ�򽻻���
	public static void bubbleSort(Integer[] a) {
		int i = a.length - 1;
		int j;
		Integer tmp;
		for (; i > 1; i--) {
			for (j = 0; j < i; j++) {
				// ÿ�αȽ����ڵ�����
				if (a[j] > a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
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
