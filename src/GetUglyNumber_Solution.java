import java.util.ArrayList;

public class GetUglyNumber_Solution {
    /**
     * 丑数
     * <p>
     * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
     * 例如6、8都是丑数，但14不是，因为它包含质因子7。
     * 习惯上我们把1当做是第一个丑数。
     * 求按从小到大的顺序的第N个丑数。
     */
    public int GetUglyNumber_Solution(int index) {
        if (index < 7) {
            return index;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        int num = 1;
        list.add(num);
        while (list.size() < index) {
            num = Math.min(list.get(p2) * 2, Math.min(list.get(p3) * 3, list.get(p5) * 5));
            if (list.get(p2) * 2 == num) p2++;
            if (list.get(p3) * 3 == num) p3++;
            if (list.get(p5) * 5 == num) p5++;
            list.add(num);
        }
        return num;
    }
}
