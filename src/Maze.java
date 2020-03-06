import java.util.ArrayList;
import java.util.List;

public class Maze {

    public enum body{
    }

    public static List<Character> escape(char[][] maze) {
        List<Character> list = new ArrayList<>();

        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                if(maze[i][j] == '^' || maze[i][j] == '>' || maze[i][j] == 'v' || maze[i][j] == '<'){

                }
            }
        }


        return null;
    }

    public static void main(String[] args) {
        char[][] chars = new char[][]{
                "##########".toCharArray(),
                "#        #".toCharArray(),
                "#  ##### #".toCharArray(),
                "#  #   # #".toCharArray(),
                "#  #^# # #".toCharArray(),
                "#  ### # #".toCharArray(),
                "#      # #".toCharArray(),
                "######## #".toCharArray()
        };
        List<Character> escape = Maze.escape(chars);
        System.out.println(escape);
    }
}
