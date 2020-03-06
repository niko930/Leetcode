public class PlayPass {

    /**
     * 将每个字母移动一个给定的数字，但转换后的字母必须是一个字母（循环移位），
     * 将每个数字替换为9，
     * 保持非字母和非数字字符，
     * 将每个字母置于奇数位置，将每个字母置于偶数位置（第一个字符位于0位置），
     * 扭转整个结果。
     *
     * your text: "BORN IN 2015!", shift 1
     *
     * 1 + 2 + 3 -> "CPSO JO 7984!"
     *
     * 4 "CpSo jO 7984!"
     *
     * 5 "!4897 Oj oSpC"
     *
     *
     * "!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1
     *
     *
     * "4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO",
     * 				PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2
     */
    private static String playPass(String s, int n) {
        s = s.toUpperCase();
        System.out.println(s);
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++) {
//            if(String.valueOf(chars[i]).equals(" ")){
//                chars[i] = ' ';
//            }
            if(Character.isDigit(chars[i])){
                chars[i] = (char)(105-(chars[i]));
            }
            if(i%2 == 0){
                if(Character.isUpperCase(chars[i])){
                    chars[i] = (char)((chars[i]+n > 90) ? (chars[i]+n-26):(chars[i]+n));
                }
            }else{
                if(Character.isUpperCase(chars[i])){
                    chars[i] = (char)(((chars[i]+n > 90) ? (chars[i]+n-26):(chars[i]+n)) + 32);
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i=chars.length-1;i>=0;i--){
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015";
        int n = 2;
        String s1 = PlayPass.playPass(s, n);
        System.out.println(s1);
    }
}
