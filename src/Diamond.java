public class Diamond {

    public static String print(int n) {
        if (n % 2 == 0 || n <= 0)
            return null;

        StringBuffer sb = new StringBuffer();

        int topForNum = (n + 1) / 2;
        for (int i = 1; i <= topForNum; i++) {
            int spaceNum = topForNum - i;
            for (int j = 1; j <= spaceNum; j++) {
                sb.append(" ");
            }
            int startNum = 2 * i - 1;
            for (int j = 1; j <= startNum; j++) {
                sb.append("*");
                if (j == startNum) {
                    sb.append("\n");
                }
            }
        }
        int lowForNum = (n - 1) / 2;
        for (int i = 1; i <= lowForNum; i++) {
            int spaceNum = i;
            for (int j = 1; j <= spaceNum; j++) {
                sb.append(" ");
            }
            int startNum = 2 * (topForNum - i) - 1;
            for (int j = 1; j <= startNum; j++) {
                sb.append("*");
                if (j == startNum) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        String print = Diamond.print(n);
        System.out.println(print);
    }
}
