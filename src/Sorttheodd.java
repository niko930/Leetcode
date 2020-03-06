import java.util.Arrays;

public class Sorttheodd {
	public static void main(String[] args) {
		int[] a = new int[] {29, 51, 2, 9, 58, 10, 16, 16};

		int[] sortArray = sortArray(a);
		System.out.println(Arrays.toString(sortArray));

	}

	public static int[] sortArray(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			forJ: for (int j = 0; j < array.length - i - 1; j++) {
				int count = 1;
				if (array[j] % 2 == 0 || array[j] == 0) {
					continue;
				}

				while (array[j + count] % 2 == 0 || array[j + count] == 0) {
					count++;
					if (j + count >= array.length - 1) {
						if ((j+count == array.length-1) && (array[j] > array[j + count]) && (array[j+count] % 2 != 0) && ( array[j + count] != 0)) {
							int temp = array[j];
							array[j] = array[j + count];
							array[j + count] = temp;
						}
						break forJ;
					}
				}

				if (array[j] > array[j + count]) {
					int temp = array[j];
					array[j] = array[j + count];
					array[j + count] = temp;
				}
			}
		}

		return array;
	}
}
