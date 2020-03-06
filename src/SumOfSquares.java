public class SumOfSquares {
    /**
     * 任务简单明了。给定一个整数n（），找到加起来的最小正方形列表的长度。想出最好的算法吧; 你需要它！3 < n < 109n
     * <p>
     * 例子：
     * <p>
     * sum_of_squares(17) = 2
     * 17 = 16 + 1（4和1是完美的正方形）。
     * sum_of_squares(15) = 4
     * 15 = 9 + 4 + 1 + 1.无法将15表示为三个完美正方形的总和。
     * sum_of_squares(16) = 1
     * 16本身就是一个完美的正方形。
     */
    public static int nSquaresFor(int n) {
        int j = (int) Math.sqrt(n);
        if (j * j == n) return 1;

        for (int i = 1; i * i <= n; i++) {
            j = (int) Math.sqrt(n - i * i);
            if (j * j == (n - i * i)) return 2;
        }
        while (n % 4 == 0) n /= 4;
        if (n % 8 == 7) return 4;
        return 3;
    }

    public static void main(String[] args) {
        SumOfSquares s = new SumOfSquares();
        int a = 2017;
        int i = s.nSquaresFor(a);
        System.out.println(i);
    }
}