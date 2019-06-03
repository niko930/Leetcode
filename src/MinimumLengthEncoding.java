
public class MinimumLengthEncoding {
    /**
     * 820. 单词的压缩编码
     * <p>
     * 给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
     * <p>
     * 例如，如果这个列表是 ["time", "me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes = [0, 2, 5]。
     * <p>
     * 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。
     * <p>
     * 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
     * <p>
     * 示例：
     * <p>
     * 输入: words = ["time", "me", "bell"]
     * 输出: 10
     * 说明: S = "time#bell#" ， indexes = [0, 2, 5] 。
     * <p>
     * 提示：
     * <p>
     * 1. 1 <= words.length <= 2000
     * 2. 1 <= words[i].length <= 7
     * 3. 每个单词都是小写字母 。
     */
    public int minimumLengthEncoding(String[] words) {
        //反转string数组里的子元素
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuffer(words[i]).reverse().toString();
        }
        //如果某个子元素包含另一个子元素并且下标是从0开始的,就把另一个子元素赋值为空
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length && j != i; j++) {
                if (words[i].indexOf(words[j]) == 0){
                    words[j] = "";
                    continue;
                }
                if(words[j].indexOf(words[i]) == 0)
                    words[i] = "";
            }
        }
        //所有不为空的子元素长度相加
        int len = 0;
        for(int i=0;i<words.length;i++){
            if(!"".equals(words[i]))
                len +=words[i].length()+1;
        }
        return len;
    }
}
