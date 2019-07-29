package demo07.Function;

import java.util.function.Function;

/*
 * ��Ŀ����ʹ��Function���к���ģ�͵�ƴ�ӣ�����˳����Ҫִ�еĶ����������Ϊ��
 * 		String str = ������ӱ��20����
 * ������
 * 	1.���ַ�����ȡ�������䲿�֣��õ��ַ���
 * 		Function<String , String> "����ӱ��20" - > "20"
 *  2.����һ���ַ�������ת����int���͵�����
 *  	Function<String , Integer> "20" -> 20
 *  3.����һ��int�����ۼ�100���õ����int���֡�
 *  	Function<Integer , Integer> 20 -> 120
 */
public class Demo03Test {
	/*
	 * ����һ������
	 * �������ݰ�������h��������ַ���
	 * �����ٴ���3��Function�ӿ���������ת��
	 */
	public static int change(String s , Function<String	, String> fun1 , 
			Function<String , Integer> fun2 , Function<Integer , Integer> fun3) {
		//ʹ��andThen����������ת�������һ��
		return fun1.andThen(fun2).andThen(fun3).apply(s);
	}
	public static void main(String[] args) {
		//����һ���ַ���
		String str = "����ӱ,20";
		//����change����������һ���ַ���������3��lambda���ʽ
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
