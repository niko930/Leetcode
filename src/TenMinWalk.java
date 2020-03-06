public class TenMinWalk {
	/**
	 *	判断这个人是否走了10步路并且回到原地
	 */
	public static void main(String[] args) {

		char[] a = {'n', 's', 'w', 'e'};
		boolean valid = TenMinWalk.isValid(a);
		System.out.println(valid);
	}
	public static boolean isValid(char[] walk) {
		if(walk.length != 10)return false;
		int y = 0;
		int x = 0;
		for (char c : walk) {
			switch (c) {
			case 'w':x--;break;
			case 'e':x++;break;
			case 'n':y++;break;
			case 's':y--;break;
			}
		}
		return x==0 && y==0;
	}
}
