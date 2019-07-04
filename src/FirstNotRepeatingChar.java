public class FirstNotRepeatingChar {
    /**
     * 第一个只出现一次的字符
     *
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中
     * 找到第一个只出现一次的字符,并返回它的位置,
     * 如果没有则返回 -1（需要区分大小写）.
     */
    public int FirstNotRepeatingChar(String str) {
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(str.indexOf(chars[i]) == str.lastIndexOf(chars[i])){
                return i;
            }
        }
        return -1;
    }
}
