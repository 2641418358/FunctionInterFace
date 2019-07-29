package demo07.Function;

import java.util.function.Function;

/*
 * Function�ӿ���Ĭ�Ϸ���andThen������������ϲ���
 * ����
 * ��String���͡�123����ת��ΪInteger���ͣ���ת����Ľ����10
 * �����Ӻ��Integer����ת��ΪString����
 * 
 */
public class Demo02Function_andThen {
	/*
	 * ����һ������
	 * ������һ���ַ���������
	 * �����ٴ�����Function�Ľӿ�
	 * 		һ������ʹ��Function<String,Integer>
	 * 		һ������ʹ��Function<Integer,String>
	 */
	public static void change(String s, Function<String , Integer> fun1 , Function<Integer , String> fun2 ) {
		String ss = fun1.andThen(fun2).apply(s);
		System.out.println(ss);
	}
	public static void main(String[] args) {
		//����һ���ַ�������
		String s = "123";
		//����change�����������ַ���������lambda���ʽ
		change(s, (String str)->{
			//���ַ�������ת��ΪInteger�ټ�10
			return Integer.parseInt(str) + 10 ;
		} , (Integer i)->{
			//��Integer��10��ת��Ϊ�ַ�������
			return i + "";
		});
	}
}
