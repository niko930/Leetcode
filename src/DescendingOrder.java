public class DescendingOrder {
    /**
     * 您的任务是创建一个函数，该函数可以将任何非负整数作为参数，并以其降序返回数字。基本上，重新排列数字以创建尽可能高的数字。
     */
    private static int sortDesc(final int num) {
        String str = String.valueOf(num);
        int[] a = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            a[i] = Integer.valueOf(String.valueOf(str.charAt(i)));
        }

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - 1 - i; j++) {
                if (a[j] <= a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
        for (int i = 0; i < a.length; i++) sb.append(a[i]);

        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        int i = DescendingOrder.sortDesc(123455347);
        System.out.print(i);
    }
}
