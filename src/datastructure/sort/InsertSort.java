package datastructure.sort;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class InsertSort {
	/*
	 * ��һ�����ڱ�
	 */
	// ���ͷ���
	private Integer[] integers;

	public static void insertSort(Integer[] t) {
		int k;
		Integer tmp;
		for (int i = 1; i < t.length; i++) {
			k = i;
			// ����Ⱥ�λ�ò��ܴ��ң����ж��Ƿ���������
			while (k > 0 && t[k] < t[k - 1]) {
				tmp = t[k-1];
				t[k-1] = t[k];
				t[k] = tmp;
				k--;
			}
		}
	}

	public static void insertSortByBinSearch(Integer[] t) {
		int low;
		int high;
		int j;
		for (int i = 1; i < t.length; i++) {
			low = 0;
			high = i;
			int mid;
			// ����Ⱥ�λ�ò��ܴ��ң����ж��Ƿ���������
			while (low < high) {
				mid = (low + high) >> 1;
				if (t[i] < t[mid])
					high = mid - 1;
				else if (t[i] > t[mid])
					low = mid + 1;
			}
			for (j = i; j >= high + 2; --j)
				t[j] = t[j - 1];// ͳһ����ƶ�Ԫ�أ��ճ�����λ��
			t[high + 1] = t[0];// �������
		}
	}

	@Before
	public void init() {
		// 0, 1, 2, 3, 4, 4, 5, 9, 22, 23, 33, 33, 34, 43, 56, 454, 999
		// 0, 1, 2, 3, 4, 4, 5, 9, 22, 23, 33, 33, 34, 43, 56, 454, 999
		Integer[] integers = { 22, 0, 33, 999, 1, 3, 9, 4, 56, 43, 23, 4, 34, 33, 2, 454, 5 };
		this.integers = integers;
	}

	@Test
	public void insertSortTest() {
		System.out.println(Arrays.toString(integers));
		InsertSort.insertSort(integers);
		System.out.println(Arrays.toString(integers));
	}

}
