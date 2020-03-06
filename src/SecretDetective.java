import java.util.ArrayList;
import java.util.List;

/**
 * 给出一串字母其中三个子元素按先后顺序排列的几个集合,求这串字母
 */
public class SecretDetective {
	public static void main(String[] args) {
		String s = "whatisup";

		char[][] a = {
				{'t','u','p'},
				{'w','h','i'},
				{'t','s','u'},
				{'a','t','s'},
				{'h','a','p'},
				{'t','i','s'},
				{'w','h','s'}
		};

		String recoverSecret = recoverSecret(a);
		System.out.println(recoverSecret);
	}

	public static String recoverSecret(char[][] triplets) {
		List<String> list = new ArrayList<>();

		for (char[] cs : triplets) {
			System.out.println(cs);
			for (char c : cs) {
				if(list.indexOf(String.valueOf(c)) == -1) {
					list.add(String.valueOf(c));
				}
			}
		}
		for (char[] l : triplets) {
			fix(list,String.valueOf(l[1]),String.valueOf(l[2]));
			fix(list,String.valueOf(l[0]),String.valueOf(l[1]));
		}
		
		StringBuffer sb = new StringBuffer();
		for (String string : list) {
			sb.append(string);
		}

		return sb.toString();

	}


	private static void fix(List<String> list, String a, String b) {
		if(list.indexOf(a) > list.indexOf(b)) {
			list.remove(a);
			list.add(list.indexOf(b), String.valueOf(a));
		}

	}
}
