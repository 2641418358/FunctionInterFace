package demo04.Supplier;

import java.util.function.Supplier;

/*
 * 常用函数接口
 * 无参方法：T get()。用来获取一个泛型参数指定类型的对象数据
 * Supplier<T>接口被称为生产型接口，指定接口的泛型是什么类型，那么接口中get方法就会生产什么类型的数据
 */
public class Demo01Supplier {
	//定义一个方法，方法传递接口Supplier<T>接口，泛型指String ，get就会返回字符串
	public static String getString(Supplier<String> sup) {
		return sup.get();
	}
	public static void main(String[] args) {
		//调用getString方法，方法参数是Supplier是一个函数接口，所以可以使用lambda表达式
		String s = getString(()->{
			//生产一个字符窗，并返回
			return "胡歌";
		});
		System.out.println(s);
	}
}
