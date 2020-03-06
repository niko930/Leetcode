import java.util.ArrayList;
import java.util.List;

public class SmileFaces {
	/**
	 * 判断笑脸个数
	 */
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
		a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
		System.out.println(a.toString());
		int countSmileys = SmileFaces.countSmileys(a);
		
		System.out.println(countSmileys);
	}
	
	public static int countSmileys(List<String> arr) {
		int count = 0;
		for (String string : arr) {
			if(string.matches("^[:;][-~]?[\\)D]$")) {
				count++;
			}
		}
		return count;
	  }
}
