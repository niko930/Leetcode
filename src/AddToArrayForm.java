import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
    /**
     * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
     *
     * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
     */
    public List<Integer> addToArrayForm(int[] A, int K) {
        int cur = K;
        int i = A.length;

        List<Integer> list = new ArrayList<>();
        while(--i>=0 || cur>0){
            if(i>=0)
                cur += A[i];
            list.add(cur%10);
            cur/=10;
        }

        Collections.reverse(list);
        return list;

    }

    public static void main(String[] args) {
        AddToArrayForm a = new AddToArrayForm();
        List<Integer> integers = a.addToArrayForm(new int[]{2, 1, 5}, 806);
        System.out.println(integers);
    }
}
