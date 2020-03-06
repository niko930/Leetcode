public class simpleGame {
    /**
     * 来源知乎
     * 你有机会玩一个游戏,玩一次得到5000元但是有百万分之一的几率死去,问玩几次
     */
    public static void main(String[] args) {

        Long money = 5000L;   //5000元
        int nums = 1000;    //1000人
        int counts = 0;
        for(int i=0;i<nums;i++){
            Long moneys = 0L;
            int count = 0;
            do{
                moneys += money;
                count++;
            }while((int) (Math.random()*1000000) != 0);
            counts += count;
            System.out.println("第"+i+"个人的钱为:"+moneys+" ,他玩了"+count+"次");
        }
        System.out.println("平均次数"+counts/1000);
    }

}
