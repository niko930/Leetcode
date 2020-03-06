public class TestNumber {
	public static void main(String[] args) {
		//总记录数
		int rows=24;
		//每页显示的记录数
		int pageSize=5;
		//页数
		int pageSum=(rows+pageSize-1)/pageSize;

		System.out.println(pageSum);

		// 总记录数
		int rowss = 20;
		// 每页显示的记录数
		int pageCount = 5;
		// 页数
		int sum = (rowss - 1) / pageCount + 1;
		System.out.println("页数：" + sum);// 页数：4

	}
}
