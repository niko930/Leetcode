public class CountingDuplicates {
    /**
     * 计算重复数
     *
     * 编写一个函数，返回输入字符串中出现多次的不区分大小写的字母字符和数字的计数。可以假定输入字符串只包含字母（大写和小写）和数字。
     */
    private static int duplicateCount(String text) {
        text = text.toLowerCase();
        int count = 0;
        while(text.length() > 0){
            String checkStr = text.substring(0,1);
            text = text.substring(1);
            if(text.contains(checkStr)){
                count++;
                text = text.replace(checkStr,"");
            }
        }
        return count;
    }

}
