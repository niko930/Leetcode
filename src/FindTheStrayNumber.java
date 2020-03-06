import java.util.Arrays;

public class FindTheStrayNumber {
    static int stray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));

        if(numbers[0] != numbers[1] && numbers[0] != numbers[2]){
            return numbers[0];
        }

        if(numbers[numbers.length-1] != numbers[numbers.length-2] && numbers[numbers.length-1] != numbers[numbers.length-2]){
            return numbers[numbers.length-1];
        }

        for(int i=1;i<numbers.length-1;i++){
            if(numbers[i] != numbers[i-1] && numbers[i] != numbers[i+1]){
                return numbers[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] ints = {1,1,2};
        int stray = stray(ints);
        System.out.println(stray);

    }

}
