public class StrToInt {
    /**
     * 把字符串转换成整数
     * <p>
     * 题目描述
     * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
     * 但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
     * 数值为0或者字符串不是一个合法的数值则返回0。
     * <p>
     * 输入描述:
     * 输入一个字符串,包括数字字母符号,可以为空
     * 输出描述:
     * 如果是合法的数值表达则返回该数字，否则返回0
     */
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int start = 0;
        int tag = 1;
        char[] ch = str.toCharArray();
        if (ch[0] == '+') {
            start = 1;
            tag = 1;
        }
        if (ch[0] == '-') {
            start = 1;
            tag = -1;
        }
        int result = 0;
        for (int i = start; i < str.length(); i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                result = result * 10 + (ch[i] - '0');
            } else {
                return 0;
            }
        }
        return tag * result;
    }
}
