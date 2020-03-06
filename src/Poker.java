import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poker {
	/**
	 * 模拟拖拉机纸牌游戏
	 */
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list = randomPokers();
//		List<String> subList1 = list.subList(0, list.size()/2);
//		List<String> subList2 = list.subList(list.size()/2, list.size());
//
//		Map<Integer, String> pokerOne = getPokerMap(subList1);
//		Map<Integer, String> pokerTwo = getPokerMap(subList2);
		
		Map<Integer, String> hashMap1 = new HashMap<Integer, String>();
		Map<Integer, String> hashMap2 = new HashMap<Integer, String>();
		
		goPut(hashMap1,hashMap2);
		
		
		goPlay(hashMap1,hashMap2);
		
		
	}

	private static void goPut(Map<Integer, String> map1, Map<Integer, String> map2) {
//		{1=a5, 2=a2, 3=d3, 4=b4, 5=b2, 6=c11, 7=a8, 8=d9, 9=a12, 10=b8, 11=c10, 12=a4, 13=a13, 
//		14=a10, 15=d10, 16=c8, 17=c9, 18=c7, 19=b6, 20=d5, 21=b9, 22=b12, 23=d13, 24=d6, 25=d12, 26=c6}
//		{1=a6, 2=a1, 3=d4, 4=a9, 5=d8, 6=b13, 7=c1, 8=d7, 9=b1, 10=b3, 11=b11, 12=d11, 13=c12, 
//		14=d2, 15=d1, 16=b10, 17=c4, 18=a11, 19=b7, 20=c5, 21=b5, 22=c3, 23=a7, 24=c2, 25=a3, 26=c13}
		map1.put(1,"a5");map1.put(2,"a2");map1.put(3,"d3");
		map1.put(4,"b4");map1.put(5,"b2");map1.put(6,"c11");
		map1.put(7,"a8");map1.put(8,"d9");map1.put(9,"a12");
		map1.put(10,"b8");map1.put(11,"c10");map1.put(12,"a4");
		map1.put(13,"a13");map1.put(14,"a10");map1.put(15,"d10");
		map1.put(16,"c8");map1.put(17,"c9");map1.put(18,"c7");
		map1.put(19,"b6");map1.put(20,"d5");map1.put(21,"b9");
		map1.put(22,"b12");map1.put(23,"d13");map1.put(24,"d6");
		map1.put(25,"d12");map1.put(26,"c6");
		
		map2.put(1,"a6");map2.put(2,"a1");map2.put(3,"d4");
		map2.put(4,"a9");map2.put(5,"d8");map2.put(6,"b13");
		map2.put(7,"c1");map2.put(8,"d7");map2.put(9,"b1");
		map2.put(10,"b3");map2.put(11,"b11");map2.put(12,"d11");
		map2.put(13,"c12");map2.put(14,"d2");map2.put(15,"d1");
		map2.put(16,"b10");map2.put(17,"c4");map2.put(18,"a11");
		map2.put(19,"b7");map2.put(20,"c5");map2.put(21,"b5");
		map2.put(22,"c3");map2.put(23,"a7");map2.put(24,"c2");
		map2.put(25,"a3");map2.put(26,"c13");
	}

	private static void goPlay(Map<Integer, String> pokerOne, Map<Integer, String> pokerTwo) {
		
		int countOne = 0;
		int countTwo = 0;
		int count = 0;
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		int contTime = 0;
		while(pokerOne.size()>0 || pokerTwo.size()>0) {
			System.out.println("这轮pokerOne为："+pokerOne);
			System.out.println("这轮pokerTwo为："+pokerTwo);
//			if(contTime == 5) {
//				System.out.println("contTime"+contTime);
//				return;
//			}
			contTime++;	//总循环次数
			countOne++;	//pokerOne取出个数
			countTwo++;	//pokerTwo取出个数
			count++;	//map插入次数
			if(pokerOne.size() <= 0) {
				System.out.println("one输");
				return;
			}
			map.put(count, pokerOne.get(countOne));
			System.out.println("onePut后map为："+map);
			if(check(map)) {	//如果插入后有相同的
				//按顺序整理pokerOne和pokerTwo的key
				for(int i=1;i<=pokerOne.size();i++) {
					countOne++;
					pokerOne.put(i, pokerOne.get(countOne));
					pokerOne.remove(countOne);
				}
				
				for(int i=1;i<=pokerTwo.size();i++) {
					countTwo++;
					pokerTwo.put(i, pokerTwo.get(countTwo));
					pokerTwo.remove(countTwo);
				}
				
				//把map放入pokerOne尾部
				int j=0;
				for(int i=pokerOne.size()+1;;i++) {
					pokerOne.put(i, map.get(++j));
					if(j == map.size()) {
						break;
					}
				}
				//清空map
				for (int i=1;;i++) {
					if(map.size()==0) {
						break;
					}
					map.remove(i);
				}
				System.out.println("这轮one赢整理完:"+pokerOne);
				countOne=0;
				countTwo=0;
				count=0;
				continue;
			}
			
			count++;	////map插入次数
			
			if(pokerTwo.size() <= 0) {
				System.out.println("two输");
				return;
			}
			map.put(count, pokerTwo.get(countTwo));
			System.out.println("twoPut后map为："+map);
			
			if(check(map)) {	//如果插入后有相同的
				//按顺序整理pokerOne和pokerTwo的key
				for(int i=1;i<=pokerOne.size();i++) {
					countOne++;
					pokerOne.put(i, pokerOne.get(countOne));
					pokerOne.remove(countOne);
				}
				
				
				for(int i=1;i<=pokerTwo.size();i++) {
					countTwo++;
					pokerTwo.put(i, pokerTwo.get(countTwo));
					pokerTwo.remove(countTwo);
				}
				
				//把map放入pokerTwo尾部
				int j=0;
				for(int i=1;;i++) {
					pokerTwo.put(i, map.get(++j));
					if(j == map.size()) {
						break;
					}
				}
				//清空map
				for (int i=pokerTwo.size()+1;;i++) {
					if(map.size()==0) {
						break;
					}
					map.remove(i);
				}
				System.out.println("这轮two赢整理完:"+pokerTwo);
				countOne=0;
				countTwo=0;
				count=0;
				continue;
			}
		}
		
		System.out.println("game over 一共循环:"+contTime+"次");
	}

	
	
	private static boolean check(Map<Integer, String> map) {
		int index = map.size();
		String substring = map.get(index);
		System.out.println("substring:"+substring);
		String checkStr1 = substring.substring(1);
		for(int i=1;i<index;i++) {
			String checkStr2 = map.get(i).substring(1);
			if(checkStr1.equals(checkStr2)) {
				return true;
			}
		}
		return false;
	}

	
	
	private static Map<Integer, String> getPokerMap(List<String> list) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		int count = 0;
		for (String key : list) {
			count++;
			map.put(count, key);
		}
		return map;
	}

	
	private static List<String> randomPokers() {
		String[] a = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
		String[] str = {"a","b","c","d"};
		
		String[] keyStr = new String[52];
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<a.length;j++) {
				keyStr[(i*13)+j] = str[i]+a[j];
			}
		}
		List<String> list = Arrays.asList(keyStr);
		Collections.shuffle(list);
		
		return list;
	}
}
