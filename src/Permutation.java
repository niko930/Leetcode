import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> Permutation(String str) {
        PermutationHelper(str.toCharArray(), 0, str.length()-1);
        Collections.sort(list);
        return list;
    }

    private void PermutationHelper(char[] chars, int start, int end) {
        if(start == end) {
            StringBuilder s = new StringBuilder();
            for (char c : chars) {
                s.append(c);
            }
            if(!list.contains(s.toString())){
                list.add(s.toString());
            }
            return;
        }

        for(int i=start;i<=end;i++) {
            swap(chars,i,start);
            PermutationHelper(chars, start+1, end);
            swap(chars,i,start);
        }
    }

    private static void swap(char[] chars, int i, int start) {
        char temp = chars[i];
        chars[i] =chars[start];
        chars[start] = temp;
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        ArrayList<String> a = permutation.Permutation("abc");
        System.out.println(a.toString());
    }
}
