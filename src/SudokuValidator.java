import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {
	/**
	 * 九宫格校验
	 */
	public static void main(String[] args) {

		int[][] a = {
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 }

		};
		boolean check = SudokuValidator.check(a);
		System.out.println("main check=" + check);
	}

	public static boolean check(int[][] sudoku) {
		boolean bRow = checkRow(sudoku);
		boolean bLi = checkLi(sudoku);
		boolean bs = checkSquares(sudoku);

		return bRow && bLi && bs;
	}

	public static boolean checkSquares(int[][] sudoku) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 9; i++) {
			set.clear();
			int a = i%3*3;
			int c = a+2;
			int b = i/3*3;
			int d = b+2;
			for(int j=a;j<=c;j++) {
				for(int k=b;k<=d;k++) {
					set.add(sudoku[j][k]);
				}
			}
			if(set.size() != 9) {
				return false;
			}
		}
		return true;
	}
	
	// 每一列
	private static boolean checkLi(int[][] sudoku) {
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < sudoku.length; i++) {
			set.clear();
			for(int j=0;j<9;j++) {
				set.add(sudoku[i][j]);
			}
			if (set.size() != 9)
				return false;
		}
		return true;
	}

	// 每一行
	private static boolean checkRow(int[][] sudoku) {
		Set<Integer> set = new HashSet<Integer>();
		for (int[] su : sudoku) {
			set.clear();
			for (int i : su) {
				set.add(i);
			}
			if(set.size() != 9) {
				return false;
			}
		}
		return true;
	}
}
