public class Snail {
    /**
     * 蜗牛旋转排序
     */
    public static int[] snail(int[][] array) {
        if (array[0].length == 0) return new int[0];
        int n = array.length;
        int[] answer = new int[n*n];
        int index=0;
        for (int i = 0; i<n/2; i++){
            for (int j = i; j < n-i; j++) answer[index++] = array[i][j];
            for (int j = i+1; j < n-i; j++) answer[index++] = array[j][n-i-1];
            for (int j = i+1; j < n-i; j++) answer[index++] = array[n-i-1][n-j-1];
            for (int j = i+1; j < n-i-1; j++) answer[index++] = array[n-j-1][i];
        }
        if (n%2 != 0) answer[index++] = array[n/2][n/2];
        return answer;
    }


    public static void main(String[] args) {
        int[][] array = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                        };
        int[] snail = Snail.snail(array);
        for(int i:snail){
            System.out.println(i);
        }
    }
}
