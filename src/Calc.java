import java.util.Stack;

public class Calc {
	/**
	 * 后缀表达式，又称逆波兰式，
	 * 指的是不包含括号，运算符放在两个运算对象的后面，
	 * 所有的计算按运算符出现的顺序，严格从左向右进行（不再考虑运算符的优先规则）。
	 */
	public static double evaluate(String expr) {
		if(expr == null || "".equals(expr))
		return 0;
		
		String[] str = expr.split(" ");
		if(str[0].contains(".")) 
		return Double.valueOf(str[0]);
		
		String check = "+-*/";
		
		Stack<String> stack = new Stack<>();
		for (String s : str) {
			if(!check.contains(s)) {
				stack.push(s);
			}else {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (s) {
				case "+":stack.push(String.valueOf(a+b));break;
				case "-":stack.push(String.valueOf(b-a));break;
				case "*":stack.push(String.valueOf(a*b));break;
				case "/":stack.push(String.valueOf(b/a));break;
				}
			}
		}
	    return Integer.valueOf(stack.pop());
	  }

	public static void main(String[] args) {
		String string = "5 1 2 + 4 * + 3 -";
		double evaluate = Calc.evaluate(string);
		System.out.println(evaluate);
	}
}
