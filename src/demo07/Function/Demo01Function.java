package demo07.Function;

import java.util.function.Function;

/*
 * java.util.function.Function<T,R>�ӿ���������һ�����͵����ݵõ���һ�����͵�����
 * ǰ��Ϊǰ������������Ϊ��������
 * Function�ӿ�������Ҫ�ĳ��󷽷�Ϊ��R apply(T t),��������T�Ĳ�������ȡ����R�Ľ��
 * ʹ�õĳ������磺��Sting����ת��ΪInteger����
 */
public class Demo01Function {
	/*
	 * ����һ������
	 * �����Ĵ��ݲ���һ���ַ������͵Ĳ���
	 * �����Ĳ�������һ��Function�ӿڣ�����ʹ�á�String��Integer��
	 * ʹ��Function�ӿ��еķ���apply�����ַ������͵�������ת��ΪInteger���͵�����
	 */
	public static void change(String s, Function<String , Integer> fun) {
//		Integer in = fun.apply(s);
		int in = fun.apply(s);//�Զ����� Integer ->int
		System.out.println(in);
	}
	public static void main(String[] args) {
		//����һ���ַ������͵�����
		String s = "1234";
		//����change�����������ַ������͵������ͣ�lambda���ʽ
		change(s,(String str)->{
			//ת��ΪInteger����
			return Integer.parseInt(str);
		});
	}
}
