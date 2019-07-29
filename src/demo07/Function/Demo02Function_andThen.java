package demo07.Function;

import java.util.function.Function;

/*
 * Function接口中默认方法andThen：用来进行组合操作
 * 需求：
 * 把String类型“123”，转换为Integer类型，将转换后的结果加10
 * 把增加后的Integer类型转换为String类型
 * 
 */
public class Demo02Function_andThen {
	/*
	 * 定义一个方法
	 * 参数传一个字符串的整数
	 * 参数再传两个Function的接口
	 * 		一个泛型使用Function<String,Integer>
	 * 		一个泛型使用Function<Integer,String>
	 */
	public static void change(String s, Function<String , Integer> fun1 , Function<Integer , String> fun2 ) {
		String ss = fun1.andThen(fun2).apply(s);
		System.out.println(ss);
	}
	public static void main(String[] args) {
		//定义一个字符串整数
		String s = "123";
		//调用change方法，传递字符串整数和lambda表达式
		change(s, (String str)->{
			//将字符串整数转换为Integer再加10
			return Integer.parseInt(str) + 10 ;
		} , (Integer i)->{
			//将Integer加10再转换为字符串整数
			return i + "";
		});
	}
}
