package demo06.Predicate;

import java.util.function.Predicate;

/*
 * 逻辑表达式：可以连接多个判断条件
 * &&：与运算符
 * ||：或运算符
 * ！：非运算符
 * 
 * 需求：判断一个字符串，有两个判断条件
 * 字符串长度是否大于5
 * 判断字符串中是否包含a
 * 两个条件必须同时满足，我们就可以使用&&运算符
 * 
 * predicate接口中有一个and方法，表示并且关系，也可以用于连接l两个判断条件
 * 
 * 方法内部的两个判断条件，也是使用&&运算符连接起来的
 */
public class Demo02Predicate_and {
	/*
	 * 定义一个方法，传递一个字符串
	 * 传递两个predicate接口
	 * 一个判断字符串长度是否大于5
	 * 一个判断字符串中是否包含a
	 * 两个条件必须同时满足
	 */
	public static boolean checkString(String s , Predicate<String> pre1 , Predicate<String> pre2) {
//		return pre1.test(s) && pre2.test(s);
		return pre1.and(pre2).test(s);//两行代码等价
		
		//或者or   pre1.test(s) || pre2.test(s);  与  pre1.or(pre2).test(s); 等价
		//非！	return !pre1.test() 与  return pre.negate().test(s);
	}
	public static void main(String[] args) {
		String s = "abcdef";
		boolean b = checkString(s, (String str)->{
			return str.length() > 5 ;
		}, (String str)->{
			return str.contains("a");
		});
		System.out.println(b);
	}
	
}
