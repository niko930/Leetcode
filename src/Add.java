public class Add {
    /**
     * 不用加减乘除做加法
     * <p>
     * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
     */
    public int Add(int num1, int num2) {
        while(num1 != 0){
            int remp = num1 ^ num2;
            num1 = (num1&num2) << 1;
            num2 = remp;
        }
        return num2;
    }
}
