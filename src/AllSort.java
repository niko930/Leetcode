public class AllSort {
	/**
	 * 全排列
	 */
	public static void main(String[] args){
		int[] a = {1,2,3};
		allSort(a,0,a.length-1);
	}

	private static void allSort(int[] a, int start, int end) {
		if(start == end) {
			for (int i : a) {
				System.out.print(i);
			}
			System.out.println();
			return;
		}
		
		for(int i=start;i<=end;i++) {
			swap(a,i,start);
			allSort(a, start+1, end);
			swap(a,i,start);
		}
	}

	private static void swap(int[] a, int i, int start) {
		int temp = a[i];
		a[i] =a[start];
		a[start] = temp;
	}
}
