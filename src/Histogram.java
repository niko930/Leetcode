/**
 * 背景中最大的矩形
 * 想象一下拍摄的照片用于广告。
 * 动机左侧的背景是发白的，你想在那个背景上写一些文字。
 * 因此，您使用高分辨率扫描仪扫描照片，并且对于每一行，计算左侧的足够白色且适合书写的像素数。
 * 您的工作是找到可放置在这些像素上的最大文本框的区域。
 *
 * https://www.codewars.com/kata/595db7e4c1b631ede30004c4/train/java
 */
public class Histogram {

    private final int[] values;

    public Histogram(int... values) {
        this.values = values;
    }

    public long largestRect() {
        // Your code here
        if(values.length == 0 || values == null) return 0;

        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if(values[i] < 20){
                System.out.println(values[i]);
            }

            if (values[i] < min) {
                min = values[i];
            }
        }
        Long area = min * values.length * 1L;
        System.out.println("area=" + area);
        int l;
        int w = 0;
        for (int i = 0; i < values.length; i++) {
            System.out.println("第"+i+"次循环");
            int top = i;
            if (i > 0) {
                while (top > 0 && values[top-1] > values[i]) {
                    top--;
                }
            }

            System.out.println("top=" + top);

            int low = i;
            while (low < values.length && values[low] >= values[i]) {
                low++;
            }
            System.out.println("low=" + low);


            w = low - top;
            l = values[i];
            System.out.println("w=" + w);
            System.out.println("l=" + l);
            Long index = 1L * l * w;
            if (index > area) {
                area = index;
//                i = low-1;
            }

        }

        return area;
    }

    public static void main(String[] args) {
        long l = new Histogram(6, 2, 5, 4, 5, 1, 6).largestRect();
        System.out.println(l);
    }

}