package demo06.Predicate;

import java.util.function.Predicate;

/*
 * java.util.function.Predicate<T>接口
 * 作用：对某种数据类型的数据进行判断，结果返回一个boolean值
 * Predicate接口中包含一个抽象方法：
 * boolean test（T t);用来指定数据类型数据进行判断方法
 * 		结果：
 * 			符合条件，返回true
 * 			不符合条件，返回false
 */
public class Demo0101Predicate {
	/*
	 * 定义一个方法
	 * 参数传递y一个String类型的字符串
	 * 传递一个Predicate接口，泛型String
	 * 使用Predicate中的方法test方法对字符串进行判断，并把判断的结果返回
	 */
	public static boolean checkString(String s , Predicate<String> pre) {
		return pre.test(s);
	}
	
	public static void main(String[] args) {
		//定义一个字符串
		String s = "abcde";
		//调用checkString方法对字符串进行校验，参数传递字符串和lambda表达式
		boolean b = checkString(s , (String str)->{
				return str.length() > 5 ;
		});
	}
}
