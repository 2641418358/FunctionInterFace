package demo04.Supplier;

import java.util.function.Supplier;

public class Demo02MaxNumber {
	public static int getMax(Supplier<Integer> sup) {
		return sup.get();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��int�������飬����ֵ
		int []arr = {100 , 0 , -50 , 80 , 64};
		//����getMax����
		int maxvalue = getMax(()->{
			int max = arr[0];
			//�������飬��ȡ����������Ԫ��
			for(int i : arr) {
				if( i > max )//���i>max�����滻max
					max = i ;
			}
			return max;
		});
		System.out.println(maxvalue);
	}

}
