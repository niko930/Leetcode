public class RandomNum {
	public static void main(String[] args) {

		int countOne = 0;
		int conutTwo = 0;
		int contThree = 0;
		int conutFour = 0;
		int countTime = 0;
		for(int i = 0;i<100000;i++) {
			countTime++;
			int random = (int) (Math.random()*100)+1;

			if(random <= 2) {
				countOne++;
			}else if(random <= 12){
				conutTwo++;
			}else if(random <= 32) {
				contThree++;
			}else {
				conutFour++;
			}
		}
		System.out.println("循环"+countTime+"次,中一等奖:"+countOne+"次,中二等奖:"+conutTwo+"次,中三等奖:"+contThree+"次,中四等奖:"+conutFour+"次");

	}
}
