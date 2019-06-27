public class MoreThanHalfNum_Solution {
    /**
     * 数组中出现次数超过一半的数字
     *
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     */
    public int MoreThanHalfNum_Solution(int [] array) {
        int n = array.length;
        if(n == 0) return 0;

        int num = array[0], count = 1;
        for(int i=1;i<n;i++){
            if(array[i] == num){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                num = array[i];
                count = 1;
            }
        }
        count = 0;
        for(int i=0;i<n;i++){
            if(array[i] == num){
                count++;
            }
        }
        return 2*count > n ? num : 0;
    }
}
