public class LongestSlideDown {
    /**
     * 找出一条从塔尖往下滑的通道，这条通道所有数字相加是最大的。
     */
    private static int longestSlideDown(int[][] pyramid) {
        for (int i = pyramid.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                pyramid[i - 1][j] += Math.max(pyramid[i][j], pyramid[i][j + 1]);
            }
        }
        return pyramid[0][0];
    }

    public static void main(String[] args) {
        int[][] a = {
                {75},
                {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10},
                {20, 4, 82, 47, 65},
                {19, 1, 23, 75, 3, 34},
                {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
                {41, 41, 26, 56, 83, 40, 80, 70, 33},
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23},
        };
        int longestSlideDown = LongestSlideDown.longestSlideDown(a);
        System.out.println(longestSlideDown);
    }
}
