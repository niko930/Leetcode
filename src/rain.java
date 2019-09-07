public class rain {

    /**
     * 墙之间能存下多少水？
     *
     * 在这个图片中我们有不同高度的墙。这个图片由一个整数数组所代表，数组中的每个数是墙的高度。
     * 下边的图可以表示为数组{2,5,1,2,3,4,7,7,6}
     * 假如开始下雨了，那么墙之间的水坑能够装多少水呢？
     *
     *               _ _
     *              |7 7|_
     *     _        |    6|
     *    |5|      _|     |
     *    | |    _|4      |
     *   _| |  _|3        |
     *  |2  |_|2          |
     *  |____1____________|
     *   0 1 2 3 4 5 6 7 8
     *   
     */

    private static int maxRain(int[] arr) {
        int len = arr.length;
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
            len--;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                end = i;
                break;
            }
            len--;
        }
        if (len < 3) {
            return 0;
        }

        int res = (end - start - 1) * Math.min(arr[start], arr[end]);
        for (int i = start + 1; i < end; i++) {
            res -= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int res = rain.maxRain(new int[]{2,5,1,2,3,4,7,7,6});
        System.out.println("res=" + res);
    }
}
