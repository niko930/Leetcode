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
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];

        for(int i=0;i<array.length;i++){
            int temp = sum - array[i];
            if(map.containsKey(temp)){
                int res = result[0]*result[1];
                if(res == 0){
                    result[0] = array[i] < array[map.get(temp)] ? array[i] : array[map.get(temp)];
                    result[1] = array[i] > array[map.get(temp)] ? array[i] : array[map.get(temp)];
                }
                if(res != 0 && res > array[i] * array[map.get(temp)]){
                    result[0] = array[i] < array[map.get(temp)] ? array[i] : array[map.get(temp)];
                    result[1] = array[i] > array[map.get(temp)] ? array[i] : array[map.get(temp)];
                }
            }else{
                map.put(array[i], i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<result.length;i++){
            if(result[i] != 0){
                list.add(result[i]);
            }
        }
        return list;
    }
}
