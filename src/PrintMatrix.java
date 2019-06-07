import java.util.ArrayList;
import java.util.Arrays;

public class PrintMatrix {
    /**
     * 顺时针打印矩阵
     *
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
     * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
     * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     */
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 0 || col == 0 || matrix == null) return null;
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0,
                right = col - 1,
                top = 0,
                bottom = row - 1;
        while (left <= right && top <= bottom) {
            //left to right
            for (int i = left; i <= right; i++)
                list.add(matrix[top][i]);
            //top to bottom
            for (int i = top + 1; i <= bottom; i++)
                list.add(matrix[i][right]);
            //right to left
            for (int i = right - 1; i >= left && top < bottom; i--)
                list.add(matrix[bottom][i]);
            //bottom to top
            for (int i = bottom - 1; i > top && left < right; i--)
                list.add(matrix[i][left]);
            left++;
            right--;
            top++;
            bottom--;
        }
        return list;
    }

    public static void main(String[] args) {
        PrintMatrix p = new PrintMatrix();
        int[][] aar = {{1, 2}, {3, 4}};
        p.printMatrix(aar);
    }
}
