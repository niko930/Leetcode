import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] a = {10,4,6,2,1,5,3,8,7,9,11};
		System.out.println(Arrays.toString(a));
		quickSort(a,0,a.length-1);
		//		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void quickSort(int[] a, int start, int end) {
		if(start >= end) {
			return;
		}

		int i = start;
		int j = end;
		int key = a[start];

		while(i<j) {
			while(a[j]>=key && i<j) {
				j--;
			}
			while(a[i]<=key && i<j) {
				i++;
			}
			if(i<j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}

		}
		a[start] = a[i];
		a[i] = key;

		quickSort(a, start, i-1);
		quickSort(a, i+1, end);
	}

	private static void bubbleSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}


}
