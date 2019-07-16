public class Sum_Solution {
    /**
     * 求1+2+3+...+n
     *
     * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     */
    public int Sum_Solution(int n) {
        int res = n;
        boolean falg = (res > 0) && ((res+=Sum_Solution(--n)) > 0);
        return res;
    }
}
