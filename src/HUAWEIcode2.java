public class HUAWEIcode2 {
    /*给出数字n,k

    n的自我复制：n拼接自己k次得到一个新的数字p。 比如说 123 复制2次得到数字 123123。

    p的超级数字：p的各位相加得到 比如：123123 的超级数字1+2+3+1+2+3 =12。

    求： 实现函数 int getSuperDada( n，k ) 输入n，k 返回超级数字*/

    public static int getSuperDada(int n, int k) {
        StringBuffer sb = new StringBuffer();
        String s = String.valueOf(n);
        for(int i=0;i<k;i++){
            sb.append(s);
        }
        System.out.println(sb);
        int num = 0;
        for(int i=0;i<sb.length();i++){
            System.out.println(Integer.valueOf(sb.substring(i,i+1)));
            num += Integer.valueOf(sb.substring(i,i+1));
        }
        return num;
    }

    public static void main(String[] args) {
        int superDada = getSuperDada(1234, 2);
        System.out.println(superDada);
    }
}
