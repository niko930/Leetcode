import java.util.ArrayList;

public class FindNumsAppearOnce {
    /**
     * 数组中只出现一次的数字
     * <p>
     * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。
     */
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if(array == null || array.length < 2){
            return;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i : array){
            if(list.contains(i)){
                list.remove(new Integer(i));
            }else{
                list.add(i);
            }
        }
        if(list.size() == 2){
            num1[0] = list.get(0);
            num2[0] = list.get(1);
        }
    }

    public static void main(String[] args) {
        FindNumsAppearOnce f = new FindNumsAppearOnce();
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        f.FindNumsAppearOnce(new int[]{2,4,3,6,3,2,5,5}, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
