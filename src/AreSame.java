/**
 * 判断两个数组其中一个数组的子元素是否是另一个数组子元素的的平方
 */
public class AreSame {

    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        boolean comp = AreSame.comp(a, b);
        System.out.print(comp);
    }

    public static boolean comp(int[] a, int[] b) {
//        System.out.println("a=" + Arrays.toString(a));
//        System.out.println("b=" + Arrays.toString(b));

        if (a.length == 0 && b.length == 0) {
            return true;
        }

        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int c = a[i] * a[i];
//            System.out.println("c=" + c);

            for (int j = 0; j < b.length; j++) {
                if (c == b[j]) {
                    b[j] = -1;
//                    System.out.println("+++");
                    count++;
                }
            }

//            System.out.println("count=" + count);
            count++;
        }
        if (count >= a.length) {
            return true;
        }

        return false;
    }
}
