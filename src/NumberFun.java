public class NumberFun {
    /**
     * 下一个平方数
     */
    public static long findNextSquare(long sq) {
        return  ((long) Math.sqrt(sq)) + 0.0 == Math.sqrt(sq) ? (long)Math.pow(Math.sqrt(sq)+1,2) : -1;
    }

    public static void main(String[] args) {
        long nextSquare = NumberFun.findNextSquare(100L);
        System.out.print(nextSquare);
    }
}
