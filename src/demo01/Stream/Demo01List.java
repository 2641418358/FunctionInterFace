package demo01.Stream;

import java.util.ArrayList;
import java.util.List;

/*
 * 用传统的的方式，遍历集合，对集合的数据进行过滤
 */
public class Demo01List {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("张无忌");
		list.add("张三丰");
		list.add("王宝强");
		list.add("邓超");
		list.add("陈赫");
		//对list集合中元素进行过滤，只要一个姓张的元素，存储到一个新的集合中
		List<String> listA = new ArrayList<String>();
		for(String str : list) {
			if(str.startsWith("张"))
				listA.add(str);
		}
		
		//对listA进行过滤，只要名字长度为3的元素
		List<String> listB = new ArrayList<String>();
		for(String str : listA) {
			if(str.length() == 3)
				listB.add(str);
		}
		
		for(String s : listB) {
			System.out.println(s);
		}
		
	}
}
