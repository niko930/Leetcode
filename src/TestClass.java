import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        for (Integer i : list ) {
            System.out.println(i);
        }

        list.forEach(item ->{
            System.out.println(item);
        });
    }
}
