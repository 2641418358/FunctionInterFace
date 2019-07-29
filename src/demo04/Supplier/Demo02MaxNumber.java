package demo04.Supplier;

import java.util.function.Supplier;

public class Demo02MaxNumber {
	public static int getMax(Supplier<Integer> sup) {
		return sup.get();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个int类型数组，并赋值
		int []arr = {100 , 0 , -50 , 80 , 64};
		//调用getMax方法
		int maxvalue = getMax(()->{
			int max = arr[0];
			//遍历数组，获取数组中其他元素
			for(int i : arr) {
				if( i > max )//如果i>max，则替换max
					max = i ;
			}
			return max;
		});
		System.out.println(maxvalue);
	}

}
