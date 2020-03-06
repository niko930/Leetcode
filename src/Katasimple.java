public class Katasimple {

    public static void main(String[] args) {

    }

    public static int kata(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
            if(arr[i] == 2 && arr[i+2] == 4){
                return arr[i+1];
            }
        }
        return -1;
    }

}
