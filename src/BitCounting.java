public class BitCounting {
    /**
     * 编写一个以整数作为输入的函数，并返回该数字的二进制表示中等于1的位数。您可以保证输入是非负的。
     */
    public static int countBits(int n) {
        int r = 0;        //记录余数
        int count = 0;    //1的次数
        while (n != 0) {
            r = n % 2;
            n = n / 2;
            if (r == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = BitCounting.countBits(854);
        System.out.println(num);

    }
}