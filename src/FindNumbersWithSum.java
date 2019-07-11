import java.util.ArrayList;
import java.util.HashMap;

public class FindNumbersWithSum {
    /**
     * 和为S的两个数字
     *
     * 题目描述
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     * 输出描述:
     * 对应每个测试案例，输出两个数，小的先输出。
     */
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = array.length - 1;
        while(i < j){
            if(array[i] + array[j] == sum){
                list.add(array[i]);
                list.add(array[j]);
                break;
            }
            while(i < j && array[i] + array[j] > sum){
                j--;
            }
            while(i < j && array[i] + array[j] < sum){
                i++;
            }
        }
        return list;
    }
}
