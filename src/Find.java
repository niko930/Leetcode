public class Find {
    /**
     * 二维数组中的查找
     *
     * 题目描述
     * 在一个二维数组中（每个一维数组的长度相同），
     * 每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0){
            return false;
        }
        int row = array.length;
        int col = array[0].length;
        int x = 0;
        int y = row - 1;
        while(x < col && y >= 0){
            if(array[y][x] == target){
                return true;
            }else if(array[y][x] > target){
                y--;
            }else{
                x++;
            }
        }
        return false;
    }
}
