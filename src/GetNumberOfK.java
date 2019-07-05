public class GetNumberOfK {
    /**
     * 数字在排序数组中出现的次数
     *
     * 统计一个数字在排序数组中出现的次数。
     */
    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        for(int i:array){
            if(i == k)count++;
        }
        return count;
    }
}
