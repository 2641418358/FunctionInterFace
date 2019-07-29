package demo05.Consumer;

import java.util.function.Consumer;

/*
 * Consumer接口的默认方法andThen
 * 作用：需要两个Consumer接口，可以将两个Consumer接口组合在一起，对数据进行消费
 * 例如：
 * Consumer《String>con1
 * Consumer<String>con2
 * String s = "hello"
 * con1.accpet(s)
 * con2.accpet(s)
 * 连接两个Consumer接口
 * con1.andThen(con2).accpet(s)谁写前面谁先消费
 */
public class Demo02AndThen {
	//定义一个方法，方法参数传递一个字符串h和两个Consumer接口，泛型使用字符串
	public static void method(String s , Consumer<String> con1 , Consumer<String> con2) {
//		con1.accept(s);
//		con2.accept(s);
		//可以使用andThen方法
		con1.andThen(con2).accept(s);
	}
	public static void main(String[] args) {
		method("hello",(t)->{
			System.out.println(t.toUpperCase());
						},(t)->{
			System.out.println(t.toLowerCase());
						});
	}
}
