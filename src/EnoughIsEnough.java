import java.util.*;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        int[] zeroArr = {};
        if (elements.length == 0 || maxOccurrences < 1) {
            return zeroArr;
        }
        // System.out.println(Arrays.toString(elements));
        List<Integer> nums = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            if (map.containsKey(elements[i])) {
                // check count
                int count = map.get(elements[i]);
                map.put(elements[i], count + 1);

                if (count < maxOccurrences) {
                    nums.add(elements[i]);
                }
            } else {
                map.put(elements[i], 1);
                nums.add(elements[i]);
            }

        }
        return nums.stream().mapToInt(i->i).toArray();

    }

    public static void main(String[] args) {
        int[] ints = EnoughIsEnough.deleteNth(new int[]{20, 37, 20, 21}, 1);
        System.out.println(Arrays.toString(ints));
    }

}
