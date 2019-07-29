package demo06.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo03Test {
	/*
	 * 定义一个方法
	 * 方法参数传递一个人员信息数组
	 * 传递两个Predicate接口，用于对数组信息进行过滤
	 * 把满足条件的信息存到ArrayList集合并返回
	 */
	public static ArrayList<String> filter(String [] arr, Predicate<String> pre1, Predicate<String> pre2){
		//定义一个集合，存储过滤后的信息
		ArrayList<String> list = new ArrayList<>();
		
		for(String str : arr) {
			//使用Predicate中的test（）方法对获取的字符串进行判断
			boolean b = pre1.and(pre2).test(str);
			if(b) {
				list.add(str);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		//定义一个字符串数组
		String [] array = {"迪丽热巴,女","古力娜扎,女","马儿扎哈,男","赵丽颖,女"};
		//调用filter方法，传递 字符串数组h和两个lambda表达式
		ArrayList<String> list = filter(array,(String str)->{
			//获取字符串中的性别
			return str.split(",")[1].equals("女");
		},(String str)->{
			return str.split(",")[0].length() == 4 ;
		});
		for(String s : list) {
			System.out.println(s);
		}
	}
}
