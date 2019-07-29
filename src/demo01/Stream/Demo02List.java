package demo01.Stream;

import java.util.ArrayList;
import java.util.List;
/*
 * 使用Stream流方式，遍历集合，对集合
 */
public class Demo02List {
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("张无忌");
		list.add("张三丰");
		list.add("王宝强");
		list.add("邓超");
		list.add("陈赫");
		
		//对list集合中元素进行过滤，只要一个姓张的元素，存储到一个新的集合中
		//对listA进行过滤，只要名字长度为3的元素
		list.stream()
			.filter(name -> name.startsWith("张"))
			.filter(name -> name.length() == 3)
			.forEach(name -> System.out.println(name));
		
	}
}
