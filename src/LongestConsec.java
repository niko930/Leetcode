import java.util.*;

public class LongestConsec {
    public static void main(String[] args) {

        String[] str = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int a = 2;

        String s = LongestConsec.longestConsec(str, a);

        System.out.println("输出" + s);

    }

    private static String longestConsec(String[] strarr, int k) {

        int strarrLenth = strarr.length;
        if(strarrLenth == 0 || k > strarrLenth || k <= 0){
            return "";
        }

        List<String> list = new ArrayList<>();
        StringBuffer s1 = new StringBuffer();

        for(int i = 0; i < strarrLenth; i ++){
            if(i < (strarrLenth-(k-1)) ){
                for(int j = k; j > 0; j --){
                    s1.append(strarr[i - (j-k)]);
                    if(s1.length() != 0 && j == 1){
                        list.add(s1.toString());
                    }
                }
                s1.setLength(0);
            }
        }

        String temp = "";
        int num = 0;
        for(int j = 0; j < list.size(); j ++){
            String ss = list.get(j);
            if(list.get(j).length() > temp.length()){
                temp = list.get(j);
                num = j;
            }
        }
        return list.get(num);
    }

}
