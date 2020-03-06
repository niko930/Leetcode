public class TotalPoints {
    /**
     * 我们的足球队完成了冠军。每个匹配的结果看起来像“x：y”。所有比赛的结果都记录在集合中。
     * <p>
     * 例如： ["3:1", "2:2", "0:1", ...]
     * <p>
     * 编写一个能够进行此类收集的功能，并计算我们团队在锦标赛中的积分。每场比赛的积分计数规则：
     * <p>
     * 如果x> y - 3分
     * 如果x <y - 0点
     * 如果x = y - 1点
     * 笔记：
     * <p>
     * 冠军赛有10场比赛
     * 0 <= x <= 4
     * 0 <= y <= 4
     *
     * @param games ["3:1", "2:2", "0:1", ...]
     * @return 积分
     */
    public static int points(String[] games) {
        int score = 0;
        for (String s : games) {
            char x = s.charAt(0);
            char y = s.charAt(2);
            score += x > y ? 3 : x == y ? 1 : 0;
        }
        return score;
    }
}
