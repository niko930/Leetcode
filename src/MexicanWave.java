import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {
	/**
	 * wave("hello") => ["Hello", "hEllo", "heLlo", "helLo", "hellO"]
	 */
	private static String[] wave(String str) {
		char[] c = str.toCharArray();
		System.out.println(c.length);
		int countStr = 0;
		for (int i=0;i<c.length;i++) {
			if(" ".equals(String.valueOf(c[i]))) {
				continue;
			}
			countStr++;
		}
		System.out.println(countStr);

		String[] chs = new String[c.length];

		for(int i=0;i<chs.length;i++) {
			chs[i] = String.valueOf(c[i]);
		}
		String[] strings = new String[c.length];

		for(int i=0;i<strings.length;i++) {
			strings[i] = "";
		}
		for(int i=0;i<chs.length;i++) {
			int x=0,y=0;

			if(" ".equals(chs[i])) {
				continue;
			}
			chs[i] = chs[i].toUpperCase();
			System.out.println(chs[i]);

			while(strings[i].length() != c.length) {
				System.out.println("strings[i].length()"+strings[i].length());
				System.out.println(y);
				strings[i] += chs[y++];
			}
			chs[i] = chs[i].toLowerCase();
		}

		List<String> strList= Arrays.asList(strings);
		List<String> strListNew=new ArrayList<>();        

		for (int i = 0; i <strList.size(); i++) {  

			if (strList.get(i)!=null&&!strList.get(i).equals("")){   

				strListNew.add(strList.get(i));}      

		}       
		 String[] strNewArray = strListNew.toArray(new String[strListNew.size()]); 

		System.out.println(Arrays.toString(strNewArray));

		return strNewArray;
	}

	public static void main(String[] args) {
		String str = " hello im dog ";
		String[] wave = MexicanWave.wave(str);
		System.out.println(Arrays.toString(wave));
	}
}
