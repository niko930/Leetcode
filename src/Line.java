public class Line {
    public static void main(String[] args) {
        int[] ints = {25, 25, 50};
        String tickets = Line.Tickets(ints);
        System.out.println(tickets);

    }


    private static String Tickets(int[] peopleInLine) {

        int count25 = 0;
        int count50 = 0;
        for (int i : peopleInLine) {
            switch (i){
                case 25:
                    count25++;
                    break;
                case 50:
                    count25--;
                    count50++;
                    break;
                case 100:
                    if(count50 > 0){
                        count25--;
                        count50--;
                    }else{
                        count25-=3;
                    }
                    break;
            }
            if(count25<0 || count50<0)return "NO";
        }
        return "YES";
    }
}
