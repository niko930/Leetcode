public class RecursionTree {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		allSort(a,0,a.length-1);
		
		System.out.println(index);

	}
	
	static int index = 0;
	
	private static void allSort(int[] a, int start, int end) {
		if(start == end) {
			index++;
			return;
		}
		for(int i=start;i<=end;i++) {
			swap(a,i,start);
			allSort(a, start+1, end);
			swap(a,i,start);
		}
	
	}

	private static void swap(int[] a, int i, int start) {
		int j = a[i];
		a[i] = a[start];
		a[start] = j;
	}
}
