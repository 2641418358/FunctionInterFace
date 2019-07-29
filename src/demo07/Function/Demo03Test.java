package demo07.Function;

import java.util.function.Function;

/*
 * 题目：请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
 * 		String str = “赵丽颖，20”；
 * 分析：
 * 	1.将字符串截取数字年龄部分，得到字符串
 * 		Function<String , String> "赵丽颖，20" - > "20"
 *  2.将上一步字符串整数转换成int类型的数字
 *  	Function<String , Integer> "20" -> 20
 *  3.将上一步int数字累加100，得到结果int数字。
 *  	Function<Integer , Integer> 20 -> 120
 */
public class Demo03Test {
	/*
	 * 定义一个方法
	 * 参数传递包含姓名h和年龄的字符串
	 * 参数再传递3个Function接口用于类型转换
	 */
	public static int change(String s , Function<String	, String> fun1 , 
			Function<String , Integer> fun2 , Function<Integer , Integer> fun3) {
		//使用andThen方法把三个转换组合在一起
		return fun1.andThen(fun2).andThen(fun3).apply(s);
	}
	public static void main(String[] args) {
		//定义一个字符串
		String str = "赵丽颖,20";
		//调用change方法，传递一个字符串参数和3个lambda表达式
		int age = change(str,(String s)->{
			return s.split(",")[1];
		},(String s)->{
			return Integer.parseInt(s);
		},(Integer in)->{
			return in + 100;
		});
		System.out.println(age);
		
	}
}
