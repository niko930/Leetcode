public class Greed {
	public static void main(String[] args) {

		int[] a = {2,4,4,5,4};
		int greedy = Greed.greedy(a);

		System.out.println(greedy);
	}

	public static int greedy(int[] dice){
		int n[] = new int[7];
		for (int d : dice) n[d]++;
		return n[1]/3*1000 + n[1]%3*100 + n[2]/3*200 + n[3]/3*300 + n[4]/3*400 + n[5]/3*500 +  n[5]%3*50 + n[6]/3*600;
	}
}
